/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inicis;

import java.util.Scanner;

public class Bloc1_problema5 {
      public static void main (String[] args ){
 
        Scanner intro = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.println("Intro num1");
        num1 = intro.nextInt();
        System.out.println("Intro num2");
        num2 = intro.nextInt();
       
        System.out.println("La divisió de num1 i num2 és " + (num1%num2));
    }
}
