package Modularitat;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class pr4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix un número");
        double numero = in.nextInt();

        numero = resultat(numero);
        System.out.println(" Resultat: " + numero);

    }

    public static double resultat(double number) {
        double resultat;
        resultat = (number * 2) - (Math.pow(number, 2));
        return resultat;
    }
}
