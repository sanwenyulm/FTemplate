package com.iotyun.manager.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotyun.manager.entity.Device;
import com.iotyun.manager.entity.DeviceExample;
 
import com.iotyun.manager.entity.DeviceExample.Criteria;
import com.iotyun.manager.mapper.DeviceMapper;
import com.iotyun.manager.netty.DeviceState;
import com.iotyun.manager.service.inter.DeviceService;

 

@Service
public class DeviceServiceImpl implements DeviceService {

	@Autowired
	private DeviceMapper deviceMapper;

	@Override
	public int addDevice(Device device) {

		try {
			int key = deviceMapper.insert(device);//useGeneratedKeys="true" keyProperty="Id" 
			if (key > 0) {
				return device.getId();
			}
			return -1;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	public boolean updateDevice(Device device) {
		try {
			int recodenum = deviceMapper.updateByPrimaryKey(device);
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
	public boolean deleteDevice(int deviceId) {
		
		try {
			int res = deviceMapper.deleteByPrimaryKey(deviceId);
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
	public Device getDeviceById(Integer id) {
		// TODO Auto-generated method stub
		return deviceMapper.selectByPrimaryKey(id);
	}
	/**
	 * device isOnline 对应status 1  非 对应0
	 */
	@Override
	public Integer updateDeviceConnect(DeviceState mDeviceState, boolean isOnline) {
		String sn = mDeviceState.getSn();
		DeviceExample deviceExample = new DeviceExample();
		Criteria criteria = deviceExample.createCriteria();
		criteria.andSnNumberLike(sn);
		 
		//设备活跃时判断设备是否注册
		List<Device> list = deviceMapper.selectByExample(deviceExample);

		
		Device device = null;
		System.out.println("设备:"+sn+"在线？"+isOnline);
		if(list == null ||list!=null && list.size() == 0){
			device = new Device();
			System.out.println("记录此未注册设备");
			device.setName("未注册设备");
			device.setDescription("未注册设备，可在编辑内为此设备注册");
			device.setSnNumber(sn);
			device.setUserid(1);
			device.setMonitorid(1);
			device.setDeviceadd(1);
			device.setCreateAt(new Date());
			device.setStatus(0);
			device.setDeviceState(isOnline?1:0);
			deviceMapper.insertSelective(device);
		}else{
			device =  list.get(0);
			device.setDeviceState(isOnline?1:0);
			deviceMapper.updateByExample(device, deviceExample);
		}

        return device.getUserid();
	}
	/**
	 *     
	 *     <if test="startRow != null and pageSize != null and pageSize != 0">  
	       limit #{startRow,jdbcType=INTEGER}, #{pageSize,jdbcType=INTEGER}  
	       </if> 
	       /** 
 
			private Integer startRow;  
			  
			 
			private Integer pageSize;  
			  
			public Integer getStartRow() {  
			    return startRow;  
			}  
			  
			public void setStartRow(Integer startRow) {  
			    this.startRow = startRow;  
			}  
			  
			public Integer getPageSize() {  
			    return pageSize;  
			}  
			  
			public void setPageSize(Integer pageSize) {  
			    this.pageSize = pageSize;  
			}  
	 */

	@Override
	public List<Device> getDeviceOnPage(int userId, Integer page) {
		DeviceExample deviceExample = new DeviceExample();
		deviceExample.setStartRow(page);
		deviceExample.setPageSize(20);
		
		Criteria criteria = deviceExample.createCriteria();
		criteria.andUseridEqualTo(userId);
		
		List<Device> list = deviceMapper.selectByExample(deviceExample);
		return list;
	}

	@Override
	public Device getDeviceBySn(String sn) {
		// TODO Auto-generated method stub
		DeviceExample deviceExample = new DeviceExample();
		Criteria criteria = deviceExample.createCriteria();
		criteria.andSnNumberLike(sn);
 
		List<Device> list  = deviceMapper.selectByExample(deviceExample);
 
		
	    return list.get(0);
		
	}

 

 


}
