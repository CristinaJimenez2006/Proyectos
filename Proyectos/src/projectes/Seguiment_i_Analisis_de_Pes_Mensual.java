package projectes;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Seguiment_i_Analisis_de_Pes_Mensual {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pesActual, pesAnterior = 0;
        float max = 0, min = 0, mitjana, sumaPesos = 0;
        float pesPrimer = 0, pesDarrer = 0;
        int i = 0, mesos = 6;
        int augmentat = 0, disminuit = 0, mantingut = 0;
        for (i = 1;
                i <= mesos;
                i++) {
            System.out.println("Pes actual");
            pesActual = sc.nextFloat();
            sumaPesos = sumaPesos + pesActual;
            if (pesActual > max) {
                max = pesActual;
            }
            if (pesActual < min) {
                min = pesActual;
            }
            // Primera volta
            if (i == 1) {
                max = pesActual;
                min = pesActual;
                pesPrimer = pesActual;
            } else {
                System.out.println("La variacio és " + (pesActual - pesAnterior));
                if (pesActual - pesAnterior > 0) {
                    augmentat++;
                } else if (pesActual - pesAnterior < 0) {
                    disminuit++;
                } else {
                    mantingut++;

                }
                if (i == mesos) {
                    pesDarrer = pesActual;
                }
            }
            pesAnterior = pesActual;
        }

        System.out.println(
                "Pes màxim: " + max);
        System.out.println(
                "Pes mínim: " + min);
        System.out.println(
                "mitjana: " + (sumaPesos / (i - 1)));
        System.out.println(
                "Diferència primer darrer " + (pesDarrer - pesPrimer));
        System.out.println(
                "Augments " + augmentat);
        System.out.println(
                "Disminucions " + disminuit);
        System.out.println(
                "Mantingut" + mantingut);
}
}
