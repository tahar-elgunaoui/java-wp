package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Creates database connections
 */
public class DatabaseConnection {

    /**
     * Open JDBC connection
     */
    public static Connection getConnection() throws Exception {
    	
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://" +
                Env.get("DB_HOST") + ":" +
                Env.get("DB_PORT") + "/" +
                Env.get("DB_NAME") + "?useSSL=false&serverTimezone=UTC";

        System.out.println("url: " + url);
        
        return DriverManager.getConnection(
                url,
                Env.get("DB_USER"),
                Env.get("DB_PASSWORD")
        );
    }
}

