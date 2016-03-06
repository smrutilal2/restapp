package my.rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

@ApplicationPath("/")
public class MyApplication extends ResourceConfig {
    
    public MyApplication() {
        packages("my.rest");
        register(RolesAllowedDynamicFeature.class);
    }

}
