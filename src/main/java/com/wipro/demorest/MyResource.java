package com.wipro.demorest;

import javax.ws.rs.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/add/{a}/{b}")
public class MyResource {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public int  getIt1(@PathParam("a") int a,@PathParam("b") int b ) 
    {
        return a+b;
    }
}
