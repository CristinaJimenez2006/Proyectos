/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bloc5;

/**
 *
 * @author crist
 */
public class pr25 {
    public static void main (String[]args){  
    int files=10, columnes=10; 
        int[][] problema = new int[files][columnes];
        for (int i = 0; i < 10; i++) {
            System.out.print("|");
            for (int j = 0; j < 10; j++) {
                problema[i][j]=i; 
                System.out.print(problema[i][j]+"|");
            }
            System.out.println("");
        }

}
}
