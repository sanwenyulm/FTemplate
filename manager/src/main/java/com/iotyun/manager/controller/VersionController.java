package com.iotyun.manager.controller;

  
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iotyun.manager.common.Result;
import com.iotyun.manager.common.ResultCode;

 
 

@RestController
public class VersionController {
 
	@RequestMapping("/version")
	public Result getVersion() {
 

        return Result.error(ResultCode.INTERFACE_ADDRESS_INVALID);
	}
 
}
