package projectes;

import java.util.Scanner; 
/**
 *
 * @author crist
 */
public class Joc_Cerca_les_fitxes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mida = 5;
        int fitxes = 10;
        int intentsPossibles = 100;
        char[][] tauler = new char[mida][mida];
        // Inicializar el tauler amb espais en blanc
        for (int i = 0; i < mida; i++) {
            for (int j = 0; j < mida; j++) {
                tauler[i][j] = '-';
            }
        }
        // Carrega automàtica de les fitxes
        int x, y;
        for (int i = 0; i < fitxes; i++) {
            x = (int) (Math.random() * mida);
            y = (int) (Math.random() * mida);
            if (tauler[x][y] == 'X') {
                i--; // Si ja hi ha fitxa, repetir iteració
            } else {
                tauler[x][y] = 'X';
            }
        }
        // Comença el joc
        int intents = 0;
        int encerts = 0;
        while ((intents < intentsPossibles) && (encerts < fitxes)) {
        // Mostrar el tauler ocult (sense mostrar les fitxes 'X')
            System.out.println("\nTauler actual:");
            for (int i = 0; i < mida; i++) {
                for (int j = 0; j < mida; j++) {

                    if (tauler[i][j] == 'X' || tauler[i][j] == '0') {
                        System.out.print("- "); // No mostra les fitxes X
                    } else {
                        System.out.print(tauler[i][j] + " ");
                    }
                }
                System.out.println();
            }
            // Demanar coordenades a l'usuari
            System.out.println("\nIntrodueix la coordenada X (0-4): ");
            x = in.nextInt();
            System.out.println("Introdueix la coordenada Y (0-4): ");
            y = in.nextInt();
            // Validació de coordenades
            if (x < 0 || x >= mida || y < 0 || y >= mida) {
                System.out.println("Coordenades fora de límit. Intenta-ho de nou.");
                continue; // Torna a demanar coordenades
            }
            intents++;
            // Comprovar la posició
            if (tauler[x][y] == 'X') {
                System.out.println("🎯 Has encertat una fitxa!");
                encerts++;
                tauler[x][y] = '0'; // Marquem la fitxa trobada
            } else if (tauler[x][y] == '0') {
                System.out.println("⚠️ Ja havies disparat aquí!");
            } else {
                System.out.println("❌ Has fallat.");
                tauler[x][y] = '*'; // Marquem els intents fallits
            }
            System.out.println("Encerts: " + encerts + "/" + fitxes);
            System.out.println("Intents restants: " + (intentsPossibles - intents));
        }
        // Mostrar el resultat del joc
        if (encerts == fitxes) {
            System.out.println("\n🏆 Felicitats! Has trobat totes les fitxes!");
        } else {
            System.out.println("\n😞 Has perdut! No has trobat totes les fitxes.");
        }
        // Mostrar el tauler final amb les fitxes descobertes
        System.out.println("\nTauler final:");

        for (int i = 0; i < mida; i++) {
            for (int j = 0; j < mida; j++) {
                System.out.print(tauler[i][j] + " ");
            }
            System.out.println();
        }
    }
}
