package com.swu.grouppad.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class IBaseServiceImpl<T> implements IBaseService<T> {

	@Autowired
	private IBaseDao<T> dao;

	@Override
	public void save(T entity) {
		dao.save(entity);

	}

	@Override
	public void delete(String[] ids) {
		dao.delete(ids);
	}

	@Override
	public void update(T entity) {
		dao.update(entity);
	}

	@Override
	public T find(String id) {
		return dao.find(id);
	}

	@Override
	public void saveOrUpdate(T entity) {
		dao.saveOrUpdate(entity);
	}

	@Override
	public List<T> findByHQL(String hql, Object... params) {
		return dao.findByHQL(hql, params);
	}
}
