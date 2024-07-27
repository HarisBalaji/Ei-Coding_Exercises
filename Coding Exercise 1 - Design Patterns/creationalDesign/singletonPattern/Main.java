package creationalDesign.singletonPattern;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        System.out.println("App Name: " + configManager.getProperty("appName"));
        System.out.println("Version: " + configManager.getProperty("version"));
        System.out.println("Username: " + configManager.getProperty("userName"));
    }
}
