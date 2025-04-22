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
public class pr18 {
    public static void main (String []args){
        Scanner lector = new Scanner (System.in);
        System.out.println("Introdueix una frase...");
        String frase = lector.nextLine();
        frase=frase.toLowerCase(); 
        System.out.println("Introdueix una lletra...");
        char lletra = lector.nextLine().charAt(0); 
        /* Manera per recollir un caràcter*/
        /*El equals només és per cadenes no per caràcters*/
        int cont=0; 
        
        for (int i=0; i<frase.length(); i++){
            if (frase.charAt(i)==lletra){
               cont++; 
            }
        }
        System.out.println("A la frase hi ha "+cont+" "+lletra);   
    }
}
