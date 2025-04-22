/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructurada_Bloc4;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Bloc4_problema_16 {
     public static void main(String[] args) {
        canner in = new Scanner(System.in);
        System.out.println("Introdueix un número");
        int num = 1;
        int cont = 0;
        boolean primer = true;
        while ( num != 0) {
            num = in.nextInt();
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    primer = false;
                    
                }
            }
        if (primer!=false){
            cont++;
        }
    }
         System.out.println("Número de nombres primers "+cont);

}
}
