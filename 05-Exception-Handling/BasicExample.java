// package exception_handling; // Removed to allow running directly from this folder

import java.util.Scanner;

/**
 * Basic Example: The Try-Catch-Finally Block.
 * 
 * Concept:
 * - try: The block of code where an exception MIGHT occur.
 * - catch: The block that handles the exception if it happens.
 * - finally: The block that ALWAYS executes, regardless of success or failure.
 */
public class BasicExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Division Calculator ---");

        try {
            // RISKY CODE: This might fail if user enters 0.
            System.out.print("Enter numerator: ");
            int numerator = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter denominator: ");
            int denominator = Integer.parseInt(scanner.nextLine());

            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // HANDLING 1: Mathematical errors (like divide by zero)
            System.out.println("Error: Cannot divide by zero!");
            // e.printStackTrace(); // Optional: Print technical details for debugging

        } catch (NumberFormatException e) {
            // HANDLING 2: Input errors (like entering "abc" instead of 123)
            System.out.println("Error: Please enter valid whole numbers.");

        } finally {
            // CLEANUP: This runs no matter what.
            // Using try-with-resources is better, but this demonstrates the concept.
            System.out.println("--- Operation Finished (Finally Block) ---");
            scanner.close();
        }

        System.out.println("Program continues normally...");
    }
}
