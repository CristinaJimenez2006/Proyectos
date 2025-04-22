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
public class pr10 {
    
  public static void main (String []args){
       Scanner in = new Scanner (System.in); 
       System.out.println ("Introdueix una nota...");
       int nota, i, contsuspesos=0, contaprovats=0, contsuficient=0, contbe=0, contnotable=0, contexcelent=0, percentatgesuspesos=0, percentatgeaprovats=0, total=40; 
       
       for (i=1;i<=total; i++){
          nota = in.nextInt();
          if (nota<5){
              contsuspesos++; 
          }else if (nota>5){
              contaprovats++; 
              if (nota<6){
                contsuficient++;
              }else if (nota<7){
                contbe++;  
              }else if (nota<9){
                contnotable++;  
              }else if (nota<=10){
                  contexcelent++; 
              }
          }
       }
       percentatgeaprovats= (contaprovats/total)*100;
       percentatgesuspesos= (contsuspesos/total)*100; 
       System.out.println("Nombre d'aprovats "+contaprovats);
       System.out.println("Percentatge d'aprovats "+percentatgeaprovats);
       System.out.println("Nombre de suspesos "+contsuspesos);
       System.out.println("Percentatge de suspesos "+percentatgesuspesos);
       System.out.println("Nombre de suficients "+contsuficient);
       System.out.println("Nombre de be "+contbe);
       System.out.println("Nombre de notables "+contnotable);
       System.out.println("Nombre d'excel·lent "+contexcelent);
    }
}
