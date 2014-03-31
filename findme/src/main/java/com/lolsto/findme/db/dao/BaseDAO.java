/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lolsto.findme.db.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 *
 * @author mixa
 */
public interface BaseDAO {
    
	/**
	 * This method is used to fetch an object from database cache (second level) or directly from database.
	 * If object not found, it returns null.
	 * Use this method when this entity hasn't been persisted in the session previously. Else use load()
	 * @param <T>
	 * @param entityClass
	 * @param id
	 */
	public <T extends Object> T get ( Class<T> entityClass, Serializable id );

	/**
	 * This method is used to fetch an object from session cache (first level). or from second level cache.
	 * If object not found, it throws Exception.
	 * Use this method when the entity has been persisted previously. Else use get()
	 * @param <T>
	 * @param entityClass
	 * @param id
	 * @return
	 */
	public <T extends Object> T load ( Class<T> entityClass, Serializable id );

	/**
	 * This method is used to fetch all the object of the given entity class.
	 * Objects are fetched from cache or from database.
	 * @param <T>
	 * @param entityClass
	 * @return
	 */
	public <T extends Object> List<T> loadAll ( Class<T> entityClass );    
    
	/**
	 * This method is used to get the current session.
	 * Throws exception if no current session.
	 *
	 * OpenSessionInViewFilter is configured. Scope of session is Request.
	 */
	public Session getCurrentSession ();

	/**
	 * This method is used to open a new session.
	 */
	public Session openSession ();

	/**
	 * This method is used to obtain the current session.
	 * If no current session is present, it returns a new session.
	 */
	public Session getCurrentOrNewSession ();

	public HibernateTemplate getHibernateTemplate ();

	public void setHibernateTemplate ( HibernateTemplate hibernateTemplate );    
    
}
