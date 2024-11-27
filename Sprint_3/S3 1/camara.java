
import java.util.Locale;
import java.util.Scanner;

public class camara {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            input.useLocale(Locale.US);

            double llarg = 300.3;

            double ample1, ample2, profunditat1, profunditat2;

            int area1, area2, vol1, vol2, nouProfunditat1, nouProfunditat2, nouVol1, nouVol2;

            System.out.println("Introduzca el valor del amplio de la piscina 1 ");

            ample1 = input.nextDouble();

            System.out.println("Introduzca el valor de la profundidad de la piscina 1 ");
            profunditat1 = input.nextDouble();
            System.out.println("Introduzca el valor del amplio de la piscina 2 ");
            ample2 = input.nextDouble();
            System.out.println("Introduzca el valor de la profundidad de la piscina 2 ");
            profunditat2 = input.nextDouble();
            area1 = (int) (llarg * ample1);
            area2 = (int) (llarg * ample2);
            vol1 = (int) (area1 * profunditat1);
            vol2 = (int) (area2 * profunditat2);
            double ampleTot = ample1 + ample2;
            double llargTot = llarg;
            double areaTot = area1 + area2;
            double volTot = vol1 + vol2;
            nouProfunditat1 = (int) profunditat2;
            nouProfunditat2 = (int) profunditat1;
            nouVol1 = area1 * nouProfunditat1;
            nouVol2 = area2 * nouProfunditat2;

            System.out.println("Àrea 1 = " + area1 + ", àrea 2 = " + area2);
            System.out.println("Àrea tot = " + areaTot);
            System.out.println("Volum 1 = " + vol1 + ", volum 2 = " + vol2);
            System.out.println("Volum tot = " + volTot);
            System.out.println("Llarg piscines juntes = " + llargTot);
            System.out.println("Ample piscines juntes = " + ampleTot);
            System.out.println("Volum nou piscina 2 = " + nouVol1);
            System.out.println("Volum nou piscina 1 = " + nouVol2);
        }
    }
}
