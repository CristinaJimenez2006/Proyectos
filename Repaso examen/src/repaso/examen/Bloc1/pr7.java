/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bloc1;

import java.util.Scanner;
import java.lang.Math; 
/**
 *
 * @author crist
 */
public class pr7 {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        double n;
        double arrel;
        
        System.out.print("escriu un numero: ");
        n = in.nextDouble();
        arrel=Math.sqrt(n);
        //System.out.printf("L'arrel quadrada de %.2f  és ....%.2f",n,arrel);
        System.out.printf("L'arrel quadrada de %.1f  és %.2f",n,arrel);
        }   
}


