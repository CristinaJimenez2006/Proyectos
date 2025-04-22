/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bucle3;

import java.util.Scanner; 
/**
 *
 * @author crist
 */
public class pr8 {
    public static void main (String[]args){
        Scanner in = new Scanner (System.in);
        int num, contpositiu=0, contnegatiu=0; 
        do{
            System.out.println("Introdueix un número...");
            num = in.nextInt();
            if (num>0){
                contpositiu++;
            }else{
                contnegatiu++;
            }
        }while ( num !=0);
        System.out.println("El nombre de positius és "+contpositiu+" i els de negatius és "+(contnegatiu-1));
    }
}
