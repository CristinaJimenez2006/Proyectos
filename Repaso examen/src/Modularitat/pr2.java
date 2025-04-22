package Modularitat;

import static Modularitat.Metodes.canviaparaula;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class pr2 {
    public static void main (String[]args){
        Scanner in = new Scanner (System.in); 
         System.out.println("Introdueix un número");
         int numero=in.nextInt(); 
         System.out.println("Introdueix a quin número vols elevar el número");
         int numeropotencia=in.nextInt(); 
         numero=potencia(numero,numeropotencia);
         System.out.println("El número elevat a"+numeropotencia+" és igual a "+numero);
    }
    public static int potencia(int number, int numberpower){
        int resultat=1; 
        for (int i = 0; i < numberpower; i++) {
            resultat=resultat*number; 
        }
        return resultat; 
    }
}
