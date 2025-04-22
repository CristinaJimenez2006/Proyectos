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
public class Bloc2_problema7_altresolucio2 {
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor;

        System.out.println("Escriu un valor");
        valor = in.nextInt();

        if (valor % 2 == 0) {
            if (valor % 3 == 0) {
                System.out.println("És divisible per 2 i per 3");
            } else {
                System.out.println("És divisible només per 2");
            }
        } else {
            if (valor % 3 == 0) {
                System.out.println("és divisible per 3");
            } else {
                System.out.println("No és divisible per cap del dos");
            }
        }

    }

}
  

