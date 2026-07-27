import java.util.HashMap;
import java.util.Map;

public class Map() {
    public static void main(String[] args) {
        // 1. Create a Map (Key: String, Value: Integer)
        Map<String, Integer> inventory = new HashMap<>();

        // 2. Add elements using put()
        inventory.put("Apple", 50);
        inventory.put("Banana", 30);
        inventory.put("Orange", 20);

        // 3. Access a value using get()
        int appleCount = inventory.get("Apple"); 
        System.out.println("Apples in stock: " + appleCount); // Outputs 50

        // 4. Update a value (overwrites existing key)
        inventory.put("Banana", 45); 

        // 5. Remove an element
        inventory.remove("Orange");

        // 6. Iterate through the Map using a for-each loop
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
