/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExplicacioGestióFitxers;

import java.io.File; // Importem la classe File per treballar amb fitxers i carpetes

/**
 * Exemple de programa que comprova l'existència d'un fitxer i una carpeta,
 * i mostra informació bàsica com el nom, la longitud i la ruta absoluta.
 *
 * @author david
 */



public class ExempleFitxers {

    public static void main(String[] args) {
        // ======= EXEMPLE DE FITXER =======

        // Creem un objecte File que apunta a un fitxer anomenat "exemple1.txt"
        // Aquest fitxer pot estar en el mateix directori que el projecte
        File fitxer = new File("../exemple1.txt");

        // Comprovem si el fitxer existeix a la carpeta del projecte
        if (fitxer.exists())
            System.out.println("El fitxer existeix");
        else
            System.out.println("El fitxer no existeix");

        // Mostrem informació sobre el fitxer:
        System.out.println("Nom: " + fitxer.getName());                 // Nom del fitxer
        System.out.println("Longitud: " + fitxer.length());            // Mida en bytes
        System.out.println("Ruta absoluta: " + fitxer.getAbsolutePath()); // Ruta completa del fitxer

        // ======= EXEMPLE DE CARPETA =======

        // Creem un objecte File que apunta a una carpeta anomenada "ruta_carpeta"
        File carpeta = new File("ruta_carpeta");

        // Comprovem si la carpeta existeix
        if (carpeta.exists())
            System.out.println("La carpeta existeix");
        else
            System.out.println("La carpeta no existeix");

        // Mostrem informació sobre la carpeta:
        System.out.println("Nom: " + carpeta.getName());                   // Nom de la carpeta
        System.out.println("Longitud: " + carpeta.length());              // Mida (en carpetes sovint és 0)
        System.out.println("Ruta absoluta: " + carpeta.getAbsolutePath()); // Ruta completa de la carpeta
    }
}
