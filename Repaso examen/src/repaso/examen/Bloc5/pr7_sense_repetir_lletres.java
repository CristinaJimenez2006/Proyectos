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
public class pr7_sense_repetir_lletres {
    public static void main(String[] args) {

        // Una forma de generar un array de char aleatoris
        char[] caracteres = new char[20];
        Scanner lector = new Scanner (System.in);
        String paraula; 
        int cont=0; 

        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        boolean check = false;
        char letra;
        
        for (int i = 0; i < caracteres.length; i++) {
            check = false;
            letra = alfabeto.charAt((int) (Math.random() * caracteres.length));
            for (int j = 0; j <= i; j++) {
                if (caracteres[j] == letra) {
                    check = true;
                    break;
                }
            }
            
            if (!check) {
                caracteres[i] = letra;
            } else {
                i--;
            }
        }
      
        for (int i = 0; i < caracteres.length; i++) {
            System.out.print("  - " + caracteres[i]);   
        }

        
        
        
        
        // Una altra forma de generar un array de char aleatoris
        
        String alfabet = "abcdefghijklmnopqrstuvwxyz";

        char[] lletres = new char[20];

        for (int i = 0; i < lletres.length; i++) {
            int num = (int) (Math.random() * alfabet.length());
            lletres[i] = alfabet.charAt(num);
            alfabet = alfabet.substring(0, num) + alfabet.substring(num + 1, alfabet.length());
            System.out.println(alfabet);
        }

        for (int i = 0; i < lletres.length; i++) {
            System.out.print(lletres[i] + " - ");
        }
        
        // Ara mancara fer el que és el problema, però és molt simple

    }
}


