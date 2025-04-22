/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructurada_Bloc2;

import java.util.Scanner;


public class Bloc2_problema14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introdueix un any");
        int any = in.nextInt();

        // un año es bisiesto si es divisble por 4 o por 100 y 400
        // != --> no és igual (negació). Ex: no es pot devidir per 100. 
   if (((any % 4 == 0)&&(any % 100 != 0))||(any % 400 == 0)){
                System.out.println("És un any bixest");
            } else {
                System.out.println("No és un any bixest");
            }
        }
    }

