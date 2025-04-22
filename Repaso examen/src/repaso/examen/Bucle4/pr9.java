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
public class pr9 {
    public static void main (String[]args){
        Scanner in = new Scanner (System.in);
        int num, i;
        num = in.nextInt();
        boolean primer = true; 
        
        for (i=2; (i<=num/2)&&(primer=true); i++){
        if (num%i==0){
                primer=false;
        }
        }System.out.println(primer);
           
}
}
