public class ChildHealth {
    public static void main(String[] args) {
        double temperature = 39.5; // Child's temperature in degrees Celsius
        int age = 4; // Child's age in years
        double weight = 15; // Child's weight in kilograms
        double paracetamolDoseMin;
        double paracetamolDoseMax;

        // Conditional to check temperature and provide appropriate recommendations
        if (temperature < 38) {
            System.out.println("El nen està bé.");
        } else if (temperature < 39) {
            System.out.println("És recomanable donar-li un bany per baixar la temperatura.");
        } else {
            if (age < 3) {
                System.out.println("Has de consultar al médico.");
            } else if (age < 12) {
                // Calculate paracetamol dose for children under 12 years old
                paracetamolDoseMin = 10 * weight;
                paracetamolDoseMax = 15 * weight;
                System.out.println("Cal donar-li entre " + paracetamolDoseMin + " mg i " + paracetamolDoseMax + " mg de paracetamol cada 8 hores.");
            } else if (age >= 12) {
                System.out.println("Has de consultar al médico.");
            }
        }

        // Warning if the temperature is 40 degrees or higher
        if (temperature >= 40) {
            System.out.println("Avís: per més de 40, cal portar-lo a l'hospital.");
        }
    }
}
