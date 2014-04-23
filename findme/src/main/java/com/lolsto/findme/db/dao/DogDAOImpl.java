/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lolsto.findme.db.dao;

import com.lolsto.findme.common.DogFilterVO;
import com.lolsto.findme.common.PaginationVO;
import com.lolsto.findme.db.entities.Dog;
import java.util.List;
import org.apache.commons.lang.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mixa
 */
@Repository
public class DogDAOImpl extends BaseDAOImpl implements DogDAO {
    
    
    public List<Dog> getDogs(DogFilterVO dogFilterVO, PaginationVO paginationVO) {
        
        Criteria c = getSession().createCriteria(Dog.class);
        
        if (StringUtils.isNotBlank(dogFilterVO.getBreed())) {
            c.add(Restrictions.eq("breed", dogFilterVO.getBreed()));
        }
        
        if (StringUtils.isNotBlank(dogFilterVO.getGender())) {
            c.add(Restrictions.eq("gender", dogFilterVO.getGender()));
        }
        
        if (dogFilterVO.isForSale() != null) {
            c.add(Restrictions.eq("forSale", dogFilterVO.isForSale()));
        }
        
        if (dogFilterVO.getBreederId() != null) {
            c.add(Restrictions.eq("breeder.id", dogFilterVO.getBreederId()));
        }        
        
        if (StringUtils.isNotBlank(dogFilterVO.getCountry())) {
            c.createAlias("breeder", "breeder");
            c.createAlias("breeder.address", "address");
            c.add(Restrictions.eq("address.country", dogFilterVO.getCountry()));
        }        
        
        addPagination(c, paginationVO);
        
        return c.list();
    }
    
    
}
