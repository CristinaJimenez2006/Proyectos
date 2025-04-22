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
public class pr14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix el número del mes...");
        int mes, dies = 0;

        do {
            mes = in.nextInt();

            if ((mes <= 12) && (mes > 0)) {
                if ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12)) {
                    dies = 31;
                }
                if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {
                    dies = 30;
                } else if (mes == 2) {
                    dies = 28;
                }
                System.out.println("El mes " + mes + " té " + dies + " dies.");
            } else {
                System.out.println("Número no vàlid");
            }
        } while ((mes < 12) || (mes > 0));
    }
}
