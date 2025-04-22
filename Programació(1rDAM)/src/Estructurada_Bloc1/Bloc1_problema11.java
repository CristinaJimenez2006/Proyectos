/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructurada_Bloc1;
import java.util.Scanner;
/**
 *
 * @author crist
 */
public class Bloc1_problema11 {
    public static void main(String[] args) {
        
        Scanner intro = new Scanner(System.in);
        int hora, minuts, minutsTotals;

        System.out.println("Indica hora...");
        hora = intro.nextInt();
        System.out.println("Indica minuts...");
        minuts = intro.nextInt();
        
        minutsTotals = hora * 60 + minuts;
        
        System.out.println("Els minuts totals són " + minutsTotals);        
    }
}