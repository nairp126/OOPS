import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This class demonstrates "File I/O" and "Exception Handling".
 * We use the 'try-with-resources' statement (introduced in Java 7) which is the
 * industry standard.
 * It automatically closes resources (like Scanners) even if an error occurs,
 * preventing memory leaks.
 */
public class FileReadTypes {

    /**
     * Reads a file and prints its content.
     * Throws FileNotFoundException to let the caller handle the error.
     */
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);

        // Try-With-Resources: Note the parenthesis after 'try'.
        // Scanner will be auto-closed at the end of this block.
        try (Scanner sc = new Scanner(file)) {
            System.out.println("--- File Contents Start ---");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            System.out.println("---- File Contents End ----");
        }
    }

    public static void main(String[] args) {
        // Scanner for user input (System.in)
        // We generally keep System.in open during the app lifecycle, but here we can
        // close it at the end.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter file name to read (e.g., test.txt): ");
        String fileName = input.nextLine();

        try {
            // Risky operation: opening a file that might not exist.
            readFile(fileName);
        } catch (FileNotFoundException e) {
            // Handling the exception gracefully.
            System.out.println("Error: The file '" + fileName + "' was not found.");
            System.out.println("Please check the path and try again.");
        } finally {
            // This block ALWAYS runs. Useful for cleanup (though try-with-resources handles
            // the file scanner).
            System.out.println("Operation completed.");
        }

        input.close();
    }
}