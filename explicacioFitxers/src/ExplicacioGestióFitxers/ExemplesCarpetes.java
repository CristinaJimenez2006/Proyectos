/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExplicacioGestióFitxers;

/**
 *
 * @author david
 */

import java.io.File;

public class ExemplesCarpetes {

    public static void main(String[] args) {
        // Punt d'entrada del programa
        // Indiquem la ruta de la carpeta des d'on volem començar la cerca
        // "." representa la carpeta actual
        String rutaCarpeta = ".";

        // Creem un objecte File que representa aquesta carpeta
        // i cridem al mètode que llistarà els fitxers
        llistarFitxers(new File(rutaCarpeta));
    }

    // Mètode que rep una carpeta i llista tots els fitxers que hi ha dins,
    // incloent els que es troben dins de subcarpetes.
    // Només imprimeix els fitxers, no les carpetes.
    public static void llistarFitxers(File carpeta) {

        // Comprovem si el File rebut és una carpeta
        if (carpeta.isDirectory()) {

            // Obtenim una llista de tots els fitxers i carpetes dins la carpeta
            File[] fitxers = carpeta.listFiles();

            // Recorrem l'array utilitzant un bucle for bàsic
            for (int i = 0; i < fitxers.length; i++) {

                // Si l'element actual és un fitxer, imprimim el seu camí complet
                if (fitxers[i].isFile()) {
                    System.out.println(fitxers[i].getPath() + " - " + fitxers[i].length() + " bytes");

                // Si és una carpeta, cridem recursivament al mètode per explorar-la
                } else if (fitxers[i].isDirectory()) {
                    llistarFitxers(fitxers[i]);
                }
            }
        }
    }
}

