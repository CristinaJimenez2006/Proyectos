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
public class Bloc2_problema6_altresolució {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Ndia, Nmes, Nany, Adia, Ames, Aany;
        int edat, dia, mes;

        System.out.printf("Introdueix  la data de naixement\n ");
        System.out.printf("\ndia:  ");
        Ndia = in.nextInt();
        System.out.printf("\nmes:  ");
        Nmes = in.nextInt();
        System.out.printf("\nany:  ");
        Nany = in.nextInt();
        System.out.printf(" Introdueix  la data actual \n ");
        System.out.printf("\ndia:  ");
        Adia = in.nextInt();
        System.out.printf("\nmes:  ");
        Ames = in.nextInt();
        System.out.printf("\nany:  ");
        Aany = in.nextInt();

        edat = Aany - Nany;
        if (Ames < Nmes) {
            edat = edat -1;
        }
        else if (Ames == Nmes) {
            if ( Adia < Ndia ) {
                edat = edat -1;
            }
            else if (Adia == Ndia){
                System.out.println("FELICITATS !!");
            }
        }

        System.out.printf("La teva edat es %d anys", edat);

    }
}
