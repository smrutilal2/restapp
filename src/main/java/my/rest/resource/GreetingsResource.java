package my.rest.resource;

import io.swagger.annotations.Api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.SecurityContext;

@Path("/hi")
@Api
public class GreetingsResource {

    @Context
    private SecurityContext securityContext;

    @GET
    public String hello() {
        System.out.println(securityContext);
        System.out.println(securityContext.getUserPrincipal());
//        System.out.println(securityContext.getUserPrincipal().getName());
//        System.out.println(securityContext.isSecure());
//        System.out.println(securityContext.getAuthenticationScheme());
        return "Hello!";
    }

}
