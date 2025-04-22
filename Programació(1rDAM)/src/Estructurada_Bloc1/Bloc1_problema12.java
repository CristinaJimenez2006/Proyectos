/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructurada_Bloc1;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Bloc1_problema12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int segonsTotals, segons, dies, hores, minuts;

        System.out.println("Intro segons");
        segonsTotals = in.nextInt();

        segons = segonsTotals % 60;
        segonsTotals = segonsTotals / 60;
        minuts = segonsTotals % 60;
        segonsTotals = segonsTotals / 60;
        hores = segonsTotals % 24;
        dies = segonsTotals / 24;

        System.out.printf("%d dies, %d hores, %d minuts, %d segons \n",
                dies, hores, minuts, segons);
    }
}
