package repaso.examen.Bucle3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner; 
/**
 *
 * @author crist
 */
public class pr22_1 {
 public static void main (String[]args){
     Scanner lector = new Scanner(System.in); 
     System.out.println("Introdueix una frase...");
     String frase = lector.nextLine(); 
    
     if ((frase.indexOf('y') != -1)||(frase.indexOf('i') != -1)||(frase.indexOf('j') != -1)||(frase.indexOf('s') != -1)||(frase.indexOf('d') != -1)||(frase.indexOf('f') != -1)||(frase.indexOf('g') != -1)||(frase.indexOf('n') != -1)||(frase.indexOf('a') != -1)||(frase.indexOf('9') != -1)) {
                System.out.println("La frase no és vàlida");
            } else {
                System.out.println("La frase és vàlida");
            }
 }   
}


/*Para salir de un bucle puedo poner break; poner i igual a la condicion maxima (for (int i = 0; i < 10; i++) )--> i=10 o poner en el for && i la condición del else.*/

