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

// The above code checks if a given string is a palindrome. It takes a string input from the user, converts it to uppercase for case-insensitive comparison, reverses the string, and then compares the original and reversed strings. If they are equal, it prints "Palindrome"; otherwise, it prints "Not a Palindrome". The use of StringBuilder for reversing the string is efficient and straightforward.
// The program uses a Scanner object to read user input and closes it after use to prevent memory leaks. The StringBuilder class is used for efficient string manipulation, particularly for reversing the string.
// The program is structured to be user-friendly and handles input securely. It also demonstrates the use of string manipulation techniques in Java, such as converting to uppercase and reversing a string using StringBuilder.
// The program is simple and effective for checking palindromes, making it a good example of basic string handling in Java.
// The use of StringBuilder for reversing the string is efficient and straightforward. The program is structured to be user-friendly and handles input securely. It also demonstrates the use of string manipulation techniques in Java, such as converting to uppercase and reversing a string using StringBuilder. The program is simple and effective for checking palindromes, making it a good example of basic string handling in Java.