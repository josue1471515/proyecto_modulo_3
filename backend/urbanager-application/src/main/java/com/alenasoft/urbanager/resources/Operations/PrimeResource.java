package com.alenasoft.urbanager.resources.Operations;

import com.alenasoft.urbanager.api.Result;
import com.alenasoft.urbanager.resources.Operations.service.OperationService;
import com.alenasoft.urbanager.resources.Operations.service.PrimeService;
import io.dropwizard.hibernate.UnitOfWork;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("prime")
public class PrimeResource {

    @Inject
    private PrimeService services;

    @GET
    public String helloWorld() {
        return "Hello World";
    }


   
}

