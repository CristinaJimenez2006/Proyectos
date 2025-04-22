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
public class pr30 {
    private static final int F = 5;
    private static final int C = 5;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] tab = new int[F][C];
        int i, j, max, k;
        int[] ac = new int[F];

        for (i = 0; i < F; i++) {
            for (j = 0; j < C; j++) {
                System.out.printf("Introdueix les quantitats d'alumnes del curs %d que han tret un %d\n", i, j);
                tab[i][j] = in.nextInt();
            }
        }

        for (i = 0; i < F; i++) {
            ac[i] = 0;
            for (j = 5; j < C; j++) {
                ac[i] += tab[i][j];
            }
        }
        max = ac[0];
        k = 0;
        for (i = 1; i < F; i++) {
            if (max < ac[i]) {
                max = ac[i];
                k = i;
            }
        }
        System.out.printf("El curs que ha tingut més aprovats és el %d amb %d aprovats\n", k, max);
    
}
}
