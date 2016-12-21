package com.swu.grouppad.common;

import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * BaseDAO 定义DAO的通用操作
 * @author lixer
 * @param <T>
 */
@SuppressWarnings("unchecked")
public abstract class IBaseDaoImpl<T> implements IBaseDao<T> {

	@Autowired
	private SessionFactory sessionFactory; // 从容器中注入session工厂【无需get,set方法】

	private Class<T> clazz; // 【实体类对应的Class对象】

	/**
	 * //向子类暴露的接口获用来获取sessionFactory
	 * 
	 * @return sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * 通过反射泛型获取Class类型,getGenericSuperclass()方法获取对象的泛型的父类类型信息，
	 * getActualTypeArguments()[0]方法得到T的真实类型
	 * @param clazz
	 */
	public IBaseDaoImpl() {
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
		this.clazz = (Class<T>) pt.getActualTypeArguments()[0];
	}

	// @SuppressWarnings("unchecked")
	// public BaseDaoImpl() {//另外一种方式指定clazz值，要求类必须是abstract类型
	// ParameterizedType parameterizedType =
	// (ParameterizedType)this.getClass().getGenericSuperclass();
	// clazz= (Class<t>)(parameterizedType.getActualTypeArguments()[0]);
	// }

	@Override
	public Session getSession() {
		return getSessionFactory().getCurrentSession();
	}

	@Override
	public T save(T t) {
		Session session = getSession();
		return (T) session.save(t);
	}

	@Override
	public T findById(String id) {
		Session session = getSession();
		T t = (T) session.get(clazz, id);
		return t;
	}

	@Override
	public void saveAll(Collection<T> ct) {
		Session session = getSession();
		for (T t : ct) {
			session.save(t);
		}
	}

	@Override
	public T update(T t) {
		Session session = getSession();
		session.update(t);
		return t;
	}

	@Override
	public void deleteAll(Collection<T> ct) {
		Session session = getSession();
		for (T t : ct) {
			session.delete(t);
		}
	}

	@Override
	public T saveOrUpdate(T t) {
		Session session = getSession();
		session.saveOrUpdate(t);
		return t;
	}

	@Override
	public void delete(T t) {
		Session session = getSession();
		session.delete(t);
	}

	@Override
	public boolean deleteById(String id) {
		Session session = getSession();
		T t = (T) session.get(clazz, id);
		if (t == null)
			return false;
		session.delete(t);
		return true;
	}

	@Override
	public Page<T> loadAll() {
		Session session = getSession();
		Criteria criteria = session.createCriteria(clazz);
		Page<T> result = new Page<T>();
		int count = Integer.parseInt(criteria.setProjection(Projections.rowCount()).uniqueResult().toString());
		result.setTotalRecords(count);
		result.setList(criteria.list());
		return result;
	}

	@Override
	public Page<T> load(int page, int rows) {
		Session session = getSession();
		Criteria criteria = session.createCriteria(clazz);
		criteria.setFirstResult((page - 1) * rows);
		criteria.setMaxResults(rows);
		Page<T> result = new Page<T>();
		int count = Integer.parseInt(criteria.setProjection(Projections.rowCount()).uniqueResult().toString());
		result.setPageSize(rows);
		result.setPageNo(page);
		result.setTotalRecords(count);
		result.setList(criteria.list());
		return result;
	}

	@Override
	public long getTotalCount() {
		Session session = getSession();
		Criteria criteria = session.createCriteria(clazz);
		Object object = criteria.setProjection(Projections.rowCount()).uniqueResult();
		long totalCount = 0;
		if (object != null) {
			totalCount = Long.parseLong(object.toString());
		}
		return totalCount;
	}

	/****************************** HQL ******************************/
	@Override
	public Page<T> getScrollData() {
		return getScrollData(-1, -1, null, null, null);
	}

	@Override
	public Page<T> getScrollData(int firstResult, int maxResult) {
		return getScrollData(firstResult, maxResult, null, null, null);
	}

	@Override
	public Page<T> getScrollData(int firstResult, int maxResult, LinkedHashMap<String, String> orderby) {
		return getScrollData(firstResult, maxResult, null, null, orderby);
	}

	@Override
	public Page<T> getScrollData(int firstResult, int maxResult, String where, Object[] params) {
		return getScrollData(firstResult, maxResult, where, params, null);
	}

	@Override
	public Page<T> getScrollData(int pageNo, int pageSize, String where, Object[] params, LinkedHashMap<String, String> orderby) {
		String entityName = clazz.getSimpleName();
		String whereql = where != null && !"".equals(where.trim()) ? " where " + where : "";
		Session session = getSession();
		Query query = session.createQuery("select o from " + entityName + " o" + whereql + buildOrderby(orderby));
		if (pageNo != -1 && pageSize != -1)
			query.setFirstResult(pageNo).setMaxResults(pageSize);
		setQueryParameter(query, params);

		Page<T> qr = new Page<T>();
		Query queryCount = session.createQuery("select count(o) from " + entityName + " o" + whereql);
		setQueryParameter(queryCount, params);
		int count = (Integer) queryCount.uniqueResult();
		qr.setPageSize(pageSize);
		qr.setPageNo(pageNo);
		qr.setTotalRecords(count);
		qr.setList(query.list());
		return qr;
	}

	/**
	 * 设置查询参数
	 * 
	 * @param query
	 *            查询对象
	 * @param params
	 *            参数值
	 */
	public static void setQueryParameter(Query query, Object[] params) {
		if (params != null) {
			for (int i = 0; i < params.length; i++) {
				query.setParameter(i, params[i]);
			}
		}
	}

	/**
	 * 构建排序语句
	 * 
	 * @param orderby
	 *            排序属性与asc/desc, Key为属性,Value为asc/desc
	 * @return
	 */
	public static String buildOrderby(LinkedHashMap<String, String> orderby) {
		StringBuilder sb = new StringBuilder();
		if (orderby != null && !orderby.isEmpty()) {
			sb.append(" order by ");
			for (Map.Entry<String, String> entry : orderby.entrySet()) {
				sb.append("o.").append(entry.getKey()).append(" ").append(entry.getValue()).append(',');
			}
			sb.deleteCharAt(sb.length() - 1);
		}
		return sb.toString();
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