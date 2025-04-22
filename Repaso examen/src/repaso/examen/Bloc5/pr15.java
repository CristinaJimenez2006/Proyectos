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
public class pr15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] matriz = new int[20];
        int cont = 0, num = 0;
        while (cont != 20) {
            if (num % 2 == 0) {
                matriz[cont] = num;
                System.out.println(">>" + matriz[cont]);
                cont++;
            }
            num++;
        }
    }
}
