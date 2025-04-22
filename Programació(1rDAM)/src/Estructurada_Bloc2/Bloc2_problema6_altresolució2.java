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
public class Bloc2_problema6_altresolució2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int diaActual, mesActual, anyActual, diaNaix, mesNaix, anyNaix;

        diaNaix = 10;
        mesNaix = 10;
        anyNaix = 2020;
        diaActual = 16;
        mesActual = 10;
        anyActual = 2023;

        int anys = anyActual - anyNaix;
        int edatDefinitiva;
        if (mesActual > mesNaix) {
            edatDefinitiva = anys;
        } else if (mesActual < mesNaix) {
            edatDefinitiva = anys - 1;
        } else {
            if (diaActual > diaNaix) {
                edatDefinitiva = anys;
            } else if (diaActual < diaNaix) {
                edatDefinitiva = anys - 1;
            } else {
                System.out.println("Felicitats !!");
                edatDefinitiva = anys;
            }
        }

        System.out.println("L'edat és " + edatDefinitiva);

    }

}

