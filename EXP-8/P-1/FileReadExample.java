import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadExample {
    // Method to read file contents
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file); // This may throw FileNotFoundException
        
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file name to read: ");
        String fileName = input.nextLine();

        try {
            readFile(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } finally {
            System.out.println("File operation attempted.");
        }

        input.close();
    }
}
// This code defines a method `readFile` that takes a file name as input and reads its contents line by line, printing each line to the console. The `main` method prompts the user for a file name, calls `readFile`, and handles any potential `FileNotFoundException` that may occur if the file does not exist. The `finally` block ensures that a message is printed regardless of whether an exception occurred or not. The program uses the `Scanner` class for reading both user input and file contents.
// The `try-catch` block is used to handle exceptions, and the `finally` block is used to execute code that should run regardless of whether an exception occurred. The program closes the `Scanner` object after use to release system resources.
// The use of a `Scanner` object for reading user input and file contents is a common practice in Java programming.