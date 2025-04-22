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
public class Bloc2_problema2 {
     public static void main (String[] args ){
        Scanner in = new Scanner(System.in);
      
        System.out.println("Introdueix un número");
        int num1 = in.nextInt();
       
        System.out.println("Introdueix un número");
        int num2 = in.nextInt();
        
        if (num1>num2){
        System.out.println("El número 1 és el més gran");
        
        } else if (num1>num2){
         System.out.println("El número 2 és el més gran");
        
        } else {
            System.out.println("Els dos números són iguals");
          }
     }
}
