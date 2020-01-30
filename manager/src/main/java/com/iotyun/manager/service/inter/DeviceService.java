package com.iotyun.manager.service.inter;

import java.util.List;

import com.iotyun.manager.entity.Device;
import com.iotyun.manager.netty.DeviceState;
 
public interface DeviceService {
	
	public int addDevice(Device device);
	public boolean updateDevice(Device device);
	public boolean deleteDevice(int deviceId);
	
	public Device getDeviceById(Integer id);
	public Integer updateDeviceConnect(DeviceState mDeviceState, boolean isOnline);
	public List<Device> getDeviceOnPage(int userId, Integer page);
	public Device getDeviceBySn(String sn);
	
 
}
