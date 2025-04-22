/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bucle3;

import java.util.Scanner; 
/**
 *
 * @author crist
 */
public class pr16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introdueix una frase...");
        String frase = in.nextLine();

        // Recorrer la frase desde el último carácter hasta el primero
        for (int i = frase.length() - 1; i >= 0; i--) {
            System.out.print(frase.charAt(i));
        }
        System.out.println();
    }
}
