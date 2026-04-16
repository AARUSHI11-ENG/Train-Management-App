import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistUC17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of bogie types: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] bogieNames = new String[n];

        System.out.println("Enter bogie type names:");
        for (int i = 0; i < n; i++) {
            bogieNames[i] = scanner.nextLine();
        }

        Arrays.sort(bogieNames);

        System.out.println("Sorted Bogie Names: " + Arrays.toString(bogieNames));

        scanner.close();
    }
}