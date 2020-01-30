package com.iotyun.manager.netty;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RestController;

import com.iotyun.manager.SpringUtil;
import com.iotyun.manager.entity.Sensor;
import com.iotyun.manager.requestvo.OperateVo;
import com.iotyun.manager.service.impl.DeviceServiceImpl;
import com.iotyun.manager.service.inter.DeviceService;

import io.netty.channel.Channel;
import io.netty.channel.ChannelId;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;
@RestController
public class ConnectManager {
	
	@Autowired
	public DeviceService deviceService;
	
	
	//保留所有与服务器建立连接的channel对象
    private static ChannelGroup channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
	private static ConnectManager instance;  
    private ConnectManager (){
    	
    }   
    public static ConnectManager getInstance(){    //对获取实例的方法进行同步
      if (instance == null){
          synchronized(ConnectManager.class){
              if (instance == null)
                  instance = new ConnectManager(); 
          }
      }
      return instance;
    }
    //维护一个在线设备序列号和连接实例ID的映射关系
    //  channelId -> SN
    private Map<ChannelId,String> channelConnecting = new ConcurrentHashMap<ChannelId,String>();
    
    //维护一个在线设备序列号和设备状态关系
    // SN -> DeviceState
    private Map<String,DeviceState> onlineDevicesState = new ConcurrentHashMap<String,DeviceState>();
    
    
    public Map<String, DeviceState> getOnlineDevicesState() {
		return onlineDevicesState;
	}
	public void setOnlineDevicesState(Map<String, DeviceState> onlineDevicesState) {
		this.onlineDevicesState = onlineDevicesState;
	}
	public void putOnLineDeviceSn(String sn,ChannelId channelId,DtuServerHandler mServerHandler){
    	
    	DeviceState mDeviceState = new DeviceState();
    	mDeviceState.setOnline(true);
    	mDeviceState.setSn(sn);
    	mDeviceState.setCurrentServerHandler(mServerHandler);
    	
    	deviceService = (DeviceService) SpringUtil.getBean(DeviceServiceImpl.class);
    	System.out.println("putOnLineDeviceSn "+sn);
    	
    	channelConnecting.put(channelId, sn);
    	Integer userId = deviceService.updateDeviceConnect(mDeviceState,true);
    	

    	mDeviceState.setUserId(userId);
    	onlineDevicesState.put(sn, mDeviceState);
    	
    	 
    }
    
    public Map<ChannelId, String> getChannelConnecting() {
		return channelConnecting;
	}
	public void setChannelConnecting(Map<ChannelId, String> channelConnecting) {
		this.channelConnecting = channelConnecting;
	}
	public void removeDeviceSn(ChannelId channelId){
		String sn = channelConnecting.get(channelId);
		if(sn == null){
			System.out.println("removeDeviceSn channelId sn == null");
			return ;
		}
    	if(deviceService == null){
        	deviceService = (DeviceService) SpringUtil.getBean(DeviceServiceImpl.class);	
    	}
    	System.out.println("removeDeviceSn "+ channelConnecting.get(channelId));
    	
    	DeviceState mDeviceState = new DeviceState();
 
    	mDeviceState.setSn(sn);
    	if(deviceService != null){
    		System.out.println(sn+"的设备掉线了");
        	deviceService.updateDeviceConnect(mDeviceState,false);
    	}else{
    		System.out.println(sn+"的设备掉线了 ,但是数据库没有更新。");
    	}

    	channelConnecting.remove(channelId);
    	onlineDevicesState.remove(sn);
    }
    public void addChannel(Channel cn){
    	 
    	channelGroup.add(cn);
    }
	public String fireOperateRemoteSensor(OperateVo operate,Sensor sensor, boolean isBitType) {
		System.out.println("fireOperateRemoteSensor on "+operate.deviceSn);
		ChannelId channelId = null;
		for(ChannelId key: channelConnecting.keySet()){
	        if(channelConnecting.get(key).equals(operate.deviceSn)){
	        	channelId = key;
	        	break;
	        }
	    }
		if(channelId == null){
			return "所属设备当前未连接";
		}
		Channel channel = channelGroup.find(channelId);
		if(channel == null){
			return "所属设备当前未连接";
		}
		SendFormatCode sendFormatCode = new SendFormatCode(channel);
		
		if(isBitType){
			sendFormatCode.sendBitWrite(sensor.getDeviceOffset(),operate.isOpen);
		}else{
			sendFormatCode.sendRegisterWrite(sensor.getDeviceOffset(), (int)operate.getValue());
		}
		return "操作已发送";
	}
    
  
}
