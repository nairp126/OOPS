
public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {12, 32, 22, 54, 39, 53, 19};

        int secondLargest = findSecondLargest(arr);
        System.out.println("Second Largest: " + secondLargest);
    }

    public static int findSecondLargest(int[] arr) {
        // Handle edge cases
        if (arr == null || arr.length < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Iterate through the array
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        // Check if second largest was updated
        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;
    }
}
