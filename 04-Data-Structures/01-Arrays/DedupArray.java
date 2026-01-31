import java.util.*;

/**
 * This class demonstrates removing duplicates from an Array.
 * We use a HashSet because it handles uniqueness automatically.
 */
public class DedupArray {
    public static void main(String[] args) {
        // Step 1: Declare an array with duplicates
        int[] arr = { 2, 1, 3, 5, 5, 3, 2, 7, 2, 8, 7, 5 };

        // Step 2: Use HashSet to store unique elements
        // HashSet prevents duplicates (if you add '5' twice, it only keeps one).
        // Time Complexity: O(n) to insert all.
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : arr) {
            uniqueNumbers.add(num);
        }

        // Step 3: Convert HashSet to array
        // Note: HashSet does NOT guarantee order. If we needed order, we'd use
        // LinkedHashSet or TreeSet.
        int[] uniqueArr = new int[uniqueNumbers.size()];
        int index = 0;
        for (int num : uniqueNumbers) {
            uniqueArr[index++] = num;
        }

        // Optional: Sort for cleaner output
        Arrays.sort(uniqueArr);

        // Step 4: Print the unique sorted array
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Unique Array  : " + Arrays.toString(uniqueArr));
    }
}
