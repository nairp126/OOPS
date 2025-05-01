import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Step 1: Declare an array
        int[] arr = {2, 1, 3, 5, 5, 3, 2, 7, 2, 8, 7, 5};

        // Step 2: Use HashSet to store unique elements
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : arr) {
            uniqueNumbers.add(num);
        }

        // Step 3: Convert HashSet to sorted array
        int[] uniqueArr = new int[uniqueNumbers.size()];
        int index = 0;
        for (int num : uniqueNumbers) {
          uniqueArr[index++] = num;
        }


        // Step 4: Print the unique sorted array
        System.out.println("Unique Array: " + Arrays.toString(uniqueArr));
    }
}

// The above code demonstrates the use of a HashSet to manage a collection of integers with duplicates. 
// It includes adding integers, converting the HashSet to a sorted array, and printing the unique integers.
