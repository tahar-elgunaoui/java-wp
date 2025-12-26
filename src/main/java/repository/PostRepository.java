package repository;

import config.DatabaseConnection;
import dto.PostDto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Access WordPress posts
 */
public class PostRepository {

    /**
     * Fetch published posts
     */
    public List<PostDto> findAll() {
        List<PostDto> list = new ArrayList<>();

        String sql = """
            SELECT ID, post_title, post_name
            FROM wpposts
        """;

        try (
            Connection c = DatabaseConnection.getConnection();
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()
        ) {
            while (rs.next()) {
                list.add(new PostDto(
                    rs.getInt("ID"),
                    rs.getString("post_title"),
                    rs.getString("post_name")
                    
                ));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return list;
    }
}
