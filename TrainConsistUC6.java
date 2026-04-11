import java.util.HashMap;
import java.util.Map;

public class TrainConsistUC6 {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("=======================================\n");

        // Create HashMap for bogie capacities
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Insert key-value pairs
        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("Cargo", 120);
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);

        // Display details
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");
    }
}