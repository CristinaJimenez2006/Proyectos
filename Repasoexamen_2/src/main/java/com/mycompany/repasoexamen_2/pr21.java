package com.mycompany.repasoexamen_2;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class pr21 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introdueix una paraula...");
        String paraula = lector.nextLine();
        int cont = 0;

        for (int i = 0; i < paraula.length(); i++) {
            if (paraula.charAt(i) == paraula.charAt((paraula.length()) - 1 - i)) {
                cont++;
            }
        }
        if (cont == paraula.length()) {
            System.out.println("És una paraula palíndrom.");
        } else {
            System.out.println("No és una paraula palíndrom.");
        }
    }
}
