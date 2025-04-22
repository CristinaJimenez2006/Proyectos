/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bloc5;

/**
 *
 * @author crist
 */
public class pr27 {
     public static void main(String[] args) {
        int files = 5, columnes = 10;
        int[][] problema = new int[files][columnes];
        for (int i = 0; i < 5; i++) {
            System.out.print("|");
            for (int j = 0; j < 10; j++) {
                if (i % 2 == 0) {
                    problema[i][j] = (int) (Math.random() * 50);
                } else {
                    problema[i][j] = 0;
                }
                System.out.print(problema[i][j] + "|");
            }
            System.out.println("");
        }

    }
}

