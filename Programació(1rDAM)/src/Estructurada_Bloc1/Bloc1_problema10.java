/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructurada_Bloc1;

import java.util.Scanner;

public class Bloc1_problema10 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);

        int edat1, edat2, sumaEdat;

        System.out.println("Intro edat 1: ");
        edat1 = intro.nextInt();
        System.out.println("Intro edat 2: ");
        edat2 = intro.nextInt();
        sumaEdat = edat1 + edat2;
        System.out.println("La suma és " + sumaEdat);
    }
}

