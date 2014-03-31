package com.lolsto.findme.service;

import com.lolsto.findme.db.dao.BaseDAO;
import com.lolsto.findme.db.entities.Dog;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Consumes("application/json")
@Produces("application/json")
public class SampleService
{
    private BaseDAO baseDAO;
    
    
    // Krajnja putanja do ovog servisa je:
    // Server: localhost
    // Port: 8080
    // Naziv aplikacije: findme
    // u web.xml definisana putanja do CXF servleta: /
    // u beans.xml definisana adresa rest servera: sampleservice
    // Path definisan nad metodom: /dogs
    // Konacno: localhost:8080/webser/sampleservice/dogs
    @GET
    @Path("/dogs")
    public Response getAllDogs() {
        
        List<Dog> dogs = baseDAO.loadAll(Dog.class);
            
        return Response.status(Status.OK).entity(dogs).build();
    }
    

    
    public BaseDAO getBaseDAO() {
        return baseDAO;
    }

    public void setBaseDAO(BaseDAO baseDAO) {
        this.baseDAO = baseDAO;
    }

 
}
