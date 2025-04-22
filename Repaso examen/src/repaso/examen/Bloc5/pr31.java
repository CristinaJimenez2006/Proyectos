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
public class pr31 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int columnas = 50, filas = 10, suma = 0, max = 0, vendedor = 0, producto = 0, introducirproducto = 0;
        int[][] productosvendidos = new int[filas][columnas];

        //Apartat 1
        for (int i = 0; i < filas; i++) {
            System.out.print("|");
            for (int j = 0; j < columnas; j++) {
                productosvendidos[i][j] = (int) (Math.random() * 10);
                suma += productosvendidos[i][j];
                System.out.print(productosvendidos[i][j] + "|");
            }
            if (i == 0) {
                max = suma;
                vendedor = i;
            } else {
                if (suma > max) {
                    max = suma;
                    vendedor = i;
                }
            }
            suma = 0;
            System.out.println("");

        }
        System.out.println("");
        System.out.println("El vendedor " + vendedor + " ha sido quién ha vendido más unidades. En total, " + max + " unidades.");
        //Apartat 2
        for (int j = 0; j < columnas; j++) {
            for (int i = 0; i < filas; i++) {
                suma += productosvendidos[i][j];
            }
            if (j == 0) {
                max = suma;
                producto = j;
            } else {
                if (suma > max) {
                    max = suma;
                    producto = j;
                }
            }
            suma = 0;

        }
        System.out.println("El producto más vendido es " + producto + ". De este producto, se ha vendido un total de " + max + " unidades.");
        
        //Apartat 3
        System.out.println("Intro un producte...");
        introducirproducto = in.nextInt();

        for (int j = 0; j < filas; j++) {
            System.out.print("Venedor " + j + " -> "
                    + "articles " + introducirproducto);
            System.out.println(" venuts " + productosvendidos[j][introducirproducto]);
            //productosvendidos[j][introducirproducto] -> Ejemplo: introduzco el 2 -> productosvendidos[j][2]
        }
         // Apartat 4
        int[] codis = new int[3];
        // Introdueix els tres articles  dels que vols exrtreure la informació
        for (int i = 0; i < 3; i++) {
            //Podriem fer una comprovació
            codis[i] = in.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print("Venedor " + j + " -> "
                        + "articles " + codis[i]);
                System.out.println(" venuts " + productosvendidos[j][codis[i]]);
            }
            System.out.println("");
        }
    }
}
