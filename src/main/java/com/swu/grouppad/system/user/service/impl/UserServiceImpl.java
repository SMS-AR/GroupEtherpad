package com.swu.grouppad.system.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swu.grouppad.common.IBaseServiceImpl;
import com.swu.grouppad.system.user.dao.UserDao;
import com.swu.grouppad.system.user.entity.User;
import com.swu.grouppad.system.user.service.UserService;

@Service
public class UserServiceImpl extends IBaseServiceImpl<User> implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public User findByName(String loginName) {
		return userDao.findByName(loginName);
	}
}
