package com.mycompany.repasoexamen_2;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class pr19 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix una frase...");
        String frase = in.nextLine();
        String vocals = "aeiou";
        int cont = 0;

        for (int i = 0; i < frase.length(); i++) {

            for (int j = 0; j < vocals.length(); j++) {
                 if (frase.charAt(i) == vocals.charAt(j))  {
                    cont++;
                }
            }
        }
          System.out.println("La vocals apareixen " + cont);
    }
}
