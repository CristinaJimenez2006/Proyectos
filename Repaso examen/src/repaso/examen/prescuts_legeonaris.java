/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen;

import java.util.Scanner; 
/**
 *
 * @author crist
 */
public class prescuts_legeonaris {
    public static void main (String[]args){
        Scanner in = new Scanner (System.in); 
        double legio;
        System.out.println("Ingrese los legionarios: ");
        legio = in.nextInt();
        double escudos = 0;
        while (legio != 0) {
            int dif_legio = (int) (Math.sqrt(legio));
            legio = legio - Math.pow(dif_legio, 2);
            if (dif_legio == 1) {
                escudos = escudos + 5;
            } else {
                escudos = escudos + 12 + (8 * (dif_legio - 2)) + Math.pow((dif_legio - 2), 2);
            }
        }
        System.out.println(escudos);
}
} 
