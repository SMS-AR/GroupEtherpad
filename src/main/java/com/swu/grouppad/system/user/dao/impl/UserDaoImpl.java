package com.swu.grouppad.system.user.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.swu.grouppad.common.IBaseDaoImpl;
import com.swu.grouppad.system.user.dao.UserDao;
import com.swu.grouppad.system.user.entity.User;

@Repository
public class UserDaoImpl extends IBaseDaoImpl<User> implements UserDao {

	@Override
	public User findByName(String loginName) {
		String hql = "from User u where u.username=?";
		List<User> list = findByHQL(hql, loginName);
		if (list != null && !list.isEmpty()) {
			return list.get(0);
		} else {
			return null;
		}
	}
}
