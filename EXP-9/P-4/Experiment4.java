import java.util.Arrays;
import java.util.HashSet;

public class Experiment4 {
    
    public static void main(String[] args) {
        // Array of names with duplicates
        String[] namesArray = {"Aman", "Varchasv", "Sourabh", "Varchasv", "Aman"};
        
        // Create a HashSet from the array to eliminate duplicates
        HashSet<String> uniqueNames = new HashSet<>(Arrays.asList(namesArray));
        
        // Check if a specific name exists (e.g., "Sourabh")
        String searchName = "Sourabh";
        if (uniqueNames.contains(searchName)) {
            System.out.println(searchName + " exists in the set.");
        } else {
            System.out.println(searchName + " does not exist in the set.");
        }
        
        // Print the unique names
        System.out.println("Unique names: " + uniqueNames);
    }
}
// The above code demonstrates the use of a HashSet to manage a collection of names.
// It includes adding names, checking for existence, and printing the unique names, showcasing the dynamic nature of HashSets.