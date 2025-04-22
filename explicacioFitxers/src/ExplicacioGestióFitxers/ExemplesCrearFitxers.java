/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExplicacioGestióFitxers;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author david
 */

public class ExemplesCrearFitxers {
    public static void main(String[] args) {
        
        // ======= CREAR UN FITXER =======
        
        // Creem un objecte File que apunta a un fitxer anomenat "nouFitxer.txt"
        File fitxer = new File("@n/ouFitxer.txt");

        try {
            // Intentem crear el fitxer físicament amb createNewFile()
            // Aquest mètode retorna true si el fitxer s'ha creat, i false si ja existia
            if (fitxer.createNewFile())
                System.out.println("Fitxer creat");
            else
                System.out.println("El fitxer ja existeix");

        } catch (IOException e) {
            // Si hi ha algun error durant la creació del fitxer (per exemple, problemes de permisos), es captura l'excepció
            e.printStackTrace(); // Mostra el missatge d'error complet per depurar
        }

        // ======= CREAR UN DIRECTORI =======

        // Creem un objecte File que representa un directori anomenat "nouDirectori"
        File directori = new File("nouDirectori");

        // mkdir() crea el directori. Retorna true si s'ha creat correctament
        if (directori.mkdir())
            System.out.println("Directori creat");
        else
            System.out.println("No s'ha pogut crear el directori");

        // ======= ESBORRAR UN FITXER =======

        // Apuntem a un fitxer anomenat "exemple.txt" que volem esborrar
        File fitxerEsborrar = new File("exemple.txt");

        // delete() intenta eliminar el fitxer. Retorna true si s'ha esborrat correctament
        if (fitxerEsborrar.delete())
            System.out.println("Fitxer eliminat");
        else
            System.out.println("No s'ha pogut eliminar el fitxer");

        // ======= LLISTAR ELS FITXERS D'UN DIRECTORI =======

        // Creem un objecte File que apunta al directori actual amb "."
        File directori2 = new File(".");

        // Obtenim un array de String amb els noms dels fitxers i carpetes dins d'aquest directori
        String[] fitxers = directori2.list();

        System.out.println("\nLlista de fitxers:");

        if (fitxers != null) {
            // Recorrem la llista amb un bucle for bàsic i imprimim cada nom
            for (int i = 0; i < fitxers.length; i++)
                System.out.println(fitxers[i]);
        } else {
            // Si no s'ha pogut llegir el directori (possibles problemes de permisos, etc.)
            System.out.println("No s'ha pogut llistar els fitxers");
        }
    }
}