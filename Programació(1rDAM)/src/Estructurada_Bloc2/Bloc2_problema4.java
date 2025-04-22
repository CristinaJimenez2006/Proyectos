/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructurada_Bloc2;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Bloc2_problema4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introdueix un número");
        int num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número és parell");
        } else {
            System.out.println("El número és imparell");
        }
    }
}
