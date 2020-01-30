package com.iotyun.manager.controller;
  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iotyun.manager.common.Result;
import com.iotyun.manager.common.ResultCode;
import com.iotyun.manager.entity.Device;
import com.iotyun.manager.entity.Sensor;
import com.iotyun.manager.requestvo.OperateVo;
import com.iotyun.manager.service.inter.SensorService;
 
 

@RestController
@RequestMapping(value = "/sensor")
public class SensorController {
	@Autowired
	private SensorService sensorService;


	@PostMapping("/addSensor")
	public Result addSensor(@RequestBody Sensor sensor) {

		sensor.setValueCons(0);
	 
		
		return Result.success(sensorService.addSensor(sensor));
	}
 

    @GetMapping("/all")
	public Result fetchSensor(int deviceId,Integer page) {
    	System.out.println("fetchSensor at page"+page+" for device" +deviceId);
		return Result.success(sensorService.getSensorOnPage(deviceId,page));
	}
    @GetMapping("/data")
	public Result fetchSensorDatas(int sensorId, Integer page) {

		return Result.success(sensorService.getSensorDatasOnPage(sensorId,page));
	}
 
    
    @PostMapping("/operate")
	public Result operate(@RequestBody  OperateVo operate) {

		return Result.success(sensorService.operateRemoteSensor(operate));
	}
    
	@PostMapping("/updateSensor")
	public Result updateSensor(@RequestBody Sensor sensor) {

		if(sensorService.updateSensor(sensor)){
			return Result.success(true);
		}else{
			return Result.error(ResultCode.ERROR);
		}
	}
	
	@GetMapping("/deleteSensor")
	public Result deleteSensor(int sensorId) {
		System.out.println("deleteSensor  for Sensor" +sensorId);
		if(sensorService.deleteSensor(sensorId)){
			return Result.success(true);
		}else{
			return Result.error(ResultCode.ERROR);
		}
	}
	@GetMapping("/getSensorDatas")
	public Result getSensorDatas(int sensorId,Integer page) {
		System.out.println("getSensorDatas  for Sensor" +sensorId);
		return Result.success(sensorService.getSensorDatasOnPage(sensorId,page));
	}
	
	@GetMapping("/refreshAllSensorDatas")
	public Result refreshAllSensorDatas(int deviceId,String deviceSn) {
		System.out.println("refreshAllSensorDatas  for deviceId" +deviceId+deviceSn);
		return Result.success(sensorService.refreshAllSensorDatas(deviceId, deviceSn));
	}
	@GetMapping("/refreshOneSensorData")
	public Result refreshOneSensorData(int sensorId) {
		System.out.println("refreshOneSensorData  for sensorId" +sensorId);
		return Result.success(sensorService.refreshOneSensorData(sensorId));
	}
}
