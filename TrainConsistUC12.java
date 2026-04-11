import java.util.ArrayList;
import java.util.List;

public class TrainConsistUC12 {

    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return type + " -> " + cargo;
        }
    }

    // Safety validation method
    public static boolean isSafe(List<GoodsBogie> bogies) {
        return bogies.stream()
                .allMatch(b ->
                        !b.type.equalsIgnoreCase("Cylindrical")
                        || b.cargo.equalsIgnoreCase("Petroleum"));
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC12 - Safety Compliance Check");
        System.out.println("=======================================\n");

        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        boolean safe = isSafe(bogies);

        System.out.println("Goods Bogies:");
        bogies.forEach(System.out::println);

        System.out.println("\nTrain Safety Compliant: " + safe);
        System.out.println("\nUC12 safety validation completed...");
    }
}