import java.util.Scanner;

public class raffleApp {

    // Public constants for validation limits
    public static final int ID_MIN = 111;
    public static final int ID_MAX = 999;
    public static final int AGE_MIN = 14;
    public static final int AGE_MAX = 120;
    public static final int SALE_TYPE_MIN = 0;
    public static final int SALE_TYPE_MAX = 3;
    public static final int PURCHASE_MIN = 0;
    public static final int PURCHASE_MAX = 1000;
    public static final int PHONE_MIN = 111111111;
    public static final int PHONE_MAX = 999999999;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // Declare variables to store client data
            int id = 0, age = 0, saleType = 0, purchaseAmount = 0, phone = 0;
            boolean error = false;

            // Input and validate ID
            System.out.print("Id?: ");
            id = scanner.nextInt();
            if (id < ID_MIN || id > ID_MAX) {
                System.out.println("Error in data: ID out of range.");
                error = true;
            }

            // Input and validate age if no error
            if (!error) {
                System.out.print("Age?: ");
                age = scanner.nextInt();
                if (age < AGE_MIN || age > AGE_MAX) {
                    System.out.println("Error in data: Age out of range.");
                    error = true;
                }
            }

            // Input and validate sale type if no error
            if (!error) {
                System.out.println("Type of sale?:");
                System.out.println("  0: Free sale");
                System.out.println("  1: Pensioner");
                System.out.println("  2: Youth card");
                System.out.println("  3: Member");
                saleType = scanner.nextInt();
                if (saleType < SALE_TYPE_MIN || saleType > SALE_TYPE_MAX) {
                    System.out.println("Error in data: Invalid sale type.");
                    error = true;
                }
            }

            // Input and validate purchase amount if no error
            if (!error) {
                System.out.print("Purchase amount?: ");
                purchaseAmount = scanner.nextInt();
                if (purchaseAmount < PURCHASE_MIN || purchaseAmount > PURCHASE_MAX) {
                    System.out.println("Error in data: Invalid purchase amount.");
                    error = true;
                }
            }

            // Input and validate phone number if no error
            if (!error) {
                System.out.print("Phone number?: ");
                phone = scanner.nextInt();
                if (phone < PHONE_MIN || phone > PHONE_MAX) {
                    System.out.println("Error in data: Invalid phone number.");
                    error = true;
                }
            }

            // Display summary if no errors occurred
            if (!error) {
                String saleTypeText = switch (saleType) {
                    case 0 -> "free sale";
                    case 1 -> "pensioner";
                    case 2 -> "youth card";
                    case 3 -> "member";
                    default -> "unknown";
                };

                System.out.printf("Id: %d Age: %d Type: %s Amount: %d Phone: %d%n",
                        id, age, saleTypeText, purchaseAmount, phone);
            }

            scanner.close();
        }
    }
}
