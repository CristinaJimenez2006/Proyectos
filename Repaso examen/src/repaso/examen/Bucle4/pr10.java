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
public class pr10 {
    public static void main (String []args){
       Scanner in = new Scanner (System.in);
       int num, i; 
       num = in.nextInt();
       for (i=1;i<=num;i++){
           if ((num%i==0)||(num==i)||(num/2==i)){
               System.out.println("Divisisor:"+i);
           }
        }
    }
}
