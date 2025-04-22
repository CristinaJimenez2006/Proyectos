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
public class pr20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] vector1 = new int[10];
        int[] vector2 = new int[10];
        int[] vector3_auxiliar= new int [10]; 
   
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < vector2.length; i++) {
            vector2[i] = (int) (Math.random() * 10);
        }
        for (int j=0; j<vector3_auxiliar.length; j++){
                vector3_auxiliar[j]=vector2[j];
                vector2[j]=vector1[j];
                vector1[j]=vector3_auxiliar[j]; 
               
        }
        //en comptes de fer ús d'un array puc fer ús d'una variable
        //int vector3_auxiliar; 
        //for (int j=0; j<vector3_auxiliar.length; j++){
                //vector3_auxiliar[j]=vector2[j];
                //vector2[j]=vector1[j];
                //vector1[j]=vector3_auxiliar[j]; 
               
        //}     
    }
}
