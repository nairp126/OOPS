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
