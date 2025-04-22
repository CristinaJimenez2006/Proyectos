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
public class pr18 {
    public static void main (String []args){
    Scanner in = new Scanner(System.in);
        float[] alumnos = new float[3];
        float nota, contaprovados=0;
        int i; 
        for ( i = 0; i < alumnos.length; i++) {
            System.out.println("Introdueix la nota de l'alumne...");
            nota = in.nextInt(); 
            alumnos[i] = nota; 
            if (alumnos[i] >= 5) {
                contaprovados++;
            }
        }
        System.out.printf("El percentatge de aprovats és %.2f\n", ((contaprovados/alumnos.length)*100));
    }
}

