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
public class pr4 {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int num, maxim=0, minim=0, valor, suma=0, media=0, i;
        System.out.println("Introdueix el número de vegades...");
        num = in.nextInt();
        
        for(i=0; i<num; i++){
            System.out.println("Introdueix un nombre....");
            valor= in.nextInt();
            if (i==0){
                valor=maxim;
                valor=minim;
            }else if (valor>maxim){
                maxim=valor;
            }else if (valor<minim){
                minim=valor;
            }
            suma=suma+valor;
        } 
        System.out.println("El maxim es" +maxim);
        System.out.println("El minim" +minim);
        System.out.println("La media" +((float)suma/(float)i));
}
}
