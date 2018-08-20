package com.lgior.resources

import javax.annotation.Resource
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello-world")
@Produces(MediaType.TEXT_PLAIN)
class HelloWorldResource {

	@GET
	fun sayHello():String {
		return "Hola"
	}
}