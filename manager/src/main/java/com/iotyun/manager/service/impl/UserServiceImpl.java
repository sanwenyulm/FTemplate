package com.iotyun.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotyun.manager.common.Result;
 
import com.iotyun.manager.entity.User;
import com.iotyun.manager.entity.UserExample;
import com.iotyun.manager.entity.UserLogin;
import com.iotyun.manager.entity.UserLoginExample;
import com.iotyun.manager.entity.UserLoginExample.Criteria;
import com.iotyun.manager.mapper.UserLoginMapper;
import com.iotyun.manager.mapper.UserMapper;
import com.iotyun.manager.requestvo.UserVo;
import com.iotyun.manager.service.inter.AuthService;
import com.iotyun.manager.service.inter.UserService;

 

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserLoginMapper userLoginMapper;
	@Autowired
	private UserMapper userMapper;
	@Override
	public UserVo login(UserVo userVo) {
		// TODO Auto-generated method stub
		UserLoginExample userLoginExample = new UserLoginExample();
		Criteria criteria = userLoginExample.createCriteria();
		criteria.andLoginNameEqualTo(userVo.username.trim());
		List<UserLogin> list = userLoginMapper.selectByExample(userLoginExample);
		if(list.size() == 1){
			criteria.andLoginPwdEqualTo(userVo.password.trim());
			List<UserLogin> listPwd = userLoginMapper.selectByExample(userLoginExample);
			if(listPwd.size() == 1){
				userVo.setCode(0);
				userVo.setMessage("登录成功");
				userVo.setUserId(listPwd.get(0).getUserid());
				userVo.setTorken("admin-token"); 
				return userVo;
			}else{
				userVo.setCode(1);
				userVo.setMessage("密码错误");
				return userVo;
			}
		}	
		userVo.setCode(2);
		userVo.setMessage("用户名不存在");
 
		return userVo;
	}

	@Override
	public UserVo getUserInfoById(UserVo userVo) {
 
		 
		User user = userMapper.selectByPrimaryKey(userVo.userId);
		 
		userVo.setName(user.getName());
		userVo.setIntroduction(user.getCompnay());
		userVo.setRoles("admin");
		userVo.setAvatar("https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
		return userVo;
	}

	@Override
	public int addUser(User user) {
		try {
			int key = userMapper.insert(user);//useGeneratedKeys="true" keyProperty="Id" 
			if (key > 0) {
				return user.getId();
			}
			return -1;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	public List<User> getUserOnPage(int userId, Integer page) {
		// TODO Auto-generated method stub
		UserExample userExample = new UserExample();
		userExample.setStartRow(page);
		userExample.setPageSize(20);
 
		List<User> list = userMapper.selectByExample(userExample);
		return list;
	}

	@Override
	public boolean updateUser(User user) {
		
		
		try {
			int res = userMapper.updateByPrimaryKey(user);
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
	public boolean deleteUser(int userId) {
		 
		
		try {
			int res = userMapper.deleteByPrimaryKey(userId);
			if (res > 0) {
				return true;
			}
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
