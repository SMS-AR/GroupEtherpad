package com.swu.grouppad.common;

import java.util.List;

public interface IBaseDao<T> {
	/**
	 * 保存
	 * @param entity
	 */
	public void save(T entity);

	/**
	 * 删除
	 * @param ids
	 */
	public void delete(String[] ids);

	/**
	 * 更新
	 * @param entity
	 */
	public void update(T entity);

	/**
	 * 查找
	 * @param id
	 * @return
	 */
	public T find(String id);

	/**
	 * 保存或更新
	 * @param entity
	 */
	public void saveOrUpdate(T entity);

	/**
	 * 通过hql查询
	 * @param hql
	 * @param params
	 * @return
	 */
	public List<T> findByHQL(String hql, Object... params);
}
