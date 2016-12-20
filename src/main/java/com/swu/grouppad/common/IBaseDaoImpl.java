package com.swu.grouppad.common;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * BaseDAO 定义DAO的通用操作
 * @author lixer
 * @param <T>
 */
@SuppressWarnings("unchecked")
public class IBaseDaoImpl<T> implements IBaseDao<T> {

	protected Logger log = Logger.getLogger(this.getClass());

	protected Class<T> clazz;

	/**
	 * 通过反射泛型获取Class类型,getGenericSuperclass()方法获取对象的泛型的父类类型信息，
	 * getActualTypeArguments()[0]方法得到T的真实类型
	 * 
	 */
	public IBaseDaoImpl() {
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
		this.clazz = (Class<T>) pt.getActualTypeArguments()[0];
	}

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(T entity) {
		sessionFactory.getCurrentSession().save(entity);
	}

	@Override
	public void delete(String[] ids) {
		for (String id : ids) {
			sessionFactory.getCurrentSession().delete(find(id));
		}
	}

	@Override
	public void update(T entity) {
		sessionFactory.getCurrentSession().update(entity);
	}

	@Override
	public T find(String id) {
		return (T) sessionFactory.getCurrentSession().get(clazz, id);
	}

	@Override
	public void saveOrUpdate(T entity) {
		sessionFactory.getCurrentSession().saveOrUpdate(entity);

	}

	@Override
	public List<T> findByHQL(String hql, Object... params) {
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		for (int i = 0; params != null && i < params.length; i++) {
			query.setParameter(i, params[i]);
		}
		return query.list();
	}
}
