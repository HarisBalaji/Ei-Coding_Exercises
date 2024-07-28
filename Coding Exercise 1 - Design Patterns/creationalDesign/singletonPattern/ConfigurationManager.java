package creationalDesign.singletonPattern;

import java.util.Properties;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private Properties properties;

    private ConfigurationManager() {
        properties = new Properties();
        loadProperties();
    }

    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    private void loadProperties() {
        // Load properties from a file or other source
        properties.setProperty("appName", "TutorConnect");
        properties.setProperty("version", "1.0.0");
        properties.setProperty("userName", "Haris");
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
