package resource;

import dto.HelloDto;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * Simple test API endpoint
 */
@Path("/hello")
public class HelloResource {

    /**
     * Return static JSON response
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public HelloDto hello() {
        return new HelloDto("API is working", 200);
    }
}
