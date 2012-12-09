package com.techiekernel.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/foobar")
public class FooBarService {
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "FooBar say : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}
}
