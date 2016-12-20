package com.swu.grouppad.system.user.dao;

import com.swu.grouppad.common.IBaseDao;
import com.swu.grouppad.system.user.entity.User;

public interface UserDao extends IBaseDao<User> {

	public User findByName(String loginName);

}
