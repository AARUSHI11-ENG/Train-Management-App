import java.util.ArrayList;
import java.util.List;

public class TrainConsistUC10 {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    // Reduce method
    public static int totalSeats(List<Bogie> bogies) {
        return bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC10 - Count Total Seats in Train");
        System.out.println("=======================================\n");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        int total = totalSeats(bogies);

        System.out.println("Total Seating Capacity: " + total);
        System.out.println("\nUC10 aggregation completed...");
    }
}
