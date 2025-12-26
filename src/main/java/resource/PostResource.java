package resource;

import repository.PostRepository;
import dto.PostDto;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

/**
 * REST endpoint for posts
 */
@Path("/posts")
public class PostResource {

    /**
     * Return posts as JSON
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<PostDto> getAll() {
        return new PostRepository().findAll();
    }
}
