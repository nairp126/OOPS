/**
 * Pitfall: "Swallowing" Exceptions.
 * 
 * A common mistake beginners make is catching an exception and doing nothing.
 * This hides bugs effectively, making them impossible to debug later.
 */
public class Pitfall {

    public static void loadConfig(String fileName) {
        try {
            // Simulating a file loading error
            if (fileName == null) {
                throw new NullPointerException("File name cannot be null");
            }
            System.out.println("Loading config from: " + fileName);

        } catch (Exception e) {
            // ❌ BAD PRACTICE: The Empty Catch Block
            // The error happened, but we silenced it.
            // The program continues thinking everything is fine.
        }
    }

    public static void main(String[] args) {
        System.out.println("Start Application...");

        // We pass null, which SHOULD crash or alert us.
        loadConfig(null);

        // The program thinks config loaded successfully because the error was
        // swallowed.
        // In a real app, this leads to confusing NullPointerExceptions later on.
        System.out.println("Application running (likely in an invalid state).");

        System.out.println("\n--- FIX ---");
        System.out.println("Always log the error or print the stack trace in catch blocks!");
    }
}
