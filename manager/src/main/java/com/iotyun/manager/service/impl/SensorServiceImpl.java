package com.iotyun.manager.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotyun.manager.entity.Device;
import com.iotyun.manager.entity.Sensor;
import com.iotyun.manager.entity.SensorData;
import com.iotyun.manager.entity.SensorDataExample;
import com.iotyun.manager.entity.SensorExample;
import com.iotyun.manager.entity.SensorExample.Criteria;
import com.iotyun.manager.mapper.SensorDataMapper;
import com.iotyun.manager.mapper.SensorMapper;
import com.iotyun.manager.mapper.UserAuthMapper;
import com.iotyun.manager.mapper.UserMapper;
import com.iotyun.manager.modbus4j.BatchRead;
import com.iotyun.manager.modbus4j.BatchResults;
import com.iotyun.manager.modbus4j.ModbusFactory;
import com.iotyun.manager.modbus4j.ModbusMaster;
import com.iotyun.manager.modbus4j.code.DataType;
import com.iotyun.manager.modbus4j.exception.ErrorResponseException;
import com.iotyun.manager.modbus4j.exception.ModbusTransportException;
import com.iotyun.manager.modbus4j.locator.BaseLocator;
import com.iotyun.manager.modbus4j.msg.ModbusRequest;
import com.iotyun.manager.modbus4j.msg.ModbusResponse;
import com.iotyun.manager.modbus4j.msg.ReadCoilsRequest;
import com.iotyun.manager.modbus4j.msg.ReadCoilsResponse;
import com.iotyun.manager.modbus4j.msg.ReadHoldingRegistersRequest;
import com.iotyun.manager.modbus4j.msg.ReadHoldingRegistersResponse;
import com.iotyun.manager.modbus4j.msg.ReadResponse;
import com.iotyun.manager.modbus4j.msg.WriteCoilRequest;
import com.iotyun.manager.modbus4j.msg.WriteRegisterRequest;
import com.iotyun.manager.netty.ConnectManager;
import com.iotyun.manager.netty.DeviceState;
import com.iotyun.manager.requestvo.OperateVo;
import com.iotyun.manager.service.inter.AuthService;
import com.iotyun.manager.service.inter.DeviceService;
import com.iotyun.manager.service.inter.SensorService;
import com.iotyun.manager.service.inter.UserService;
 
 
 

 

@Service
public class SensorServiceImpl implements SensorService {

