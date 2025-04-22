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
public class pr17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float num, i, total, percentatge1 = 0, percentatge2 = 0, percentatge3 = 0;
        for (i = 1; i <= 3; i++) {
            System.out.println("Introdueix el nombre d'habitants de la ciutat/poble ...");
            num = in.nextInt();
            System.out.println("Introdueix el nombre d'habitants totals de la ciutat/poble ...");
            total = in.nextInt();
            if ((num < 2000) && (total < 2000)) {
                percentatge1 = (num / total) * 100;
                System.out.println("Es un poble petit de " + percentatge1 + "% en total");
            } else if ((num >= 2000) && (num < 30000) && (total >= 2000) && (total < 30000)) {
                percentatge2 = (num / total) * 100;
                System.out.println("Es una ciutat mitjana de " + percentatge2 + "% en total");
            } else {
                percentatge3 = (num / total) * 100;
                System.out.println("Es una ciutat gran de " + percentatge3 + "% en total");
            }
        }
    }
}
