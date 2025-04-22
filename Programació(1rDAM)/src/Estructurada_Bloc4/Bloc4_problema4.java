/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructurada_Bloc4;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Bloc4_problema4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, maxim = 0, minim = 0, voltes=0;
        System.out.println("Introdueix un número");
        num = in.nextInt();

        if (voltes==0) {
        num=maxim;
        num=minim;
        }else{
        while (voltes != 0) {
            if (num > maxim) {
                maxim=num;
            } else if (num<minim) {
                minim=num;
            }
        }
        System.out.println("Numero màxim" + maxim);
        System.out.println("Numeros mínim" + minim);
    }
}

}
