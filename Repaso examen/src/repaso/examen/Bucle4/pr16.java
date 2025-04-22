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
public class pr16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 1, cont1 = 0;
        boolean primer = true;

        while (num != 0) {
            num = in.nextInt();
            for (int i = 1; (i <= num / 2) && (primer = true); i++) {
                if (num % i == 0) {
                    primer = false;
                }
            }
            if (primer) {
                cont1++;
                System.out.println("És un nombre primer " + num);
            } else {
                System.out.println("No es un nombre primer " + num);
            }
        }
        System.out.println("Quantitat de nombres primers " + cont1);
    }
}
