import java.util.Arrays;

public class RotateArrayRight {
    public static void main(String[] args) {
        // Step 1: Define array and rotation count
        int[] arr = {1, 2, 3, 4, 5};
        int K = 2;

        // Step 2: Handle edge cases
        if (arr.length == 0 || K % arr.length == 0) {
            System.out.println("Rotated Array: " + Arrays.toString(arr));
            return;
        }

        // Step 3: Optimize K
        K = K % arr.length;

        // Step 4: Rotate array using reverse technique
        reverse(arr, 0, arr.length - 1);  // Reverse entire array
        reverse(arr, 0, K - 1);            // Reverse first K elements
        reverse(arr, K, arr.length - 1);   // Reverse remaining elements

        // Step 5: Print the rotated array
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }

    // Function to reverse a part of the array
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
