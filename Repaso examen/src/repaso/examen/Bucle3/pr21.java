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
public class pr21 {
  public static void main (String[]args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introdueix una paraula...");
        String paraula = lector.nextLine();
        int cont = 0;

        for (int i = 0; i < paraula.length(); i++) {
            if (paraula.charAt(i) == paraula.charAt((paraula.length()) - 1 - i)) {
                cont++;
            }
        }
        if (cont == paraula.length()) {
            System.out.println("És una paraula palíndrom.");
        } else {
            System.out.println("No és una paraula palíndrom.");
        }
    }
}
