/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lolsto.findme.db.dao;

import com.lolsto.findme.common.PaginationVO;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
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
	<T extends Object> T get ( Class<T> entityClass, Serializable id );

	/**
	 * This method is used to fetch an object from session cache (first level). or from second level cache.
	 * If object not found, it throws Exception.
	 * Use this method when the entity has been persisted previously. Else use get()
	 * @param <T>
	 * @param entityClass
	 * @param id
	 * @return
	 */
	<T extends Object> T load ( Class<T> entityClass, Serializable id );

 
        
}
