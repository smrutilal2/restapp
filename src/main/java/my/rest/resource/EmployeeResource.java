package my.rest.resource;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import my.rest.model.Employee;

@Path("/v1/employee")
@Api("employees")
public class EmployeeResource {

    @POST
    @ApiOperation("Add a new employee")
    public Employee create(Employee employee){
        return employee;
    }

}
