package my.rest.resource;


import javax.ws.rs.POST;
import javax.ws.rs.Path;

import my.rest.model.Employee;

@Path("/v1/employees")
public class EmployeeResource {

    @POST
    public Employee create(Employee employee){
        return employee;
    }

}
