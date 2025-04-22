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
public class Bloc2_problema_apart {
      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introdueix la distancia que separa las dos càmaras en metros");
        float distancia = in.nextFloat();
        distancia= distancia/1000;

        System.out.println("Indica la velocidad máxima permitida en todo ese tramo (en Km/h)");
        float velocidadMaxima = in.nextFloat();

        System.out.println("Indicará el número de segundos que ha tardado el coche en recorrer el tramo");
        float tiempo = in.nextFloat();
        tiempo=tiempo/3600;

        float velocidad;
        velocidad = distancia / tiempo;

        if (velocidadMaxima >= velocidad) {
            System.out.println("OK");
        } else if (1.2*velocidadMaxima >= velocidad) {
                System.out.println("Multa");
            } else {
                System.out.println("Punts");
            }
        }
    }

