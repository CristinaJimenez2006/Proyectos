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
public class pr2 {
    public static void main (String[]args){
        Scanner lector = new Scanner (System.in);
        int [] posicions = new int [30];
        int sumaparells=0, sumaimparells=0; 
        for (int i=0; i< posicions.length; i++){
            posicions[i]= (int) (Math.random()*10);
            if (i%2==0){
                sumaparells+=posicions[i]; 
            }else{
                sumaimparells+=posicions[i]; 
            }
    }
        System.out.println("La suma dels nombres parells és "+sumaparells+" i la dels imparells "+sumaimparells+".");
    }
}
