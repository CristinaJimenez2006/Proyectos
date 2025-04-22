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
public class Bloc3_problema4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
   
        int hores, minuts, segons;
        System.out.println("Introdueix les hores");
        hores = in.nextInt();
        System.out.println("Introdueix els minuts");
        minuts = in.nextInt();
        System.out.println("Introdueix els segons");
        segons = in.nextInt();

        segons = segons + 1;

        if (segons == 60) {
            segons = 0;
            minuts = minuts + 1;
            if (minuts == 60) {
                minuts = 0;
                hores = hores + 1;
            }
        }
         System.out.println(hores + ">>" + minuts + ">>" + segons);
    }
}
        



