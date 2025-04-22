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
public class Bloc3_problema5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
   
        int resultat;

        System.out.println("Quina taula vols...");
        int taula = in.nextInt();

        for (int num = 0; num <= 10; num++) {
            resultat = taula * num;
            System.out.println(taula + "*" + num + " = " + resultat);
         /* ALternativa-- 
            for (int i = 0; i <= 10; i++) {
              for (int j = 0; j <= 10; j++) {
             System.out.println(i + "*" + j + " = " + (i*j));
            }}*/

        }
    }
}
