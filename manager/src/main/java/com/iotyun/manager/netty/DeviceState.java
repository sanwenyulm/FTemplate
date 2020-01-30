package com.iotyun.manager.netty;

public class DeviceState {
	Integer userId;
	String deviceIp;
	String sn;
	String port;
	DtuServerHandler currentServerHandler;
	
	public DtuServerHandler getCurrentServerHandler() {
		return currentServerHandler;
	}
	public void setCurrentServerHandler(DtuServerHandler currentServerHandler) {
		this.currentServerHandler = currentServerHandler;
	}
	boolean isOnline;
	
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getDeviceIp() {
		return deviceIp;
	}
	public void setDeviceIp(String deviceIp) {
		this.deviceIp = deviceIp;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public boolean isOnline() {
		return isOnline;
	}
	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	} 
	
	

}
