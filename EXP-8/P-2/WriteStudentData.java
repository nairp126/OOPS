import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteStudentData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();

        sc.nextLine();  // Consume newline

        System.out.print("Enter grade: ");
        String grade = sc.nextLine();

        try {
            FileWriter writer = new FileWriter("student.txt", true); // Append mode
            writer.write("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade + "\n");
            writer.close();
            System.out.println("Student data written successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }

        sc.close();
    }
}
// This code prompts the user to enter student details (name, roll number, and grade) and writes this information to a file named "student.txt". It uses `FileWriter` in append mode to add new entries without overwriting existing data. The `try-catch` block handles any potential `IOException` that may occur during file operations.
// The `Scanner` class is used to read user input from the console. After writing the data, the program closes the `FileWriter` and the `Scanner` to release system resources.