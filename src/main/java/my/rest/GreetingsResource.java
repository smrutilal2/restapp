package my.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hi")
public class GreetingsResource {
    
    @GET
    public String hello(){
        return "Hello!";
    }

}
