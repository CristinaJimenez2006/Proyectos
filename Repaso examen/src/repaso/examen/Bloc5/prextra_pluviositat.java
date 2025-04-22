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
public class prextra_pluviositat {
     public static void main (String[]args){
          Scanner in = new Scanner(System.in);

        int ciutats = 5;
        int mesos = 12;
        String[] ciutatsArr = {"Barcelona", "Girona", "Tarragona", "Lleida", "Les cases d'Alcanar"};
        String[] mesosArr = {"Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost",
            "Setembre", "Octubre", "Novembre", "Desembre"};

        // CRea, emplena i mostra    
        int[][] pluges = new int[ciutats][mesos];

        for (int i = 0; i < ciutats; i++) {
            for (int j = 0; j < mesos; j++) {
                pluges[i][j] = (int) (Math.random() * 100);
                System.out.print(pluges[i][j] + " ");
            }
            System.out.println("");
        }

        //Primer apartat
        int suma = 0, ciutatMax = 0;
        float mitjana, max = 0;
        for (int i = 0; i < ciutats; i++) {
            suma = 0;
            for (int j = 0; j < mesos; j++) {
                suma += pluges[i][j];
            }
            mitjana = (float) suma / mesos;
            if (i == 0) {
                max = mitjana;
                ciutatMax = i;
            } else {
                if (mitjana > max) {
                    max = mitjana;
                    ciutatMax = i;
                }
            }
        }
        System.out.println("La ciutat més plujosa és " + ciutatsArr[ciutatMax]);
        System.out.println("Les pluges màximes han estat " + max);

        //Segon apartat
        int mesMax = 0;
        max = 0;
        for (int j = 0; j < mesos; j++) {
            suma = 0;
            for (int i = 0; i < ciutats; i++) {
                suma += pluges[i][j];
            }
            mitjana = (float) suma / ciutats;
            if (j == 0) {
                max = mitjana;
                mesMax = j;
            } else {
                if (mitjana > max) {
                    max = mitjana;
                    mesMax = j;
                }
            }
        }
        System.out.println("El mes més plujós és " + mesosArr[mesMax]);
        System.out.println("Les pluges màximes han estat " + max);
        
        // Apartat 3
        
        System.out.println("Indica la ciutat...");
        String ciutat = in.nextLine();
        int indexCiutat = 0;
        // Esbrinem l'index de la ciutat
        for (int i = 0; i < ciutats; i++) {
            if (ciutatsArr[i].equals(ciutat)){
                indexCiutat = i;
                i = ciutats;
            }
        }
        
        // I ara cerquem el més més plujós. Com que només recorrem una fila, només cal un for
        
        for (int j = 0; j < mesos; j++) {
            if (j == 0) {
                max = pluges[indexCiutat][j];
                mesMax = j;
            } else {
                if (pluges[indexCiutat][j] > max) {
                    max = pluges[indexCiutat][j];
                    mesMax = j;
                }
            }
        }
        

    }
}
