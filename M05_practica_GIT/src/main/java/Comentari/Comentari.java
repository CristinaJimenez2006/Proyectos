/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comentari;

import java.util.Scanner; 
/**
 *
 * @author crist
 */
public class Comentari {
    /**
     * @since versió 1.2
     * @version 3.0
     * @param args 
     */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int mes, dies;

        System.out.printf("\nIntroduiex el mes");
        mes = in.nextInt();
        dies = calcula_dies(mes);
        System.out.printf("\nEl mes %d té %d dies", mes, dies);

        calcula_dies2(mes);

    }
    /**
     * Rep un mes enter i retorna els dies
     * @param nombre_mes - el mes en format enter
     * @return retorna eñs dies del mes rebut 
     */
    private static int calcula_dies(int nombre_mes) {
        if ((nombre_mes == 4) || (nombre_mes == 6) || (nombre_mes == 9) || (nombre_mes == 11)) {
            return 30;
        } else if (nombre_mes == 2) {
            return 28;
        } else {
            return 31;
        }
    }
    /**
     * @deprecated Eliminada des de la versió 2.3
     * @param nombre_mes 
     */
    private static void calcula_dies2(int nombre_mes) {
        if ((nombre_mes == 4) || (nombre_mes == 6) || (nombre_mes == 9) || (nombre_mes == 11)) {
            System.out.printf("%d", 30);
        } else if (nombre_mes == 2) {
            System.out.printf("%d", 28);
        } else {
            System.out.printf("%d", 31);
        }
    }

}

