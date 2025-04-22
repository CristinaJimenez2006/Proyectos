/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructurada_Bloc2;
import java.util.Scanner;
/**
 *
 * @author crist
 */
public class Bloc2_problema15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introdueix una nota");
        float num = in.nextInt();

        if (num < 5) {
            System.out.println("Suspés");
        } else if (num < 6) {
            System.out.println("Suficient");
        } else if (num < 7) {
            System.out.println("Bé");
        } else if (num < 9) {
            System.out.println("Notable");
        } else if (num < 10) {
            System.out.println("Excel·lent");
        } else if (num == 10) {
            System.out.println("Matrícula d'honor");
        } else {
            System.out.println("Nota no vàlida");
        }
    }
}
    
