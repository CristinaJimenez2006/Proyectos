/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bucle4;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author crist
 */
public class pr11 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, i;
        double result;
        num = in.nextInt();
        for (i = 0; i <= num; i++) {
            result= Math.pow(i, 2);
            System.out.println("Exponencial de " + i + " al quadrat: " + result);
        }
    }
}
