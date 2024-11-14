
import java.util.Locale;
import java.util.Scanner;

public class camaraM {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            input.useLocale(Locale.US);

            int puntos = 0;

            System.out.print("Num. de registre del nen: ");
            int numRegistro = input.nextInt();

            System.out.print("Té algun germà al centre (0: no / 1: sí)?: ");
            int hermanoCentro = input.nextInt();
            if (hermanoCentro == 1) {
                puntos += 40;
            }

            System.out.print("Viu a la mateixa població que l'escola (0: no / 1: sí)?: ");
            int viveMismaPoblacion = input.nextInt();

            if (viveMismaPoblacion == 1) {
                puntos += 30;
            } else {

                System.out.print("El pare o mare treballa a la mateixa població (0: no / 1: sí)?: ");
                int padresTrabajanMismaPoblacion = input.nextInt();
                if (padresTrabajanMismaPoblacion == 1) {
                    puntos += 20;
                }
            }

            System.out.print("Té alguna discapacitat igual o superior al 33% o malaltia crònica (0: no / 1: sí)?: ");
            int tieneDiscapacidad = input.nextInt();
            if (tieneDiscapacidad == 1) {
                puntos += 10;
            }

            System.out.print("Forma part d'una família nombrosa o monoparental (0: no / 1: sí)?: ");
            int esFamiliaNumerosa = input.nextInt();
            if (esFamiliaNumerosa == 1) {
                puntos += 15;
            }

            System.out.print(
                    "El pare, mare, tutor legal o germà ha estat escolaritzat a la mateixa escola (0: no / 1: sí)?: ");
            int familiarEscolarizado = input.nextInt();
            if (familiarEscolarizado == 1) {
                puntos += 5;
            }

            System.out.println("Num. de registre: " + numRegistro + ", Punts totals: " + puntos);
        }
    }
}
