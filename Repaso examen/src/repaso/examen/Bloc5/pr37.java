/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bloc5;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class pr37 {

    public static void main(String[] args) {
        String[] alumnosMaterias = {
            "Victor;2.3;5.7;0.8",
            "Alejandra;5.3;9.7;1.8",
            "María;4.3;7.7;9.8"
        };

        int numAlumnos = alumnosMaterias.length;
        int numMaterias = alumnosMaterias[0].split(";").length - 1; // Restamos 1 porque el primer campo es el nombre
        double[] sumaMaterias = new double[numMaterias];
        double sumaNotas = 0;

        System.out.println("Medias de los alumnos:");
        for (int j = 0; j < alumnosMaterias.length; j++) {
            String[] datos = alumnosMaterias[j].split(";");
            String nombre = datos[0];
            for (int i = 0; i < numMaterias; i++) {
                double nota = Double.parseDouble(datos[i + 1]);
                sumaNotas += nota;
                sumaMaterias[i] += nota;
            }
            double mediaAlumno = sumaNotas / numMaterias;
            System.out.printf("%s --> media: %.2f%n", nombre, mediaAlumno);
        }

        System.out.println("Media de cada materia:");
        for (int i = 0; i < numMaterias; i++) {
            System.out.printf("Materia: %s  --> media: %.2f%n", i,(sumaMaterias[i] / numAlumnos));
        }
    }
}
