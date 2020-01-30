package com.iotyun.manager.service.inter;

import java.util.List;

import com.iotyun.manager.common.Result;
import com.iotyun.manager.entity.User;
import com.iotyun.manager.requestvo.UserVo;

public interface UserService {

	UserVo login(UserVo userVo);

	UserVo getUserInfoById(UserVo userVo);

	int addUser(User user);

	List<User> getUserOnPage(int userId, Integer page);

	boolean updateUser(User user);

	boolean deleteUser(int userId);
}
