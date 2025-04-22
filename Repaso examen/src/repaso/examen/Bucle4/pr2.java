/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bucle4;

/**
 *
 * @author crist
 */
public class pr2 {
    public static void main(String[] args) {
        int num=0;

        for (int i = 0; i <= 20; i++) {
            if (num % 2 == 0) {
                System.out.println("Taula del " + num);
                int resultat = 0;
                for (int j = 0; j <= 10; j++) {
                    resultat = num * j;
                    System.out.println(num + "*" + j + "=" + resultat);
                }
            }
            num++;
        }
    }
}
