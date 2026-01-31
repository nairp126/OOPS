import java.util.Scanner;

/**
 * This class demonstrates "Control Flow" using if-else-if statements.
 * Unlike 'switch', 'if' statements can evaluate complex boolean expressions
 * (ranges, multiple conditions).
 */
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for three subjects
        // Note: We use 'double' to handle decimal marks (e.g., 85.5)
        System.out.print("Enter marks for subject 1: ");
        double mark1 = scanner.nextDouble();

        System.out.print("Enter marks for subject 2: ");
        double mark2 = scanner.nextDouble();

        System.out.print("Enter marks for subject 3: ");
        double mark3 = scanner.nextDouble();

        // Calculate the average marks
        // Division by 3.0 forces floating-point division. Division by 3 (int) might
        // truncate decimals if inputs were ints.
        double average = (mark1 + mark2 + mark3) / 3.0;
        char grade;

        // Determine grade based on average using Conditional Logic
        // The order matters! We check the highest range first.
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            // We arrive here ONLY if average < 90 AND average >= 75
            grade = 'B';
        } else if (average >= 50) {
            // We arrive here ONLY if average < 75 AND average >= 50
            grade = 'C';
        } else {
            // Catch-all for anything below 50
            grade = 'F';
        }

        // Output the results
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
