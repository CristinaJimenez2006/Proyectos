/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructurada_Bloc3;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Bloc3_problema9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float nota;
        int contaprovats = 0, contsuspesos = 0, contsuficient = 0, contbe = 0, contnotable = 0, contexcelent = 0;
        
        for (int num = 0; num <= 40; num++) {
              System.out.println("Introdueix una nota");
             nota = in.nextInt();
             // Control de validesa
             if ((nota <=0)&&(nota<=10)){
            if (nota < 5) {
                contsuspesos++;
            } else {
                if (nota <6) {
                    contsuficient++;
                } else if (nota <7) {
                    contbe++;
                } else if (nota <8.5) {
                    contnotable++;
                } else {
                    contexcelent++;
                }
                contaprovats++;
            }
           }else{
               System.out.println("Nota incorrecta");
               num--;
             }

        }
        System.out.println("El número de suspesos són"+contsuspesos);
        System.out.println("El número d'aprovats són"+contaprovats);
        System.out.println("El número d'aprovats són"+contsuficient);
        System.out.println("El número d'aprovats són"+contnotable);
        System.out.println("El número d'aprovats són"+contexcelent);
    }
}
