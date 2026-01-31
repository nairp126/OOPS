import java.util.Scanner;

/**
 * This class demonstrates "Control Flow" using the 'switch' statement.
 * A switch statement allows a variable to be tested for equality against a list
 * of values.
 * Each value is called a 'case', and the variable being switched on is checked
 * for each case.
 */
public class DayOfWeekSwitch {
    public static void main(String[] args) {
        // Scanner is a class in java.util package used for obtaining the input of the
        // primitive types like int, double, etc. and strings.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-7): ");
        int day = scanner.nextInt();
        String dayName;

        // The Switch Statement matches the value of 'day' against the cases below.
        switch (day) {
            case 1:
                dayName = "Monday";
                break; // 'break' is CRITICAL. It stops the code from "falling through" to the next
                       // case.
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                // 'default' is like the 'else' in an if-statement.
                // It runs if NONE of the cases match.
                dayName = "Invalid day number";
                break;
        }

        System.out.println("Day: " + dayName);

        // Good practice: Close the scanner to prevent resource leaks (though in simple
        // apps JVM cleans up).
        scanner.close();
    }
}
