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
public class pr2 {
    public static void main (String[]args){
        Scanner in = new Scanner (System.in);
        double totalsetmanal=0;
        for (int i = 0; i < 10; i++) {
        System.out.println("Introdueix el nombres d'hores treballades... ");
        float nombrehorestre; 
        nombrehorestre = in.nextFloat();
        System.out.println("Introdueixla quantitat pagada per hora... ");
        float horapagada;  
        horapagada = in.nextFloat();
            if (nombrehorestre<=40){
               totalsetmanal=totalsetmanal+(nombrehorestre*horapagada); 
            }else{
                totalsetmanal= totalsetmanal+((nombrehorestre*horapagada)+(nombrehorestre*horapagada*1.5));
        }
              System.out.println("El sou és de " +totalsetmanal);
        }
    }
}
