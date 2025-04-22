/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bucle3;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class pr25_2 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introdueix una cadena de números");
        String cadena = lector.nextLine();
        cadena = cadena.toLowerCase();
        String numerosvalids = "0123456789";
        String cadenanumeros = "";
        int cadenanova, resultat;

        for (int i = 0; i < cadena.length(); i++) {
            for (int u = 0; u < numerosvalids.length(); u++) {
                // if (Character.isDigit(caracter)==true){}
                if (cadena.charAt(i) == numerosvalids.charAt(u)) {
                    cadenanumeros = cadenanumeros + cadena.charAt(i);
                }
            }
        }
        cadenanova = Integer.parseInt(cadenanumeros);
        resultat = cadenanova * 5;
        System.out.println("El resultat és " + resultat);
    }
}
