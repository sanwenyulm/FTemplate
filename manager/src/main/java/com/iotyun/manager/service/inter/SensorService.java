package com.iotyun.manager.service.inter;

import java.util.List;

import com.iotyun.manager.entity.Sensor;
import com.iotyun.manager.entity.SensorData;
import com.iotyun.manager.requestvo.OperateVo;
 

public interface SensorService {

	int addSensor(Sensor sensor);
    
    boolean getSensorDatas(int sensorid);
    
     List<Sensor> getSensors();

     List<Sensor> getSensorOnPage(int deviceId, Integer page);

     List<SensorData> getSensorDatasOnPage(int sensorId, Integer page);

	String operateRemoteSensor(OperateVo operate);

	boolean updateSensor(Sensor sensor);

	boolean deleteSensor(int sensorId);
	
	String refreshAllSensorDatas(int deviceId,String sn);
	
	String refreshOneSensorData(int sensorId);
}
