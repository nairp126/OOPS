import java.util.Scanner;

/**
 * This class checks if a String is a Palindrome (reads same forwards and
 * backwards).
 * Demonstrates StringBuilder for efficient string manipulation.
 */
public class Palindrome {
    public static void main(String[] args) {
        // Step 1: Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        // Step 2: sanitation
        // Convert to uppercase so "Madam" matches "madam".
        String original = str.toUpperCase();

        // Step 3: Reverse the string
        // Why StringBuilder? String is "immutable" in Java.
        // If we used a loop with string concatenation (s += c), it would create a new
        // String object every iteration!
        // StringBuilder is mutable and efficient.
        String reversed = new StringBuilder(original).reverse().toString();

        // Step 4: Compare
        // ALWAYS use .equals() for Strings, never ==.
        if (original.equals(reversed)) {
            System.out.println("'" + str + "' is a Palindrome.");
        } else {
            System.out.println("'" + str + "' is NOT a Palindrome.");
        }
    }
}