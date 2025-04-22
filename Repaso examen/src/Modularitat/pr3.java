package Modularitat;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class pr3 {
 public static void main (String[]args){
        Scanner in = new Scanner (System.in); 
         System.out.println("Introdueix un número");
         int numero=in.nextInt();
         
         System.out.print("El número factorial de "+numero);
         numero=factorial(numero);
         System.out.println(" és "+numero);
         
    }
    public static int factorial(int number){ 
       int resultat=1; 
        for (int i = 1; i <=number; i++) {
            resultat=resultat*i; 
        }
        return resultat; 
    }    
}
