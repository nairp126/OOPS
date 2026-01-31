/**
 * This class demonstrates the 'final' keyword on a class.
 * A 'final' class CANNOT be subclassed (extended).
 * 
 * Why?
 * 1. Security: Prevents hackers from subclassing a critical class (like String)
 * and changing its behavior.
 * 2. Design: Indicates this class is "complete" and shouldn't be altered.
 */
final class Logger {
    void logMessage(String message) {
        System.out.println("Log: " + message);
    }
}