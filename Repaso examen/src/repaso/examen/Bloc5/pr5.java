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
public class pr5 {
       public static void main (String []args){
         Scanner in = new Scanner(System.in);
        int[] posicions = new int[20];
        int mitjana = 0, nota, notafinal=0, contnotable=0;
        for(int i=0; i<posicions.length; i++){
            System.out.println("Introdueix una nota");
            nota=in.nextInt();
            if ((nota==7)||(nota==8)){
                contnotable++; 
            }
            notafinal+=nota; 
            nota=0; 
        }
        mitjana=notafinal/posicions.length;
        System.out.println("La mitjana de les notes és "+mitjana+". Hi ha "+contnotable+" notables.");
    }
}
