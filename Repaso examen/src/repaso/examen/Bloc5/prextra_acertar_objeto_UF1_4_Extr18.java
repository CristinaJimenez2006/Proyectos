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
public class prextra_acertar_objeto_UF1_4_Extr18 {
    public static void main (String[]args){
      Scanner in = new Scanner(System.in);

        int mida = 5;
        int fitxes = 10;
        int intentsPossibles = 100;
        char[][] tauler = new char[mida][mida];

        // Carrega automàtica
        int x, y;
        for (int i = 0; i < fitxes; i++) {
            x = (int) (Math.random() * mida);
            y = (int) (Math.random() * mida);

            if (tauler[x][y] == 'X') {
                i--;
                System.out.println("Ja hi ha fitxa");
            } else {
                tauler[x][y] = 'X';
            }

        }
        // Mostrem el tauler

        for (int i = 0; i < mida; i++) {
            for (int j = 0; j < mida; j++) {
                System.out.print(tauler[i][j] + " ");
            }
            System.out.println("");
        }

        // Comença el joc
        int intents = 0;
        int encerts = 0;
        while ((intents <= 100) && (encerts != 10)) {
            x = (int) (Math.random() * 5);
            y = (int) (Math.random() * 5);
            intents++;
            System.out.println(x + "," + y);
            if (tauler[x][y] == 'X') {
                System.out.println("Has encertat un");
                encerts++;
                tauler[x][y] = '0';
                System.out.println("Portes " + encerts + " encerts");
            } else if (tauler[x][y] == '0') {
                System.out.println("Aqui ja has disparat");
            } else {
                System.out.println("Has fallat");
            }
            System.out.println("Queden " + (intentsPossibles - intents));
        }
        if (encerts == 10) {
            System.out.println("Has guanyat");
        } else {
            System.out.println("Has perdut");
        }

    }
}
