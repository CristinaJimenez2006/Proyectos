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
public class pr24 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int dia = in.nextInt();
        int mes = in.nextInt();
        int anyA = in.nextInt();
        boolean valid = true;

        if ((mes < 1) || (mes > 12)) {
            valid = false;
        } else {
            if ((mes == 1) || (mes == 3) || (mes == 5)
                    || (mes == 7) || (mes == 8) || (mes == 10)
                    || (mes == 12)) {
                // Mes de 31 dies
                if ((dia < 1) || (dia > 31)) {
                    valid = false;
                }
            } else if ((mes == 4) || (mes == 6) || (mes == 9)
                    || (mes == 11)) {
                // Mes de 30 dies
                if ((dia < 1) || (dia > 30)) {
                    valid = false;
                }
            } else {
                // Mes de 28 o 29 dies
                // Esbrinem si és de traspàs
                boolean traspas = false;
                if ((anyA % 4 == 0) && (anyA % 100 != 0)) {
                    traspas = true;
                } else if (anyA % 400 == 0) {
                    traspas = true;
                }
                // Ja sabem si és o no de traspàs
                if (traspas == true) {
                    if ((dia < 1) || (dia > 29)) {
                        valid = false;
                    }
                } else {
                    if ((dia < 1) || (dia > 28)) {
                        valid = false;
                    }
                }

            }

        }
        if (valid) {
            System.out.println("La data és correcta");
        } else {
            System.out.println("La data és incorrecta");
        }
    }

}
