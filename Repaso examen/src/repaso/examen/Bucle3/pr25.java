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
public class pr25 {
  public static void main (String []args){
     Scanner in = new Scanner (System.in);
     System.out.println("Introdueix una cadena de números");
     int enter; 
     enter= in.nextInt(); 
     String cadena =Integer.toString(enter);
     String cadenaamblletra="";
     char lletra='a';
     
     for (int i=0; i<cadena.length(); i++){
      
        cadenaamblletra=cadenaamblletra+cadena.charAt(i)+lletra;     
     }
      System.out.println(cadenaamblletra);
  }  
}
