package exercicisgestiofitxers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Exercicis2 {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String nomFitxer = "provaNamePersons.txt";
        int numLinies = 6;
        crearLinies(nomFitxer, numLinies, str);
        adjuntarNoms(nomFitxer, numLinies);
    }

    public static void crearLinies(String nomFitxer, int numLinies, Scanner str) {

        try {

            FileWriter escriptorFitxer = new FileWriter(nomFitxer, true);
            BufferedWriter escriptorFitxer2 = new BufferedWriter(escriptorFitxer);

            String nom = "";
            for (int i = 0; i < numLinies; i++) {
                escriptorFitxer2.write(nom = str.nextLine());
                escriptorFitxer2.newLine();
            }

            escriptorFitxer2.close();

            System.out.println("Fitxer " + nomFitxer + " creat amb " + numLinies + " línies.");

        } catch (IOException e) {
            // Gestió d’errors si hi ha problemes amb el fitxer
            System.out.println("Error en crear o escriure al fitxer: " + e.getMessage());

        }
    }

    public static void adjuntarNoms(FileWriter escriptorFitxer, int numLinies) {
        try {
            if (escriptorFitxer != null) {

                FileReader lectorFitxer = new FileReader(nomFitxer);

                int caracter;
                System.out.println("Contingut del fitxer " + nomFitxer + ":");
                while ((caracter = lectorFitxer.read()) != -1) {

                    System.out.print((char) caracter);
                }

                lectorFitxer.close();

            }

        } catch (IOException e) {
            System.out.println("Error en llegir el fitxer: " + e.getMessage());
        }
    }

}
