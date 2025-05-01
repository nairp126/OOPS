import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7): ");
        int day = scanner.nextInt();
        String dayName;

        // Determine the day of the week using a switch statement
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
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
                dayName = "Invalid day number";
                break;
        }

        System.out.println("Day: " + dayName);
        scanner.close();
    }
}

// The above code takes a number input from the user (1-7) and uses a switch statement to determine the corresponding day of the week. It prints the name of the day or an error message if the input is invalid. The program uses a Scanner object to read user input and closes it after use to prevent memory leaks. The switch statement is a clean and efficient way to handle multiple conditions based on the input value.   
// The program is structured to be user-friendly and handles input securely. It also demonstrates the use of switch statements in Java for conditional logic, making it a good example of basic control flow in Java programming.
// The program is simple and effective for determining the day of the week based on user input, making it a good example of basic control flow in Java programming. The use of a Scanner object for reading user input is a common practice in Java programming, and the program is structured to be user-friendly and handle input securely.
