/**
 * This class demonstrates "Nested Loops".
 * A nested loop is a loop inside another loop.
 * This is commonly used for working with 2D structures like grids, tables, or
 * patterns.
 */
public class PatternPrinting {
    public static void main(String[] args) {
        // Outer loop: Controls the ROWS.
        // We start at i=5 and count down to 1.
        for (int i = 5; i >= 1; i--) {
            // Inner loop: Controls the COLUMNS (content in each row).
            // This loop runs completely (from j=1 to j=i) for EACH single iteration of the
            // outer loop.
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); // Use print() to stay on the same line
            }
            // Move to the next line after the inner loop finishes printing the row
            System.out.println();
        }
    }
}
