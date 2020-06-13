package com.lgior.resources

import com.lgior.usecases.Greeting
import com.lgior.usecases.SayHello
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello-kotlin")
@Produces(MediaType.APPLICATION_JSON)
class HelloFromKotlin(private val sayHello: SayHello) {

    @GET
    fun sayHello(): Greeting {
        return sayHello.execute()
    }
}