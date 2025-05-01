import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Experiment5 {
    
    public static void main(String[] args) {
        // Create an ArrayList with duplicate integer values
        ArrayList<Integer> numsList = new ArrayList<>(Arrays.asList(3, 5, 3, 8, 2, 5));
        
        // Convert the ArrayList to a HashSet to eliminate duplicates
        HashSet<Integer> uniqueNums = new HashSet<>(numsList);
        
        // Calculate the sum of the unique values
        int sum = 0;
        for (int num : uniqueNums) {
            sum += num;
        }
        
        System.out.println("Unique values: " + uniqueNums);
        System.out.println("Sum of unique values: " + sum);
    }
}
// The above code demonstrates the use of an ArrayList to manage a list of Integer objects with duplicates.
// It includes converting the list to a HashSet to eliminate duplicates and calculating the sum of unique values.