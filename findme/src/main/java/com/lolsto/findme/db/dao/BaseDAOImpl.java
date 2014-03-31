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
public class BaseDAOImpl implements BaseDAO {

    public HibernateTemplate hibernateTemplate;

    @SuppressWarnings ( "unchecked" )
    public <T extends Object> T get ( Class<T> entityClass, Serializable id )
    {
            return ( T ) hibernateTemplate.get( entityClass , id );
    }

    @SuppressWarnings ( "unchecked" )
    public <T extends Object> T load ( Class<T> entityClass, Serializable id )
    {
            return ( T ) hibernateTemplate.load( entityClass , id );
    }

    @SuppressWarnings ( "unchecked" )
    public <T extends Object> List<T> loadAll ( Class<T> entityClass )
    {
            return ( List<T> ) hibernateTemplate.loadAll( entityClass );
    }    
    
    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public Session getCurrentSession() {
        return hibernateTemplate.getSessionFactory().getCurrentSession();
    }

    public Session openSession() {
        return hibernateTemplate.getSessionFactory().openSession();
    }

    public Session getCurrentOrNewSession() {
        Session session = null;
        try {
            session = getCurrentSession();

        } catch (Exception e) {
            // No current session. Hence open new session.
            session = openSession();
        }
        return session;
    }
}
