/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problemes_inventats;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Bloc2_problema_inventat2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;

        for (num = 0; num <= 25; num++) {
            System.out.println(">>" + num);
        }
        System.out.println("Altre mètode ----");
        num = 1;
        while (num <= 25) {
            System.out.println(">>" + num);
            num++;
        }
        System.out.println("Altre mètode ----");
        num = 1;
        do{
            System.out.println(">>" + num);
            num++;
        } while (num<=25);
    }
}
