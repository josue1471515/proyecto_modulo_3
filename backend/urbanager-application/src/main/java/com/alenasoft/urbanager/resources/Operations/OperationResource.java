package com.alenasoft.urbanager.resources.Operations;

import com.alenasoft.urbanager.api.Result;
import com.alenasoft.urbanager.resources.Operations.service.OperationService;
import io.dropwizard.hibernate.UnitOfWork;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("add")
public class OperationResource {

    @Inject
    private OperationService service;

    @GET
    public String helloWorld() {
        return "Hello World";
    }

    @GET
    @UnitOfWork
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Result getResult(@PathParam("id") long id) {
        return this.service.getById(id);
    }

    @GET
    @Path("query")
    public String OperationAddQuery(@QueryParam("first") String first,
                                    @QueryParam("second") String second) {
        return first + second;
    }

    @GET
    @UnitOfWork
    @Path("{num1}/{num2}")
    public Response addNumbers(@PathParam("num1") int num1,
                               @PathParam("num2") int num2) {
        long idCreated = this.service.add(num1, num2);
        return Response
                .created(URI.create("/api/add/" + idCreated))
                //.entity(this.service.add(num1, num2))
                .build();
    }
}

