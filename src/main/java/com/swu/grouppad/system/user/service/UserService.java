package com.swu.grouppad.system.user.service;

import com.swu.grouppad.common.IBaseService;
import com.swu.grouppad.system.user.entity.User;

public interface UserService extends IBaseService<User> {

	/**
	 * 通过登录名获取用户
	 * @param loginName 登录名
	 * @return
	 */
	public User findByName(String loginName);

}
