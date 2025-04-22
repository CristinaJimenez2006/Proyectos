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
public class Bloc3_problema7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num, numParells = 0;
        System.out.println("Introdueix un número");
        num = in.nextInt();

        while (num != 0) {
            if (num % 2 == 0) {
                System.out.println(">>" + num);
                numParells++;
            }
            num = in.nextInt();

        }
        System.out.println("Valors parells" + num);
    }
}
