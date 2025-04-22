/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructurada_Bloc2;

import java.util.Scanner;


public class Bloc2_problema5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float descompte, preuOriginal, preuDescomptat;

        System.out.printf("\nIntrodueix el descompte aplicat..");
        descompte = in.nextFloat();
        System.out.printf("\nIntrodueix quant has pagat...");
        preuDescomptat = in.nextFloat();

        preuOriginal = (100 * preuDescomptat) / (100 - descompte);

        System.out.printf("El preu original és %.2f \n", preuOriginal);
        //float eurosDescomptats = preuOriginal - preuDescomptat;
        System.out.println("Ells euros descomptats son " + (preuOriginal - preuDescomptat));
    }
}
