/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bucle4;

import java.util.Scanner;
import java.lang.Math; 
/**
 *
 * @author crist
 */
public class pr15 {
    public static void main (String []args){
        Scanner in = new Scanner (System.in);
        System.out.println("Introdueix un nombre...");
        double num;
        double resultat1, resultat2;
        num=in.nextDouble(); 
        
        for (double i=1; i<=num; i++){
            resultat1=0;
            resultat2=0;
            resultat1=Math.pow(i,2);
            resultat2=Math.pow(i,3);
            System.out.println("El nombre "+i+", el seu quadrat és "+resultat1+" i el seu cub és "+resultat2+ ".");
        }
    }
}
