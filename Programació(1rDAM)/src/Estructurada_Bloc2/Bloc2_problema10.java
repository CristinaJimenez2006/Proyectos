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
public class Bloc2_problema10 {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcio;
        double resultat = 0, costat1, costat2;

        System.out.printf("\nIndica la figura geomètrica\n");
        System.out.printf("\n1. Quadrat");
        System.out.printf("\n2. Rectangle");
        System.out.printf("\n3. Triangle");
        System.out.printf("\n4. Cercle\n");
        opcio = in.nextInt();

        if (opcio == 1) {
            System.out.println("Introdueix el costat...");
            costat1 = in.nextDouble();
            resultat = Math.pow(costat1, 2);

        } else if (opcio == 2) {
            System.out.println("Introdueix el costat...");
            costat1 = in.nextDouble();
            resultat = Math.pow(costat1, 2);
        } else if (opcio == 3) {
            System.out.println("Introdueix el costat...");
            costat1 = in.nextDouble();
            resultat = Math.pow(costat1, 2);
        } else if (opcio == 4) {
            System.out.println("Introdueix el costat...");
            costat1 = in.nextDouble();
            resultat = Math.pow(costat1, 2);
        } else {
            System.out.println("Què maaaaaal !!");
        }

        
        switch(opcio)
                {
                case 1 :
                        System.out.printf("\nIntrodueix el valor del costat en cm..");
                        costat1=in.nextInt();
                        resultat= costat1*costat1;
                        break;
                case 2 :
                        System.out.printf("\nIntrodueix el valor de la base en cm..");
                        costat1=in.nextInt();
                        System.out.printf("\nIntrodueix el valor de l'altura en cm..");
                        costat2=in.nextInt();
                        resultat= costat1*costat2;
                        break;
                case 3 :
                        System.out.printf("\nIntrodueix el valor de la base en cm..");
                        costat1=in.nextInt();
                        System.out.printf("\nIntrodueix el valor de l'altura en cm..");
                        costat2=in.nextInt();
                        resultat= (costat1*costat2)/2;
                        break;
                case 4 :
                        System.out.printf("\nIntrodueix el valor del radi en cm..");
                        costat1=in.nextInt();
                        resultat= Math.PI*(costat1*costat1);
                        break;
                default :
                        System.out.printf("\nNo es una opció valida");
                }
         
        System.out.printf("\n\n\nEl resultat es.... %.2f centímetres quadrats", resultat);

    }
}  
