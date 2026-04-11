import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainConsistUC13 {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    // Loop filtering
    public static List<Bogie> filterWithLoop(List<Bogie> bogies) {
        List<Bogie> result = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                result.add(b);
            }
        }
        return result;
    }

    // Stream filtering
    public static List<Bogie> filterWithStream(List<Bogie> bogies) {
        return bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC13 - Performance Comparison");
        System.out.println("=======================================\n");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("General", 90));
        bogies.add(new Bogie("First Class", 24));

        long startLoop = System.nanoTime();
        List<Bogie> loopResult = filterWithLoop(bogies);
        long endLoop = System.nanoTime();

        long startStream = System.nanoTime();
        List<Bogie> streamResult = filterWithStream(bogies);
        long endStream = System.nanoTime();

        System.out.println("Loop Result Count: " + loopResult.size());
        System.out.println("Loop Time: " + (endLoop - startLoop) + " ns");

        System.out.println("\nStream Result Count: " + streamResult.size());
        System.out.println("Stream Time: " + (endStream - startStream) + " ns");

        System.out.println("\nUC13 benchmarking completed...");
    }
}