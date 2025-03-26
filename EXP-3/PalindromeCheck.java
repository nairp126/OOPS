import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        // Step 1: Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close(); // Close scanner to avoid memory leaks

        // Step 2: Convert to uppercase (to handle case-insensitive check)
        str = str.toUpperCase();

        // Step 3: Reverse the string
        String reversed = new StringBuilder(str).reverse().toString();

        // Step 4: Compare original and reversed string
        if (str.equals(reversed)) {
            System.out.println("Palindrome ");
        } else {
            System.out.println("Not a Palindrome ");
        }
    }
}
