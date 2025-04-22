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
public class pr20_1 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int[] vector1 = new int[10];
        int[] vector_auxiliar = new int[10];
        
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = (int) (Math.random() * 10);
        }
        for(int i =0; i<vector1.length; i++){
             vector_auxiliar[vector1.length-1-i]=vector1[i]; 
             System.out.print(">>"+vector_auxiliar[i]);
        }
}
}
