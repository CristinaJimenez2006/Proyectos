
package com.mycompany.repasoexamen_2;

import java.util.Scanner; 
/**
 *
 * @author crist
 */
public class pr18 {

    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        System.out.println("Introdueix una frase"); 
        String frase=lector.nextLine(); 
        System.out.println("Introdueix una lletra");
        char paraula=lector.nextLine().charAt(0); 
        int cont=0; 
        
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) ==paraula){
                cont++; 
           }
        }
        System.out.println("El número de vegades que apareix aquesta lletra és "+cont);
    }
}
