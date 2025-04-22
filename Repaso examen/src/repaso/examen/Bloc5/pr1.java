/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bloc5;

import java.util.Scanner; 
/**
 *
 * @author crist
 */
public class pr1 {
    public static void main (String []args){
        Scanner lector = new Scanner (System.in);
        int [] llista = new int [50];// El 50 són els espais creats. 
        for (int i=0; i< llista.length; i++){
            llista[i]= (int) (Math.random()*35); // El 35 són els espais que utilitzo. 
            //Genera un numero entre 0 i 1. El que haig de fer es multiplicar-lo pel numero que vui moure'm. Ex: llista[i]=Math.random()*35; 
            //Si la llista es un int, hauré de posar el càsting --> Ex: llista[i]= (int) Math.random()*35;
        }
        int suma=0;
        for (int i=0; i< llista.length; i++){
            System.out.print(llista[i]+"-");
            suma+=llista[i];
    }
        System.out.println();
        System.out.println("La suma és "+suma);
}
}
