import java.util.regex.Pattern;

public class TrainConsistUC11 {

    private static final Pattern TRAIN_ID_PATTERN =
            Pattern.compile("TRN-\\d{4}");

    private static final Pattern CARGO_CODE_PATTERN =
            Pattern.compile("PET-[A-Z]{2}");

    public static boolean isValidTrainID(String input) {
        return TRAIN_ID_PATTERN.matcher(input).matches();
    }

    public static boolean isValidCargoCode(String input) {
        return CARGO_CODE_PATTERN.matcher(input).matches();
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC11 - Validate Train ID & Cargo Codes");
        System.out.println("=======================================\n");

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        System.out.println("Train ID: " + trainId +
                " -> " + (isValidTrainID(trainId) ? "Valid" : "Invalid"));

        System.out.println("Cargo Code: " + cargoCode +
                " -> " + (isValidCargoCode(cargoCode) ? "Valid" : "Invalid"));

        System.out.println("\nUC11 validation completed...");
    }
}