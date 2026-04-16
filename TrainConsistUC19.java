import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistUC19 {

    public static boolean binarySearch(String[] bogieIds, String key) {

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int comparison = bogieIds[mid].compareTo(key);

            if (comparison == 0) {
                return true;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] bogieIds = new String[n];

        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIds[i] = scanner.nextLine();
        }

        if (n == 0) {
            System.out.println("No bogies available. Search cannot be performed.");
            scanner.close();
            return;
        }

        Arrays.sort(bogieIds);

        System.out.print("Enter bogie ID to search: ");
        String key = scanner.nextLine();
        boolean found = binarySearch(bogieIds, key);

        if (found) {
            System.out.println("Bogie ID " + key + " found in the consist.");
        } else {
            System.out.println("Bogie ID " + key + " not found in the consist.");
        }

        scanner.close();
    }
}