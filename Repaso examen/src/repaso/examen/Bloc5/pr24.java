/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bloc5;

/**
 *
 * @author crist
 */
public class pr24 {
    public static void main (String[]args){
        int files=5, columnes=5; 
        int[][] problema = new int[files][columnes];
        for (int i = 0; i < 5; i++) {
            System.out.print("|");
            for (int j = 0; j < 5; j++) {
                problema[i][j]=i+j; 
                System.out.print(problema[i][j]+"|");
            }
            System.out.println("");
        }

    }
}

    
