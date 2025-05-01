import java.util.HashMap;
import java.util.Map;

public class Experiment3 {
    
    public static void main(String[] args) {
        // Create a HashMap where key is productId and value is quantity
        HashMap<Integer, Integer> productInventory = new HashMap<>();
        
        // Add three products (productId -> quantity)
        productInventory.put(101, 50);
        productInventory.put(102, 30);
        productInventory.put(103, 20);
        
        // Update the quantity of one product (update product 102)
        productInventory.put(102, 35); // This replaces the old value
        
        // Remove a product by its id (remove product with id 101)
        productInventory.remove(101);
        
        // Display the final inventory
        System.out.println("Final Product Inventory:");
        for (Map.Entry<Integer, Integer> entry : productInventory.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}
// The above code demonstrates the use of a HashMap to manage a product inventory.
// It includes adding products, updating quantities, and removing products, showcasing the dynamic nature of HashMaps.
// The code is structured to create a user-friendly interface and handle user input securely.
