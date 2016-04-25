package my.rest.resource;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import my.rest.model.Employee;

@Path("/v1/employee")
@Api("employees")
public class EmployeeResource {

    @POST
    @ApiOperation("Add a new employee")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Employee employee) {
        System.out.println(String.format("%s created", employee.getName()));
        return Response.status(Response.Status.CREATED).entity(employee).build();
    }

}
