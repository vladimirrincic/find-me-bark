/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lolsto.findme.service;

import com.lolsto.findme.common.DogFilterVO;
import com.lolsto.findme.common.PaginationVO;
import com.lolsto.findme.db.entities.Dog;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author mixa
 */
@Path("/dogs")
@Consumes("application/json")
@Produces("application/json")
public interface DogService {
    

    
    @GET
    @Path("/")
    Response getDogs(DogFilterVO dogFilterVO, PaginationVO paginationVO);
    
    @GET
    @Path("/")
    Response getDogs(
            @QueryParam("breed") String breed, @QueryParam("gender") String gender, 
            @QueryParam("forSale") Boolean forSale, @QueryParam("breederId") Integer breederId, 
            @QueryParam("country") String country);
    

    
    @GET
    @Path("/{id}")
    Response getDog(@PathParam("id") long id);
    
}
