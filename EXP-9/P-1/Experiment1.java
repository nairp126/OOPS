import java.util.ArrayList;

public class Experiment1 {
    
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        // Only loop until the square root of num for efficiency
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        // Create an ArrayList to hold Integer objects
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Adding numbers using autoboxing (primitive int becomes an Integer)
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(17);
        numbers.add(20);
        
        // Iterate through the ArrayList, unbox each Integer, and check if it's prime
        for (Integer num : numbers) {
            // Autounboxing occurs when passing num to isPrime
            System.out.println("Number " + num + " is prime? " + isPrime(num));
        }
    }
}
// The above code demonstrates the use of an ArrayList to manage a list of Integer objects.
// It includes adding numbers, checking if they are prime, and printing the results.