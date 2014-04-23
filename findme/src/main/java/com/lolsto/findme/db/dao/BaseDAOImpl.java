/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lolsto.findme.db.dao;


import com.lolsto.findme.common.PaginationVO;
import java.io.Serializable;
import java.util.List;
import javax.annotation.Resources;
import org.apache.commons.lang.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mixa
 */
@Repository
public class BaseDAOImpl implements BaseDAO {

    @Autowired
    private SessionFactory sessionFactory;

    protected final Session getSession() {
            return sessionFactory.getCurrentSession();
    }

    @SuppressWarnings ( "unchecked" )
    @Override
    public <T extends Object> T get ( Class<T> entityClass, Serializable id )
    {
            return ( T ) getSession().get( entityClass , id );
    }

    @SuppressWarnings ( "unchecked" )
    @Override
    public <T extends Object> T load ( Class<T> entityClass, Serializable id )
    {
            return ( T ) getSession().load( entityClass , id );
    }

    
    protected void addPagination(Criteria c, PaginationVO paginationVO) {
        if (paginationVO != null) {
            Integer pageNo = paginationVO.getPageNo();
            Integer resultsPerPage = paginationVO.getResultsPerPage();
            
            if (pageNo != null && pageNo > 0 && resultsPerPage != null && resultsPerPage > 0) {
                c.setFirstResult(resultsPerPage * pageNo - 1);
                c.setMaxResults(resultsPerPage);
            }
            
            String sortOrder = paginationVO.getSortOrder();
            String sortType = paginationVO.getSortType();
            
            if (StringUtils.isNotBlank(sortOrder) && StringUtils.isNotBlank(sortType)) {
                if (sortOrder.equalsIgnoreCase("desc")) {
                    c.addOrder(Order.desc(sortType));
                } else {
                    c.addOrder(Order.asc(sortType));
                }
            }
        }
    }
}
