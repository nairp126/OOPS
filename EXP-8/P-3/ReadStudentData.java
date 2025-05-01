import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadStudentData {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Example.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("Error: Unable to read file.");
        }
    }
}
// This code reads a file named "Example.txt" line by line and prints each line to the console. It uses `BufferedReader` for efficient reading of text files. The `try-catch` block handles any potential `IOException` that may occur during file operations.
// The `FileReader` class is used to read the file, and the `BufferedReader` class is used to buffer the input for efficient reading. The program closes both the `BufferedReader` and `FileReader` after reading the file to release system resources.