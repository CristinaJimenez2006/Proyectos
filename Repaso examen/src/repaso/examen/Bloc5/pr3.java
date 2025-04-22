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
public class pr3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] posicions = new int[100];
        int suma = 0;
        for (int i = 0; i < posicions.length; i++) {
            posicions[i] = (int) (Math.random() * 100);
            if (i % 3 == 0) {
                suma += posicions[i];
            }
        }
    }
}
