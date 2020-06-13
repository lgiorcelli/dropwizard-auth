package com.lgior.resources

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello-kotlin")
@Produces(MediaType.TEXT_PLAIN)
class HelloFromKotlin {

    @GET
    fun sayHello(): String? {
        return "hola desde Kotlin!"
    }
}