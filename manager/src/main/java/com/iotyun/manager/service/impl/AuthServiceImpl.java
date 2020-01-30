package com.iotyun.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotyun.manager.mapper.UserAuthMapper;
import com.iotyun.manager.service.inter.AuthService;

 

@Service
public class AuthServiceImpl implements AuthService {

	@Autowired
	private UserAuthMapper userAuthMapper;

	@Override
	public boolean check(int userid, String token) {
		// TODO Auto-generated method stub
		return false;
	}

}
