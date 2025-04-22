/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructurada_Bloc3;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Bloc3_problema11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int resultat, total5=0, total7=0;

        System.out.println("Indica si vols saber la suma dels 20 múltiples de 7 o de 5");
        int num = in.nextInt();

         if ((num % 5 != 0) && (num % 7 != 0)) {
                System.out.println("Invàlid ");
         }else{     
         for (int i = 0; i <= 20; i++) {
           
            if (num % 5 == 0) {
                resultat = num * i;
                total5 = resultat + total5;

            } else if (num%7==0) {
                resultat = num * i;
                total7 = resultat + total7;

            }
        }
        System.out.println("La suma dels 20 primers números mútiples de 5 són " + total5);
        System.out.println("La suma dels 20 primers números mútiples de 7 són " + total7);
    }
}}
