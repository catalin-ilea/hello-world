package com.ci.hello.resources;

import com.ci.hello.model.Greeting;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldResource {

    @GET
    @Path("/{name}")
    @Produces("application/json")
    public final Response getImageBytesByUuid(@PathParam("name") String name, @Context HttpHeaders httpHeaders) {
        return Response.ok(new Greeting("Hello " + name))
                .build();
    }
}
