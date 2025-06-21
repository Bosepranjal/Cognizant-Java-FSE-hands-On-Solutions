package SingletonPatternExample;

public class Logger {
    // Step 1: Created a private static instance of Logger
    private static Logger instance;

    // Step 2: Made the constructor private to prevent external instantiation
    private Logger() {
        System.out.println("Logger Initialized");
    }

    // Step 3: Provided a public static method to get the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Lazy initialization
        }
        return instance;
    }

    // Optional: Adding a method to demonstrate functionality
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
