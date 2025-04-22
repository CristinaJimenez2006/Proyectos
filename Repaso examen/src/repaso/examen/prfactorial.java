/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen;

import java.util.Scanner; 
/**
 *
 * @author crist
 */
public class prfactorial {
    public static void main (String[]args){
      Scanner in = new Scanner (System.in);
      System.out.println("Introdueix un número");
      int nombre=in.nextInt(); 
      int resultat=1, i; 
      
      if((nombre==0)||(nombre==1)){
          resultat=1;
          System.out.println("El nombre de la dreta és 1.");
      }else{
      System.out.println("Factorial de " +nombre+"! és:");  
      for (i=nombre; (i<=nombre)&&(i>0); i--){
          if(i==1){
              System.out.print(i);
          }else{
             System.out.print(i+"*");
          }
          resultat=resultat*i;
        }
          System.out.print("="+resultat);
          System.out.println();
          System.out.println("El nombre de la dreta és "+(resultat%10));
      }
   
    }
   }
