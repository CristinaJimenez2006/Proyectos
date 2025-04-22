/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructurada_Bloc2;

import java.util.Scanner;
import java.lang.Math;
/**
/**
 *
 * @author crist
 */
public class Bloc2_problema9 {
    public static void main (String[] args ){
    Scanner in = new Scanner(System.in);
    
    int opcio=0;
    System.out.println("Introdueix un número");
    int num1 = in.nextInt();
    
    System.out.println("Introdueix un altre número");
    int num2 = in.nextInt();
    
    System.out.println("Menú d'opcions"); 
    System.out.println("1.Suma");
    System.out.println("2.Multiplicació");
    System.out.println("3.Divisió");
    System.out.println("4.resta");
    System.out.println("5.Arrel quadrada");
    
        switch (opcio) {
            case 1:
                System.out.println("El resultat és"+( num1 + num2));
                break;
            case 2:
                System.out.println("El resultat és"+(num1*num2));
                break;
            case 3:
                System.out.println("El resultat és" + (num1 / num2));
                break;
            case 4:
                System.out.println("El resultat és" +(num1-num2));
                break;     
            case 5:
                System.out.println("El resultat és" +(Math.sqrt(num1))+(Math.sqrt(num2)));
                break;
            default:
                System.out.println("Opció no vàlida");
                break;
        }
}}
