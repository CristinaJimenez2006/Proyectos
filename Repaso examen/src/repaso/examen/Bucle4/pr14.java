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
public class pr14 {
 public static void main (String []args){
     Scanner in = new Scanner (System.in);
     System.out.println("Introdueix el nombre de metres quadrats que té el pis");
     int metres, resultat=0, cont1=0, cont2=0, cont3=0;
          
     for (int i=1; i <=10; i++){
         metres = in.nextInt();
         if(metres<60){
          resultat=resultat+20;
          cont1++;
         }else if (metres<90){
             resultat=resultat+35;
             cont2++;
         }else{
             resultat=resultat+50;
             cont3++;
         }
     }
     System.out.println("Del primer tipus hi ha "+cont1+", del segon, "+cont2+" i del tercer "+cont3+ ". El total de diners que s'ha de pagar són "+resultat);
     
 }   
}
