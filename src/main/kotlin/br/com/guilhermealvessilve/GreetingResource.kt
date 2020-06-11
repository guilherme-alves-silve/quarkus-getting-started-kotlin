package br.com.guilhermealvessilve

import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class GreetingResource {

    @Inject
    private lateinit var service: GreetingService

    @GET
    @Path("{name}")
    @Produces(MediaType.APPLICATION_JSON)
    fun hello(@PathParam("name") name: String) = service.hello(name)
}