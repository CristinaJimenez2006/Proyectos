
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author crist
 */
public class pr25_2 {
    public static void main (String []args){
     Scanner lector = new Scanner (System.in);
     System.out.println("Introdueix una cadena de lletres i números");
     String cadena=lector.nextLine();
     String possiblesnumeros="0123456789"; 
     String numeros="";
     int resultat; 
     
     for (int i=0; i<cadena.length(); i++){
         for (int j=0; j<possiblesnumeros.length(); j++){
         if (cadena.charAt(i)==possiblesnumeros.charAt(j)){
            numeros = numeros+cadena.charAt(i);  
         }
         }
     }
     int num=Integer.parseInt(numeros);
     resultat=num*5;
     System.out.println(resultat);
    }
}
