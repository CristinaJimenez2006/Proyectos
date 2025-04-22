/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bloc5;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class pr7 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        char[] caracteres = new char[10];

        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        boolean check = false;
        char letra1;
        for (int i = 0; i < caracteres.length; i++) {
            check = false;
            letra1 = alfabeto.charAt((int) (Math.random() * caracteres.length));
            for (int j = 0; j <= i; j++) {
                if (caracteres[j] == letra1) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                caracteres[i] = letra1;
            } else {
                i--;
            }
        }

        for (int i = 0; i < caracteres.length; i++) {
            System.out.print("  - " + caracteres[i]);
        }
        System.out.println();
        // Pedir una palabra al usuario
        System.out.println("Introdueix una paraula:");
        String paraula = lector.nextLine();

        int cont = 0;
        for (int i = 0; i < paraula.length(); i++) {
            char letra = paraula.charAt(i);

            // Buscar la letra en el arreglo de caracteres
            for (int j = 0; j < caracteres.length; j++) {
                if (letra == caracteres[j]) {
                    cont++;
                }
            }

            // Imprimir resultado final
        }
        if (cont == paraula.length()) {
            System.out.println("Puc escriure la paraula.");
        } else {
            System.out.println("No puc escriure la paraula.");
        }
    }
}
