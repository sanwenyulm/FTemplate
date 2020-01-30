 package com.iotyun.manager.requestvo;

public class OperateVo {
	public int sensorId;
	
	public int deviceId;
	
	public String deviceSn;
	
	public int value;
	
	public boolean isCoil;
	
	public boolean isOpen;

	public int slaveId = 1;
	 
	public boolean isCoil() {
		return isCoil;
	}

	public void setCoil(boolean isCoil) {
		this.isCoil = isCoil;
	}

	public int getSlaveId() {
		return slaveId;
	}

	public void setSlaveId(int slaveId) {
		this.slaveId = slaveId;
	}

	public int getSensorId() {
		return sensorId;
	}

	public void setSensorId(int sensorId) {
		this.sensorId = sensorId;
	}

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceSn() {
		return deviceSn;
	}

	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	
	

}
