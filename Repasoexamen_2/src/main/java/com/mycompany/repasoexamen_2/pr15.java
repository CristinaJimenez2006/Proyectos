package com.mycompany.repasoexamen_2;

import java.util.Scanner; 
/**
 *
 * @author crist
 */
public class pr15 {
      public static void main (String[]args){
        Scanner lector = new Scanner (System.in);
        
        System.out.println("Diguis el teu nom...");
        String nom = lector.nextLine();
        
        System.out.println ("Hola " +nom);
        
        int longitut = nom.length(); 
        System.out.println ("La seva longitut és " +longitut);
         //També és vàlida l'opció  System.out.println ("Hola " +nom.lenght());
         
        char lletra = nom.charAt(3);
        System.out.println ("La lletra que ocupa la posició 3r és " +lletra);
        
        System.out.println("Diguis un altre nom...");
        String nom2 = lector.nextLine();
        
        if (nom.equals(nom2)){
        // Si vui dir "no són iguals" ho posaria  if (!nom.equals(nom2){
            System.out.println ("Són iguals");
        }else {
           System.out.println ("Són diferents");  
        }
          System.out.println ("El nom en mayuscúles" +nom.toUpperCase());  
          System.out.println ("El nom en miniscúles" +nom2.toLowerCase());  
    }
}
