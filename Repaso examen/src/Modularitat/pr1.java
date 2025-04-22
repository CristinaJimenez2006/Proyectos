package Modularitat;

import java.util.Scanner; 
/**
 *
 * @author crist
 */
public class pr1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix un número");
        int numero = in.nextInt();
        System.out.print("El número " + numero);
        numero = suma(numero);
        System.out.println(" elevat a una unitat és " + numero);
    }

    public static int suma(int number) {
    number = number + 1;
    return number; 
    }
}
