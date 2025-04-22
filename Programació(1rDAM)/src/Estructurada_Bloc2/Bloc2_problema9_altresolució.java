/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructurada_Bloc2;

import java.util.Scanner;
/**
 *
 * @author crist
 */
public class Bloc2_problema9_altresolució {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcio;
        double resultat = 0, num1, num2;

        System.out.printf("\nIndica la primera xifra\n");
        num1 = in.nextFloat();
        System.out.printf("\n Indica la segona xifra:\n");
        num2 = in.nextFloat();
        System.out.printf("\nIndica quina operacio desitges\n");
        System.out.printf("\n1. Suma");
        System.out.printf("\n2. Resta");
        System.out.printf("\n3. Multiplicació");
        System.out.printf("\n4. Divisió entera");
        System.out.printf("\n5. Arrel quadrada\n\n");
        opcio = in.nextInt();
        switch (opcio) {
            case 1:
                resultat = num1 + num2;
                break;
            case 2:
                resultat = num1 - num2;
                ;
                break;
            case 3:
                resultat = num1 * num2;
                break;
            case 4:
                resultat = num1 / num2;
                break;
            case 5:
                System.out.printf("\nNomes mostrarem l arrel quadrada del primer nombre...");
                resultat = Math.sqrt(num1);
                break;
            default:
                System.out.printf("\nNo es una opcio valida");
        }
        System.out.printf("\n\n\nEl resultat es.... %.2f", resultat);

    }
}

