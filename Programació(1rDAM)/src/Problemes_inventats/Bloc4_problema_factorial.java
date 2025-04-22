/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problemes_inventats;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Bloc4_problema_factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix un numero");
        int num = in.nextInt();
        int resultat = 1;
        // long es para numeros grandes y float también

        for (int i = num; i > 0; i--) {
            if (num == 0) {
                resultat = 1;
            } else {
                resultat = resultat * (i);
            }
        }
        System.out.println("El factorial és " + (resultat%10));
    }
}
