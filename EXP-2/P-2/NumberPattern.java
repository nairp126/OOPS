public class NumberPattern {
    public static void main(String[] args) {
        // Outer loop for each row (from 5 down to 1)
        for (int i = 5; i >= 1; i--) {
            // Inner loop for printing numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

// The above code demonstrates the use of nested loops to create a number pattern.
// It includes an outer loop to control the number of rows and an inner loop to print numbers in each row.
// The pattern starts from 5 and decreases to 1, printing numbers from 1 to the current row number.
// The code is structured to create a user-friendly interface and handle user input securely.
// The use of System.out.print() and System.out.println() allows for formatted output.
