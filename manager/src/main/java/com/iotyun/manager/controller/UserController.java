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
import com.iotyun.manager.entity.User;
import com.iotyun.manager.requestvo.UserVo;
import com.iotyun.manager.service.inter.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	private UserService userService;


	@PostMapping("/login")
	public Result login(@RequestBody UserVo userVo) {


		System.out.printf(userVo.password);
		System.out.printf(userVo.username);
		
		return Result.success(userService.login(userVo));
	}
	@GetMapping("/getinfo")
	public Result getUserInfo(Integer userId) {


		System.out.printf("userId:"+userId);
        
		UserVo userVo = new UserVo();
		userVo.setUserId(userId);

		return Result.success(userService.getUserInfoById(userVo));
	}
    @GetMapping("/all")
	public Result fetchUser(int userId,Integer page) {
    	System.out.println("fetchUser at page"+page+" for user" +userId);
		return Result.success(userService.getUserOnPage(userId,page));
	}
	@PostMapping("/addUser")
	public Result addUser(@RequestBody User user) {


 
		System.out.printf(user.getName());
		user.setStatus(0);
		
		return Result.success(userService.addUser(user));
		
		
	}
	@PostMapping("/updateUser")
	public Result updateUser(@RequestBody User user) {
 
 
	 
		if(userService.updateUser(user)){
			return Result.success(true);
		}else{
			return Result.error(ResultCode.ERROR);
		}
 
	}
	
    @GetMapping("/deleteUser")
	public Result deleteUser(int userId) {
    	
		if(userService.deleteUser(userId)){
			return Result.success(true);
		}else{
			return Result.error(ResultCode.ERROR);
		}
    	 
 
	}
}
