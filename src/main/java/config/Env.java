package config;

import io.github.cdimascio.dotenv.Dotenv;

/**
 * Loads environment variables from .env
 */
public class Env {

    private static final Dotenv dotenv = Dotenv.load();

    /**
     * Get env value
     * @param key variable name
     */
    public static String get(String key) {
        return dotenv.get(key);
    }
}
