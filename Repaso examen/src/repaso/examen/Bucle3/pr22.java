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
public class pr22 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introdueix un correu electrònic...");
        String correu = lector.nextLine();

        if (correu.indexOf('@') != -1) {
            if (correu.indexOf('.', correu.indexOf('@')+1) != -1) {
                System.out.println("El correu és vàlid");
            } 
        }else {
                System.out.println("El correu no és vàlid");
            

        }
    }
}
/*Consultar solucions del moodle*/