package com.iotyun.manager.controller;

import java.time.Duration;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

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
import com.iotyun.manager.service.inter.DeviceService;
 

@RestController
@RequestMapping(value = "/device")
public class DeviceController {
	@Autowired
	private DeviceService deviceService;


	@PostMapping("/addDevice")
	public Result addDevice(@RequestBody Device device) {
		device.setStatus(0);
		return Result.success(deviceService.addDevice(device));
	}
	
	@PostMapping("/updateDevice")
	public Result updateDevice(@RequestBody Device device) {

		if(deviceService.updateDevice(device)){
			return Result.success(true);
		}else{
			return Result.error(ResultCode.ERROR);
		}
	}
	
	@GetMapping("/deleteDevice")
	public Result deleteDevice(int deviceId) {

		if(deviceService.deleteDevice(deviceId)){
			return Result.success(true);
		}else{
			return Result.error(ResultCode.ERROR);
		}
	}
 
    @GetMapping("/all")
	public Result fetchDevices(int userId,Integer page) {
    	System.out.println("fetchSensor at page"+page+" for device" +userId);
		return Result.success(deviceService.getDeviceOnPage(userId,page));
	}
    @GetMapping("/{id}")
	public Result fetchDeviceById(@PathVariable("id") Integer id) {
        Result r = new Result();

        if (0 == id) {
            r.setResultCode(ResultCode.USER_NOT_EXIST);
            return r;
        }

        Device device = deviceService.getDeviceById(id);

        r.setResultCode(ResultCode.SUCCESS);
        r.simple().put("device", device);
        return r;
	}
}
