/*;
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bucle3;

import java.util.Scanner; 
/**
 *
 * @author crist
 */
public class pr19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix una frase...");
        String frase = in.nextLine();
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a') {
                cont1++;
            } else if (frase.charAt(i) == 'e') {
                cont2++;
            } else if (frase.charAt(i) == 'i') {
                cont3++;
            } else if (frase.charAt(i) == 'o') {
                cont4++;
            } else if (frase.charAt(i) == 'u') {
                cont5++;
            }

        }
        /*Es pot fer un switch-case*/
        System.out.println("La lletra a apareix "+cont1);
        System.out.println("La lletra e apareix "+cont2);
        System.out.println("La lletra i apareix "+cont3);
        System.out.println("La lletra o apareix "+cont4);
        System.out.println("La lletra u apareix "+cont5);
    }
}
