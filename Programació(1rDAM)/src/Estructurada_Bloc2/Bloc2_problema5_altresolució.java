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
public class Bloc2_problema5_altresolució {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float preu_inicial, descompte1, preu_final, estalvi;
        float descompte2, descompte_a_aplicar;
        float limit = 1000;

        System.out.printf("Indica el descompte a majors de 1000 €...");
        descompte1 = in.nextFloat();
        System.out.printf("Indica el descompte a menors o iguals a 1000 €...");
        descompte2 = in.nextFloat();
        System.out.printf("Indica el preu inicial...");
        preu_inicial = in.nextFloat();
        if (preu_inicial > limit) {
            descompte_a_aplicar = descompte1;
        } else {
            descompte_a_aplicar = descompte2;
        }
        estalvi = preu_inicial * descompte_a_aplicar / 100;
        preu_final = preu_inicial - estalvi;
        System.out.printf("\nPreu inicial: %.2f euros", preu_inicial);
        System.out.printf("\nDescompte aplicat: %.2f %%", descompte_a_aplicar);
        System.out.printf("\nEstalvi  aplicat: %.2f euros", estalvi);
        System.out.printf("\nPreu final a pagar: %.2f euros", preu_final);

    }
}
