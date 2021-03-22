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
    @Path("/listOfValWithSomeDefaultsInput")
    fun listOfValWithSomeDefaultsInput(inputs: List<ValWithSomeDefaultsInput>) = inputs.joinToString { "${it.age}/${it.name}" }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/valWithObjectInput")
    fun valWithObjectInput(input: ValWithObjectInput) = input.input.run { "$age/$name" }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/valWithListOfObjectsInput")
    fun valWithListOfObjectsInput(input: ValWithListOfObjectsInput) = input.inputs.joinToString { "${it.age}/${it.name}" }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/valWithListOfStringsInput")
    fun valWithListOfStringsInput(input: ValWithListOfStringsInput) = input.inputs.joinToString()

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/todo")
    fun todo(todo: Todo) = todo.completed
}

data class ValWithObjectInput(val input: ValWithSomeDefaultsInput)
data class ValWithListOfObjectsInput(val inputs: List<ValWithSomeDefaultsInput>)
data class ValWithListOfStringsInput(val inputs: List<String>)
