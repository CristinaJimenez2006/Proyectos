/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructurada_Bloc4;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Bloc4_problema9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix un número");
        int num = in.nextInt();
        boolean primer = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                primer = false;
            }
        }
    }
}
