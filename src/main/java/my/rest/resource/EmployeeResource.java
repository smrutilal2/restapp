package my.rest.resource;


import io.swagger.annotations.Api;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import my.rest.model.Employee;

@Path("/v1/employees")
@Api
public class EmployeeResource {

    @POST
    public Employee create(Employee employee){
        return employee;
    }

}
