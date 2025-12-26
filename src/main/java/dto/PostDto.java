package dto;

import java.time.Instant;

/**
 * WordPress post DTO
 */
public class PostDto {

    public int id;
    public String title;
    public String slug;
    public Instant date;

    /**
     * Create post
     */
    public PostDto(int id, String title, String slug) {
        this.id = id;
        this.title = title;
        this.slug = slug;
    }
}
