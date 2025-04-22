/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bloc5;

/**
 *
 * @author crist
 */
public class pr21 {

    public static void main(String[] args) {
        int[][] problema = new int[2][6];
        for (int i = 0; i < 2; i++) {
            System.out.print("|");
            for (int j = 0; j < 6; j++) {
                problema[i][j] = (int) (Math.random() * 100);
                 System.out.println(problema[i][j]+"|");
                 System.out.println(i + "" + j + ">>" + problema[i][j]);
            }
             System.out.println("");
        }

    }
}
