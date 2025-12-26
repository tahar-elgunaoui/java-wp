package resource;

import config.DatabaseConnection;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.sql.Connection;

/**
 * Test database connectivity
 */
@Path("/db-test")
public class DbTestResource {

    /**
     * Check if database connection works
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String testConnection() {
        try (Connection c = DatabaseConnection.getConnection()) {
            return """
                {
                  "db": "connected",
                  "status": 200
                }
            """;
        } catch (Exception e) {
            return """
                {
                  "db": "error",
                  "status": 500,
                  "message": "%s"
                }
            """.formatted(e.getMessage());
        }
    }
}
