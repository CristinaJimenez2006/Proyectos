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
public class pr23 {
    public static void main (String[]args){
        Scanner lector = new Scanner (System.in);
        System.out.println("Introdueix una frase...");
        String frase = lector.nextLine(); 
        //comillas doble --> String
        //comillas simple --> carácter
        for (int i = 0; i < frase.length(); i++) {
          if (frase.charAt(i)!=' '){
              System.out.print(frase.charAt(i));
          }else{
              System.out.println();
          }
              
        }
        System.out.println();
    }
}
