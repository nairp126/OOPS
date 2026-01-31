import java.util.ArrayList;

/**
 * This class demonstrates "ArrayLists".
 * Unlike Arrays (int[]), ArrayLists resize dynamically. You can add as many
 * items as you want.
 */
public class ArrayListPrime {

    /**
     * Helper to check if a number is prime.
     * Efficiency: Loops only up to sqrt(num).
     */
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // 1. Creation
        // Note: ArrayLists only hold Objects, not primitives.
        // We use 'Integer' wrapper class instead of 'int'.
        ArrayList<Integer> numbers = new ArrayList<>();

        // 2. Add elements (Autoboxing)
        // Java automatically converts primitive 'int' 2 into new Integer(2).
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(17);
        numbers.add(20);

        System.out.println("List: " + numbers);

        // 3. Iteration (Unboxing)
        // We iterate through the list. Java extracts 'int' from 'Integer'
        // automatically.
        for (Integer num : numbers) {
            String result = isPrime(num) ? "Prime" : "Not Prime";
            System.out.println("Number " + num + " is " + result);
        }
    }
}