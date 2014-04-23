/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lolsto.findme.service;

import com.lolsto.findme.bo.DogBO;
import com.lolsto.findme.common.DogFilterVO;
import com.lolsto.findme.common.PaginationVO;
import com.lolsto.findme.db.entities.Dog;
import java.util.List;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mixa
 */
@Service("dogService")
public class DogServiceImpl implements DogService {
    
    
    @Autowired
    private DogBO dogBO;
    
    @Transactional
    @Override
    public Response getDogs(DogFilterVO dogFilterVO, PaginationVO paginationVO) {
        
        if (dogFilterVO == null) {
            dogFilterVO = new DogFilterVO();
        }
        
        List<Dog> dogs = dogBO.getDogs(dogFilterVO, paginationVO);
        
        return Response.status(Response.Status.OK).entity(dogs).build();
    }  
    
    @Transactional
    @Override
    public Response getDogs(String breed, String gender, Boolean forSale, 
            Integer breederId, String country) {

        DogFilterVO dogFilterVO = new DogFilterVO(breed, gender, forSale, breederId, country);
        
        List<Dog> dogs = dogBO.getDogs(dogFilterVO, null);
        
        return Response.status(Response.Status.OK).entity(dogs).build();
    }    
    
    @Transactional
    @Override
    public Response getDog(long id) {
        
        DogFilterVO dogFilterVO = new DogFilterVO();
        List<Dog> dogs = dogBO.getDogs(dogFilterVO, null);
        
        return Response.status(Response.Status.OK).entity(dogs).build();       
    }
}
