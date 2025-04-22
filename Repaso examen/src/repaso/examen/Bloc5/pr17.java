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
public class pr17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] matriz = new int[20];

        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = (int) (Math.random() * 20);
            if (matriz[i] > i) {
                System.out.println("Nombre major a la seva posició " + matriz[i] + " i posició " + i);
            }
        }
    }
}
