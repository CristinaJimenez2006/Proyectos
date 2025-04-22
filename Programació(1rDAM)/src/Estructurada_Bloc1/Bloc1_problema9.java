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
public class Bloc1_problema9 {
    public static void main (String[] args ){
 
        Scanner in = new Scanner(System.in);
        float catet1, catet2;
       
        System.out.print("Introdueix un número 1: ");
        catet1 = in.nextFloat();
       
        System.out.print("Introdueix un número 2: ");
        catet2 = in.nextFloat();
        
        double hipotenusa;
        
        hipotenusa = Math.sqrt((catet1*catet1)+(catet2*catet2));
        
        hipotenusa = Math.sqrt((Math.pow(catet1,2))+(Math.pow(catet2,2)));
        
        hipotenusa = Math.hypot(catet1,catet2);
        
        System.out.println("L'hipotenusa és" + hipotenusa);
    } 
}
