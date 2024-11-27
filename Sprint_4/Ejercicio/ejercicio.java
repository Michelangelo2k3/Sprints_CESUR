package Ejercicio;

import java.util.Scanner;

public class ejercicio {

    // Declaración de constantes para los puntos
    private static final int PUNTS_GERMA = 40;
    private static final int PUNTS_ZONA = 30;
    private static final int PUNTS_TREBALLA_ZONA = 20;
    private static final int PUNTS_DISCAPACITAT = 10;
    private static final int PUNTS_FAMILIA = 5;
    private static final int PUNTS_EXALUMNE = 5;

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puntuacio = 0; // Puntuación inicial

        // Demanem número de registre del nen
        System.out.print("Número de registre del nen: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Dada incorrecta. Ha de ser un número sencer.");
            return;
        }
        int numRegistre = scanner.nextInt();
        if (numRegistre < 1 || numRegistre > 499) {
            System.out.println("Número de registre erroni.");
            return;
        }

        // Preguntamos si tiene algún hermano en el centro
        puntuacio += preguntarPuntuacio(scanner, "Té algun germà al centre (0:no/1:si)?", PUNTS_GERMA);

        // Preguntamos si vive en la zona de la escuela
        puntuacio += preguntarPuntuacio(scanner, "Viu a la zona de l'escola (0:no/1:si)?", PUNTS_ZONA);

        // Preguntamos si el padre o madre trabajan en la zona de la escuela
        puntuacio += preguntarPuntuacio(scanner, "El pare o mare treballen a la zona de l'escola (0:no/1:si)?",
                PUNTS_TREBALLA_ZONA);

        // Preguntamos si tiene alguna discapacidad o enfermedad crónica
        puntuacio += preguntarPuntuacio(scanner, "Té alguna discapacitat o malaltia crònica (0:no/1:si)?",
                PUNTS_DISCAPACITAT);

        // Preguntamos si pertenece a una familia numerosa o monoparental
        puntuacio += preguntarPuntuacio(scanner, "Forma part d'una família nombrosa o monoparental (0:no/1:si)?",
                PUNTS_FAMILIA);

        // Preguntamos si el padre, madre o algún hermano son ex-alumnos
        puntuacio += preguntarPuntuacio(scanner, "El pare, mare o algun germà són ex-alumnes (0:no/1:si)?",
                PUNTS_EXALUMNE);

        // Mostramos la puntuación total
        System.out.println("La puntuació total és: " + puntuacio);
    }

    // Método auxiliar para preguntar y calcular puntos según la respuesta
    private static int preguntarPuntuacio(Scanner scanner, String mensaje, int punts) {
        System.out.print(mensaje + " ");
        if (!scanner.hasNextInt()) {
            System.out.println("Dada incorrecta. Ha de ser 0 o 1.");
            scanner.next(); // Limpiar la entrada incorrecta
            return 0;
        }
        int respuesta = scanner.nextInt();
        if (respuesta == 1) {
            return punts;
        } else if (respuesta != 0) {
            System.out.println("Dada incorrecta. Ha de ser 0 o 1.");
        }
        return 0;
    }
}
