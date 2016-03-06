package my.rest;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

@ApplicationPath("/")
public class MyApplication extends ResourceConfig {
    
    public MyApplication() {
        packages("my.rest");
        register(RolesAllowedDynamicFeature.class);
        register(ApiListingResource.class);
        register(SwaggerSerializers.class);
        
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.2");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("localhost:8080");
        beanConfig.setBasePath("/");
        beanConfig.setResourcePackage("my.rest");
        beanConfig.setScan(true);
        beanConfig.setPrettyPrint(true);
    }

}
