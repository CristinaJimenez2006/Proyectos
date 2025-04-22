/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bucle4;

import java.util.Scanner; 
/**
 *
 * @author crist
 */
public class pr8 {
 public static void main (String []args){
     Scanner in = new Scanner (System.in); 
     System.out.println("Introdueix un nombre...");
     int num, i, suma=0; 
     num = in.nextInt(); 
     
     for (i=1;i<=num/2;i++){
      if (num%i==0){
          suma = suma+i; 
      }   
     }
     if (suma==num){
         System.out.println("És un nombre perfect"+num);
         
     }else{
         System.out.println("No és un nombre perfecte "+num);
     }
 }   
}
