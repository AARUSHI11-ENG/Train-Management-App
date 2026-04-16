import java.util.Scanner;

public class TrainConsistsUC16 {

    // Method to perform Bubble Sort
    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;
        boolean swapped;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop for comparison
            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap logic
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;

                    swapped = true;
                }
            }

            // Optimization: stop if already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Method to display array
    public static void display(int[] capacities) {
        System.out.print("Sorted Passenger Bogie Capacities: ");
        for (int cap : capacities) {
            System.out.print(cap + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of passenger bogies: ");
        int n = scanner.nextInt();

        int[] capacities = new int[n];

        // Input capacities
        System.out.println("Enter capacities:");
        for (int i = 0; i < n; i++) {
            capacities[i] = scanner.nextInt();
        }

        // Perform Bubble Sort
        bubbleSort(capacities);

        // Display result
        display(capacities);

        scanner.close();
    }
}