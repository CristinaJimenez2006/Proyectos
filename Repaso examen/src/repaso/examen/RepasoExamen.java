/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso.examen;

import java.util.Scanner; 
/**
 *
 * @author crist
 */
public class RepasoExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nota, totalalumnes=10, totalnotes=5, mitjana = 0, total = 0, totalglobal = 0, mitjanaglobal= totalglobal / (totalalumnes*totalnotes);
        for (int i = 0; i < 10; i++) {
            System.out.println("Introdueix una nota");
            total = 0;
            for (int j=0; j < 5; j++) {
                nota = in.nextInt();
                total = total + nota;
                totalglobal = totalglobal + nota;
            }
            mitjana = total / 5;
            System.out.println("La mitjana de l'alumne " + i + " és " + mitjana);
        }
        System.out.println("La mitjana global de la classe és " + mitjanaglobal);
    }

}
