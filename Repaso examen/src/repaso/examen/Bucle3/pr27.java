/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bucle3;


import java.util.Scanner;
/**
 *
 * @author crist
 */
public class pr27 {
    public static void main (String []args){
        Scanner in = new Scanner (System.in);
        System.out.println("Introdueix una cadena de nombre...");
        int dni; 
        dni = in.nextInt(); 
        
        char lletra; 
        
        String lletres= "TRWAGMYFPDXBNJZSQVHLCKE"; 
        
        lletra=lletres.charAt(dni%23); 
         
    }
}
