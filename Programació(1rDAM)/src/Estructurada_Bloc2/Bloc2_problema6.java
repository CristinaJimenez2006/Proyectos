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
public class Bloc2_problema6 {
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
        if (edat == 0) {
            System.out.printf("Encara no has fet un any");
        } else {
            mes = Ames - Nmes;
            if (mes < 0) {
                edat = edat - 1;
            } else // no cal contemplar la possibilitat de que doni major de 0 ja que si fos
            // aixi la edat ja és la que tenim de bon principi
            // Nomeś s'han de fer comprovacions en els caos en que canvii aquesta informació
            {
                if (mes == 0) {
                    dia = Adia - Ndia;

                    if (dia == 0) {
                        System.out.printf(" Felicitats");
                    } else {
                        if (dia < 0) {
                            edat = edat - 1;
                        }
                    }
                }
            }
        }
        System.out.printf("La teva edat es %d anys", edat);

    }
}
