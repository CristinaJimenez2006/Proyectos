/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bloc1;

import java.util.Scanner;
import java.lang.Math; 
/**
 *
 * @author crist
 */
public class pr8 {
    public static void main (String []args){
        double radi,longitud;
        
        Scanner in = new Scanner(System.in);
        
        System.out.printf ("escriu el radi: ");
        radi=in.nextFloat();
        longitud= 2 * Math.PI * radi;
        System.out.printf("La longitud és....");
        System.out.printf("\n%.2f\n", longitud); 
       
        
    }
}
