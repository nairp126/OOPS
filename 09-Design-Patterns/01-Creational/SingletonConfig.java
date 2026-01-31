// Package removed to match directory structure

/**
 * Singleton Pattern.
 * 
 * Problem: We need ONE global configuration object. Creating multiple would be
 * wasteful or incorrect.
 * Solution: Make the constructor private. Provide a static method to get the
 * single instance.
 */
public class SingletonConfig {

    // 1. private static variable to hold the single instance
    private static SingletonConfig instance;

    // 2. private constructor (No one else can say "new SingletonConfig()")
    private SingletonConfig() {
        System.out.println("Config Loaded from File (Complex Operation)");
    }

    // 3. public static method to get the instance
    public static SingletonConfig getInstance() {
        if (instance == null) {
            instance = new SingletonConfig(); // Lazy Initialization
        }
        return instance;
    }

    public void printSettings() {
        System.out.println("App Name: Java Mastery");
        System.out.println("Version: 1.0");
    }

    public static void main(String[] args) {
        System.out.println("--- Start ---");

        // SingletonConfig cfg = new SingletonConfig(); // ERROR: Private constructor

        SingletonConfig config1 = SingletonConfig.getInstance();
        SingletonConfig config2 = SingletonConfig.getInstance();

        config1.printSettings();

        // Proof it's the SAME object
        if (config1 == config2) {
            System.out.println("Success: Both variables point to the SAME object.");
        } else {
            System.out.println("Error: Different objects created.");
        }
    }
}
