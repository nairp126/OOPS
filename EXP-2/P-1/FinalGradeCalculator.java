import java.util.Scanner;

public class FinalGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter marks for subject 1: ");
        double mark1 = scanner.nextDouble();

        System.out.print("Enter marks for subject 2: ");
        double mark2 = scanner.nextDouble();

        System.out.print("Enter marks for subject 3: ");
        double mark3 = scanner.nextDouble();

        // Calculate the average marks
        double average = (mark1 + mark2 + mark3) / 3.0;
        char grade;

        // Determine grade based on average
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        // Output the results
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
