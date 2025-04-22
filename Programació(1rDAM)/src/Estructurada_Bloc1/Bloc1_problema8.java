/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructurada_Bloc1;

import java.util.Scanner;
import java.lang.Math; 
/**
 *
 * @author crist
 */
public class Bloc1_problema8 {
      public static void main (String[] args ){
        
        Scanner intro = new Scanner(System.in);
        float radi;
        System.out.println("Introdueix el radi");
        radi = intro.nextFloat();
        
        double longitud = radi*Math.PI*2;
        
        System.out.println("La longitud de la circumfèrencia és" + longitud);
    }    
}