	@Autowired
	private SensorMapper sensorMapper;
	@Autowired
	private SensorDataMapper sensorDataMapper;
	@Autowired
	private DeviceService deviceService;
	@Override
	public int addSensor(Sensor sensor) {
		try {
			int key = sensorMapper.insert(sensor);//useGeneratedKeys="true" keyProperty="Id" 
			if (key > 0) {
				return sensor.getId();
			}
			return -1;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	public boolean getSensorDatas(int sensorid) {
		try {
			int key = 2; 
			if (key > 0) {
				return true;
			}
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Sensor> getSensors() {
		try {
			int key = 2; 
			if (key > 0) {
				return null;
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Sensor> getSensorOnPage(int deviceId, Integer page) {
		// TODO Auto-generated method stub
		SensorExample sensorExample = new SensorExample();
		sensorExample.setStartRow(page);
		sensorExample.setPageSize(20);
		Criteria criteria = sensorExample.createCriteria();
		criteria.andDeviceidEqualTo(deviceId);
		List<Sensor> list = sensorMapper.selectByExample(sensorExample);
		return list;
	}

	@Override
	public List<SensorData> getSensorDatasOnPage(int sensorId, Integer page) {
		SensorDataExample sensorDataExample = new SensorDataExample();
		sensorDataExample.setStartRow(page);
		sensorDataExample.setPageSize(20);
		com.iotyun.manager.entity.SensorDataExample.Criteria criteria =  sensorDataExample.createCriteria();
		criteria.andSensoridEqualTo(sensorId);
		List<SensorData> list = sensorDataMapper.selectByExample(sensorDataExample);
		return list;
	}

	@Override
	public String operateRemoteSensor(OperateVo operate) {
		Sensor sensor = sensorMapper.selectByPrimaryKey(operate.getSensorId());


		Map<String, DeviceState> maper= ConnectManager.getInstance().getOnlineDevicesState();
		DeviceState mDeviceState = maper.get(operate.deviceSn);
		if(mDeviceState != null && mDeviceState.getCurrentServerHandler()!=null){
	       
	        ModbusFactory modbusFactory = new ModbusFactory();
	        ModbusMaster master = modbusFactory.createTcpMaster(mDeviceState.getCurrentServerHandler());

	        try {
	        	ModbusRequest request;
	    		if(operate.isCoil()){
	    			request = new WriteCoilRequest(operate.getSlaveId(),sensor.getDeviceOffset(), operate.isOpen());
	    		}else{
	    			request = new WriteRegisterRequest(operate.getSlaveId(),sensor.getDeviceOffset(), operate.getValue());
	    		}
 
	    		ModbusResponse response = master.send(request);

	            if (response.isException()){
	            	
	                System.out.println("Exception response: message=" + response.getExceptionMessage());
	            	return "操作完成 返回值异常";
	            }else
	                System.out.println("Success");
	    		if(operate.isCoil()){
	    			System.out.println("开关："+String.valueOf(operate.isOpen));
	    			sensor.setValue(String.valueOf(operate.isOpen));
	    		}else{
	    			sensor.setValue(String.valueOf(operate.getValue()));
	    		}
	    		sensorMapper.updateByPrimaryKey(sensor);
	        }
	        catch (ModbusTransportException e) {
	            e.printStackTrace();
	            return "操作异常";
	        }
	        return "操作完成";
		}
		
		return "设备不在线或者断开连接";
	}

	@Override
	public boolean updateSensor(Sensor sensor) {
		try {
			int recodenum = sensorMapper.updateByPrimaryKey(sensor);
			if (recodenum > 0) {
				return true;
			}
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteSensor(int sensorId) {
		try {
			int res = sensorMapper.deleteByPrimaryKey(sensorId);
			if (res > 0) {
				return true;
			}
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public String refreshAllSensorDatas(int deviceId,String sn) {
		// TODO Auto-generated method stub
		if(sn == null){
			return "设备序列号没有传";
		}
		
		Map<String, DeviceState> maper= ConnectManager.getInstance().getOnlineDevicesState();
		DeviceState mDeviceState = maper.get(sn);
		if(mDeviceState != null && mDeviceState.getCurrentServerHandler()!=null){
			Device device;
			if(deviceId != 0){
				device = deviceService.getDeviceById(deviceId);
			}else{
				device = deviceService.getDeviceBySn(sn);
			}
		
			SensorExample sensorExample = new SensorExample();
			Criteria criteria = sensorExample.createCriteria();
			criteria.andDeviceidEqualTo(device.getId());
			List<Sensor> list = sensorMapper.selectByExample(sensorExample);
		    if(list.isEmpty()){
		    	return "此在线设备没有设置传感器";
		    }
		    
	        ModbusFactory modbusFactory = new ModbusFactory();
	        ModbusMaster master = modbusFactory.createTcpMaster(mDeviceState.getCurrentServerHandler());
	        int slaveId = device.getDeviceadd();
            BatchRead<String> batchRead = new BatchRead<String>();
            System.out.println("开始打包读传感请求数据");
            for(Sensor sensor:list){
            	if(sensor.getType() == 1){//开关线圈类型
            		batchRead.addLocator(String.valueOf(sensor.getId()), BaseLocator.coilStatus(slaveId, sensor.getDeviceOffset()));
            	}else{
    	            batchRead.addLocator(String.valueOf(sensor.getId()),
    	                    BaseLocator.holdingRegister(slaveId,sensor.getDeviceOffset(), DataType.TWO_BYTE_INT_SIGNED));
            	}
            	 
            }


	        BatchResults<String> results;
			try {
				results = master.send(batchRead);
			} catch (ModbusTransportException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "刷新设备传感数据异常";
			} catch (ErrorResponseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "刷新设备传感数据异常";
			}
	        System.out.println("开始插入数据库 传感数据");
            for(Sensor sensor:list){
            	 //开始写入返回数据
    			SensorData sensorData = new SensorData();
    			sensorData.setDeviceAddr(device.getDeviceadd());
    			sensorData.setDeviceOffset(sensor.getDeviceOffset());
    			sensorData.setSensorid(sensor.getId());
    			sensorData.setValueCons(1);
    			sensorData.setUnit(sensor.getUnit());
        		sensorData.setValue(String.valueOf(results.getIntValue(String.valueOf(sensor.getId()))));
    			sensorDataMapper.insert(sensorData);
    			//更新传感器 当前值
    			sensor.setValue(sensorData.getValue());
    			sensorMapper.updateByPrimaryKey(sensor);
            }
            System.out.println("刷新设备传感数据完成");
            return "刷新设备传感数据完成";
		}
		return "设备不在线";
	}
 
	@Override
	public String refreshOneSensorData(int sensorId) {
		Sensor sensor = sensorMapper.selectByPrimaryKey(sensorId);
		
		Device device = deviceService.getDeviceById(sensor.getDeviceid());
		Map<String, DeviceState> maper= ConnectManager.getInstance().getOnlineDevicesState();
		DeviceState mDeviceState = maper.get(device.getSnNumber());
		boolean isCoilType = sensor.getType() == 1;
		if(mDeviceState != null && mDeviceState.getCurrentServerHandler()!=null){
	       
	        ModbusFactory modbusFactory = new ModbusFactory();
	        ModbusMaster master = modbusFactory.createTcpMaster(mDeviceState.getCurrentServerHandler());
	        ReadResponse response;
	        try {
	        	ModbusRequest request;
	    		if(isCoilType){
	    			request = new ReadCoilsRequest(device.getDeviceadd(),sensor.getDeviceOffset(),1);
	    		}else{
	    			request = new ReadHoldingRegistersRequest(device.getDeviceadd(),sensor.getDeviceOffset(),1);
	    		}
 
	    		response = (ReadResponse) master.send(request);

	            if (response.isException()){
	            	
	                System.out.println("Exception response: message=" + response.getExceptionMessage());
	            	return "更新传感器操作完成 返回值异常";
	            }else
	                System.out.println("Success");
	        }
	        catch (ModbusTransportException e) {
	            e.printStackTrace();
	            return "更新传感器操作异常";
	        }
	        //开始写入返回数据
			SensorData sensorData = new SensorData();
			sensorData.setDeviceAddr(device.getDeviceadd());
			sensorData.setDeviceOffset(sensor.getDeviceOffset());
			sensorData.setSensorid(sensorId);
			sensorData.setUnit(sensor.getUnit());
			sensorData.setValueCons(1);
    		if(isCoilType){
    			boolean value = response.getBooleanData()[0];
    			sensorData.setValue(String.valueOf(value));
    			 System.out.println("拉取的开关值为"+value);
    		}else{
    			short value = response.getShortData()[0];
    			sensorData.setValue(String.valueOf(value));
    			System.out.println("拉取的寄存器值为"+value);
    		}
			sensorDataMapper.insert(sensorData);
			
			
			//更新传感器 当前值
			sensor.setValue(sensorData.getValue());
			sensorMapper.updateByPrimaryKey(sensor);
	        return sensorData.getValue();
		}
		
		return "设备不在线";
	}

 

 

}
