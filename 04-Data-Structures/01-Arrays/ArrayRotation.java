import java.util.Arrays;

/**
 * This class demonstrates "Array Rotation" using the Reversal Algorithm.
 * Time Complexity: O(n) - We touch each element twice.
 * Space Complexity: O(1) - No extra array created.
 */
public class ArrayRotation {
    public static void main(String[] args) {
        // Step 1: Define array and rotation count
        int[] arr = { 1, 2, 3, 4, 5 };
        int K = 2; // Number of right rotations

        // Step 2: Handle edge cases
        // If K is 0 or array is empty, no rotation needed.
        if (arr.length == 0 || K % arr.length == 0) {
            System.out.println("Rotated Array: " + Arrays.toString(arr));
            return;
        }

        // Step 3: Optimize K
        // Rotating 7 times on size 5 is same as rotating 2 times (7 % 5 = 2).
        K = K % arr.length;

        System.out.println("Original: " + Arrays.toString(arr));

        // Step 4: The Reversal Algorithm
        // To rotate Right by K:
        // 1. Reverse entire array.
        // 2. Reverse first K elements.
        // 3. Reverse remaining N-K elements.

        reverse(arr, 0, arr.length - 1); // [5, 4, 3, 2, 1]
        reverse(arr, 0, K - 1); // [4, 5, 3, 2, 1] (First 2 fixed)
        reverse(arr, K, arr.length - 1); // [4, 5, 1, 2, 3] (Rest fixed)

        // Step 5: Print the rotated array
        System.out.println("Rotated : " + Arrays.toString(arr));
    }

    /**
     * Helper method to reverse a portion of an array in-place.
     * Uses two-pointer technique.
     */
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
