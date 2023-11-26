package web;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public ResourceConfig resourceConfig() {
        // Specify the package where your JAX-RS resources are located
        ResourceConfig jerseyServlet = new ResourceConfig().packages("web");

        // jerseyServlet.register(SomeFeature.class);

        return jerseyServlet;
    }
}
