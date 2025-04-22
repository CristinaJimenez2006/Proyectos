/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bloc5;

import java.util.Scanner;
/*
Cal fer un import
import java.util.Array; 
*/

/**
 *
 * @author crist
 */
public class pr20_1_sin_auxiliar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        Si tengo que recoger números y cadenas genero dos Scanners.
        */ 
        int[] vector1 = new int[10];
        int vector, vector2;
        
        System.out.print("Antes:");
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = (int) (Math.random() * 10);
            System.out.print(">>" + vector1[i]);

        }
        /*En comptes de posar el for per presentar l'array es pot fer ús d'aquesta eina, per estalviar-nos aquest for. 
        System.out.print(Arrays.toString(vector1));
        */
        System.out.println("");
        for (int i = 0; i < vector1.length / 2; i++) {
            vector = vector1[i];
            vector1[i] = vector1[vector1.length - 1 - i];
            vector1[vector1.length - 1 - i] = vector; 
        }
        System.out.print("Después:");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print(">>" + vector1[i]);
        }
        System.out.println("");
    }
}
