package com.mycompany.repasoexamen_2;

import java.util.Scanner; 
/**
 *
 * @author crist
 */
public class pr16 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introdueix una frase...");
        String frase = in.nextLine();

        // Recorrer la frase desde el último carácter hasta el primero
        for (int i = frase.length() - 1; i >= 0; i--) {
            System.out.print(frase.charAt(i));
        }
        System.out.println();
    }
}
