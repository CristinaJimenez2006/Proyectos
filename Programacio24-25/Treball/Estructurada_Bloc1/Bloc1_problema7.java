
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inicis;
import java.util.Scanner;
import java.lang.Math;

public class Bloc1_problema7 {
    
     public static void main (String[] args ){
 
        Scanner in = new Scanner(System.in);
        float num;
        System.out.print("Introdueix un número entre 9999 i 100.00: ");
        num = in.nextFloat();
        
        double resultat = Math.sqrt(num);
        
        System.out.println("L'arrel quadrdad de " + num + " és " + resultat);
    } 
}
