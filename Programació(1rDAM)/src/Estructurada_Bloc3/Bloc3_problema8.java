/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructurada_Bloc3;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Bloc3_problema8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num, contpositiu = 0, contnegatiu = 0;
        System.out.println("Introdueix un número");
        num = in.nextInt();

        while (num != 0) {
            if (num > 0) {
                contpositiu++;
            } else {
                contnegatiu++;
            }

            num = in.nextInt();
        }
        System.out.println("Numeros positius" + contpositiu);
        System.out.println("Numeros negatius" + contnegatiu);

    }
}
