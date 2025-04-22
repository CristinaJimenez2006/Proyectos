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
public class Bloc2_problema7_altresolucio {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introdueix un número");
        int num = in.nextInt();
        if ((num % 2 == 0) && (num % 3 == 0)){
            //&& significa y 
            System.out.println("El número és múltiple de 2 i de 3");
        } else if (num % 2 == 0) {
            System.out.println("El número és múltiple de 2 i no de 3");
        } else if (num % 4 == 0) {
            System.out.println("El número és múltiple de 2 i no de 3");
        } else {
            System.out.println("El número no és múltiple de 2, ni de 3");
        }
    }
}
