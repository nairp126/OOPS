import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileWordCharCount {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("student.txt"));
            String line;
            int wordCount = 0, charCount = 0;

            while ((line = reader.readLine()) != null) {
                charCount += line.replaceAll("\\s", "").length(); // Count non-whitespace characters
                StringTokenizer tokens = new StringTokenizer(line);
                wordCount += tokens.countTokens(); // Count words
            }

            reader.close();

            System.out.println("Total words: " + wordCount);
            System.out.println("Total characters (excluding spaces): " + charCount);
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
// This code reads a file named "student.txt", counts the total number of words and characters (excluding spaces), and prints the results to the console. It uses `BufferedReader` for efficient reading and `StringTokenizer` for word counting.
// The `try-catch` block handles any potential `IOException` that may occur during file operations.
// The program closes the `BufferedReader` after reading the file to release system resources. The `while` loop continues to read lines until the end of the file is reached, at which point `readLine()` returns `null`. The program counts non-whitespace characters and words in each line and accumulates the totals.
// The use of `BufferedReader` for reading text files and `StringTokenizer` for tokenizing strings is a common practice in Java programming for efficient text processing.