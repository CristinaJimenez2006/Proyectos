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
public class prdevelocidades {
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix la distància que hi ha entre una càmara i l'altra en metres");
        float distancia = in.nextFloat();
        distancia = distancia / 1000;
        System.out.println("Introdueix la velocitat màxima permesa en Km/h");
        float velocitatmax = in.nextFloat();
        System.out.println("Introdueix el número de segons que ha tardat el cotxe en recorrer la distància que hi ha entre una càmara i una altra");
        float temps = in.nextFloat();
        temps = temps / 60;

        float velocitat = distancia / temps;

        if (velocitat <= velocitatmax) {
            System.out.println("OK");
        } else if (velocitat < (velocitatmax * 1.2)) {
            System.out.println("Multa");
        } else {
            System.out.println("Puntos");
        }
    }
}
