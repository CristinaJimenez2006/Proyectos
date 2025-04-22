package com.mycompany.repasoexamen_2;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class pr17 {
    
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escriu una frase:");
        String frase = in.nextLine(); // Llegir la frase ingresada pel ususari
        frase= frase.toLowerCase(); 
        int i, cont = 0; 

        // Recórrer cada carácter de la frase
        for (i = 0; i < frase.length(); i++) {
            if ((frase.charAt(i) == 'a')) {
                cont++;
            }
        }

        System.out.println("La vocal 'a' apareix " + cont + " vegades.");
    } 
}

