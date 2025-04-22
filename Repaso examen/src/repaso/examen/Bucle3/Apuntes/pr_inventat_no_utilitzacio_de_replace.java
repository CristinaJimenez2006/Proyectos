/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bucle3.Apuntes;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class pr_inventat_no_utilitzacio_de_replace {
     public static void main(String[] args) {
        String cadena="La casa es enorme";
        String cadenanova=""; 
        System.out.println(cadena);
        char char1='a'; 
        char char2='o'; 
        
        for (int i=0; i<cadena.length(); i++){
            if (cadena.charAt(i)==char1){
                cadenanova+=char2;
            }else{
                cadenanova+=cadena.charAt(i); 
            }
        }
         System.out.println("Amb la sustitució: "+cadenanova);
     }
}
