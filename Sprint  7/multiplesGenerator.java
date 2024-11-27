
public class multiplesGenerator {

    public static void main(String[] args) {
        final int MIN_NUMBER = 1;
        final int MAX_NUMBER = 20;
        final int MAX_MULTIPLE = 100;

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int baseNumber = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter a base number between " + MIN_NUMBER + " and " + MAX_NUMBER + ": ");
            if (scanner.hasNextInt()) {
                baseNumber = scanner.nextInt();
                if (baseNumber >= MIN_NUMBER && baseNumber <= MAX_NUMBER) {
                    isValid = true; // Exit the loop if the number is valid
                } else {
                    System.out.println("Invalid number. Please enter a number between 1 and 20.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear the input buffer
            }
        }

        // Part B: Generate and display multiples using while loop
        int multiple = 0;
        while (multiple <= MAX_MULTIPLE) {
            System.out.println(multiple);
            multiple += baseNumber; // Increment by the base number
        }

        scanner.close();
    }
}
