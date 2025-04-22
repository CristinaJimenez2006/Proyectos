/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bloc5;

/**
 *
 * @author crist
 */
public class pr22 {
  public static void main(String[] args) {
        int suma=0, files=5, columnes=10; 
        int[][] problema = new int[files][columnes];
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                problema[i][j] = (int) (Math.random() * 50);
                suma+=problema[i][j];
                System.out.println(problema[i][j]+"");
            }
            System.out.println("");
        }
        System.out.println("La suma de totes les cel·les que conté és de "+suma);

    }
}