package com.swu.grouppad.common;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class IBaseServiceImpl<T> implements IBaseService<T> {

	@Autowired
	private IBaseDao<T> dao;

	@Override
	public T save(T t) {
		return dao.save(t);
	}

	@Override
	public void saveAll(Collection<T> ct) {
		dao.saveAll(ct);
	}

	@Override
	public T findById(String id) {
		return dao.findById(id);
	}

	@Override
	public T update(T t) {
		return dao.update(t);
	}

	@Override
	public T saveOrUpdate(T t) {
		return dao.saveOrUpdate(t);
	}

	@Override
	public void delete(T t) {
		dao.delete(t);
	}

	@Override
	public void deleteAll(Collection<T> ct) {
		dao.deleteAll(ct);
	}

	@Override
	public boolean deleteById(String id) {
		return dao.deleteById(id);
	}

	@Override
	public Page<T> loadAll() {
		return dao.loadAll();
	}

	@Override
	public Page<T> load(int page, int rows) {
		return dao.load(page, rows);
	}

	@Override
	public long getTotalCount() {
		return dao.getTotalCount();
	}

	/******************************HQL******************************/

	@Override
	public Page<T> getScrollData() {
		return dao.getScrollData();
	}

	@Override
	public Page<T> getScrollData(int firstResult, int maxResult) {
		return dao.getScrollData(firstResult, maxResult);
	}

	@Override
	public Page<T> getScrollData(int firstResult, int maxResult, LinkedHashMap<String, String> orderby) {
		return dao.getScrollData(firstResult, maxResult, orderby);
	}

	@Override
	public Page<T> getScrollData(int firstResult, int maxResult, String where, Object[] params) {
		return dao.getScrollData(firstResult, maxResult, where, params);
	}

	@Override
	public Page<T> getScrollData(int firstResult, int maxResult, String where, Object[] params, LinkedHashMap<String, String> orderby) {
		return dao.getScrollData(firstResult, maxResult, where, params, orderby);
	}

	@Override
	public List<T> findByHQL(String hql, Object... params) {
		return dao.findByHQL(hql, params);
	}

}
