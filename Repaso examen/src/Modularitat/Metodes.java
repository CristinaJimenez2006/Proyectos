package Modularitat;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Metodes {

    public static void main(String[] args) {
        System.out.println("Intro paraula");
        Scanner lector = new Scanner(System.in);
        String paraula = lector.nextLine();
        paraula=canviaparaula(paraula); 
        System.out.println(paraula);
        //Siempre recoger en la misma variable o imprimirlo. 
        //Solo se hace return con el float, int, string, char, etc. 
        //Con las arrays no se hace return se pone ej: public static void arryasensenyament (int[]dades)
    }

    public static String canviaparaula(String word) {
        String cadenaamblletra = "";
        char lletra = 'a';
        for (int i = 0; i < word.length(); i++) {

            cadenaamblletra = cadenaamblletra + word.charAt(i) + lletra;
        }
        System.out.println(cadenaamblletra);
        return cadenaamblletra;
    }
}
