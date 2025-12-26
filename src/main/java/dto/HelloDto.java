package dto;

/**
 * Simple response DTO
 */
public class HelloDto {

    public String message;
    public int status;

    /**
     * Create response object
     */
    public HelloDto(String message, int status) {
        this.message = message;
        this.status = status;
    }
}
