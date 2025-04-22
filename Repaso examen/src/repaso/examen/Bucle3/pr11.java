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
public class pr11 {
    public static void main (String []args){
       Scanner in = new Scanner (System.in);
       System.out.println("Introdueix un número...");
       int num, i, resultat=1;
  
      num = in.nextInt(); 
      if (num ==0){
         resultat=1;  
      }else {
       for (i=1; i<=num; i++){
           resultat= resultat*i; 
       }
      }
      System.out.println("El factorial de "+num+" és "+resultat);
    }
}
