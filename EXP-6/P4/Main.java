public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.logMessage("This is a log message.");
    }
}

// // The above code demonstrates the use of final classes in Java.
// // It includes the definition of a Logger class with a method to log messages. The Logger class is declared as final, which means it cannot be subclassed. This ensures that the logging functionality remains consistent and cannot be altered by extending the class. The logMessage method is used to print log messages to the console, providing a simple logging mechanism for applications. By using a final class, developers
