package com.example

import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@Path("/greeting")
class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "hello"

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/valNoDefaultsInput")
    fun valNoDefaultsInput(input: ValNoDefaultsInput) = input.age.toString() + "/" + input.name

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/valWithAllDefaultsInput")
    fun valWithDefaultsInput(input: ValWithAllDefaultsInput) = input.age.toString() + "/" + input.name

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/valWithSomeDefaultsInput")
    fun valWithSomeDefaultsInput(input: ValWithSomeDefaultsInput) = input.age.toString() + "/" + input.name

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/todo")
    fun todo(todo: Todo) = todo.completed
}
