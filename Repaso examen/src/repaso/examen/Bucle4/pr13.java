/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bucle4;

import java.util.Scanner; 
/**
 *
 * @author crist
 */
public class pr13 {
    public static void main (String []args){
        Scanner in = new Scanner (System.in);
        int i, maxim=0, minim=0, cont1=0, cont2=0;
        System.out.println("Introdueix un número...");
        for (i=0; i<10; i++){
        int num = in.nextInt();
        if (i==0){
            maxim=num;
            minim=num;
            cont1++;
            cont2++;
        } else if (num>=maxim){
            maxim=num;
            cont1++;
        }else if (num<=minim){
            minim=num;
            cont2++;
        }
        } 
        System.out.println("Nombre de vegades que apareix un màxim "+cont1);
        System.out.println("Nombre de vegades que apareix un mínim "+cont2);
        System.out.println("El màxim és "+maxim);
        System.out.println("El mínim és "+minim);
    }
}
