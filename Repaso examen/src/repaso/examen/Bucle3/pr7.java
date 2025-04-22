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
public class pr7 {
 public static void main (String []args){
     Scanner in = new Scanner (System.in);
     System.out.println("Introdueix un número..");
     int num, contparells=0, contimparells=0; 
     do {
       num = in.nextInt(); 
       if (num%2==0){
           contparells++; 
       }else{
           contimparells++;
       }
     }while (num!=0);
     System.out.println("El nombre de parells és de "+(contparells-1)+" i el d'imparells és de "+contimparells); 
 }   
}
