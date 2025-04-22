/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bloc5;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class pr16 {
     public static void main (String []args){
       Scanner in = new Scanner (System.in);
       double[] matriz = new double[20];
       float contnegativos=0, contpositivos=0, contceros=0;
       int i=0; 
       while(i!=20){
           matriz[i]=(float) (Math.random()*20); 
         if (matriz [i]>0){
            contpositivos++;  
         }else if (matriz [i]<0){
             contnegativos++; 
         }else{
             contceros++; 
         } 
         i++; 
       }
         System.out.println("Nombres positius "+contpositivos+ ", nombre negatius "+contnegativos+" i nombre de zeros "+contceros);
     }
}

