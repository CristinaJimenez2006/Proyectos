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
public class pr25_3 {
    public static void main (String []args){
        Scanner in = new Scanner (System.in); 
         String cadena = "2325-65-63-2-254-236"; 
         String numeros = "";
         String vacio = ""; 
         int cadenanumerosint, resultat=0, i; 
         for (i=0; i<cadena.length(); i++){
             if (cadena.charAt(i)!='-'){
                numeros += cadena.charAt(i);
                 
             }else if (cadena.charAt(i)=='-'){
               cadenanumerosint=Integer.parseInt(numeros);
               resultat +=cadenanumerosint;
               numeros=vacio; 
         }
      
    }
         resultat = resultat+Integer.parseInt(numeros);
         System.out.println("El resultat és "+resultat);
  }
}
    
