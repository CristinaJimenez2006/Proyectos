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
public class pr4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hores, minuts, segons;
        System.out.printf("\n Indica hora:\n");
        hores = in.nextInt();
        do {
            System.out.printf("\n Indica minuts:\n");
            minuts = in.nextInt();
        } while (minuts >= 60 || minuts < 0);

        do {
            System.out.printf("\n Indica segons:\n");
            segons = in.nextInt();
        } while (segons >= 60 || segons < 0);

        if (segons == 59) {
            segons = 0;
            if (minuts == 59) {
                hores++;
                minuts = 0;
            } else {
                minuts++;
            }
        } else {
            segons++;
        }
        System.out.println("L'hora és " + hores + ":" + minuts + ":" + segons);
    }
}
