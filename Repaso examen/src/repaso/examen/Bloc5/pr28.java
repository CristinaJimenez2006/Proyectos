/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bloc5;

/**
 *
 * @author crist
 */
public class pr28 {
    public static void main (String[]args){
        int suma=0, files=9, columnes=10; 
        int[][] problema = new int[files][columnes];
        int []guardarsumasfiles = new int [files];
        int []guardarsumascolumnes = new int [columnes];
        System.out.println("Suma files");
        for (int i = 0; i < files; i++) {
            System.out.print("|");
            for (int j = 0; j < columnes; j++) {
                problema[i][j] = (int) (Math.random() * 50);
                suma+=problema[i][j];
                System.out.print(problema[i][j] + "|");
            }
            guardarsumasfiles[i]=suma;
            System.out.print(">>"+guardarsumasfiles[i]);
            suma=0; 
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Suma columnes");
         for (int j = 0; j < columnes; j++) {
            System.out.print("|");
            for (int i = 0; i < files; i++) {
                suma+=problema[i][j];
                System.out.print(problema[i][j] + "|");
            }
            guardarsumascolumnes[j]=suma;
            System.out.print(">>"+guardarsumascolumnes[j]);
            suma=0; 
            System.out.println("");
        }
    }
}