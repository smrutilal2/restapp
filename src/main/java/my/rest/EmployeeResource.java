package my.rest;


import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/v1/employees")
public class EmployeeResource {

    @POST
    public Employee create(Employee employee){
        return employee;
    }

}
