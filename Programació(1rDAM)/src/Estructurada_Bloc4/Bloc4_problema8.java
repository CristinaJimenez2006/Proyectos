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
public class Bloc4_problema8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix un número");
        int num = in.nextInt();
        
       int suma=0; 
        
       for (int i = 1; i<=num/2; i ++){
         if (num%i==0){
             suma=suma+num;
         }  
       }
       if (suma==num){
           System.out.println("És un nombre perfecte");
       }else{
           System.out.println("No és un nombre perfecte");  
       }
    }
}
