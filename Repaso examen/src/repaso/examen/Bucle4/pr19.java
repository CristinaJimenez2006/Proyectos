/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bucle4;

import java.util.Scanner; 
/**
 *
 * @author crist
 */
public class pr19 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner lector = new Scanner (System.in); 
        System.out.println("Introdueix el nombre de treballadors");
        int nombretreballadors;
        nombretreballadors = in.nextInt();

        for (int i = 0; i <=nombretreballadors; i++) {
            System.out.println("El nombre d'hores treballades pel treballador setmanal");
            double horestreballades;
            double salari;
            horestreballades = in.nextDouble();
            System.out.println("Introdueix també el seu torn");
            String torn = lector.nextLine();
            torn = torn.toLowerCase();
            salari = 0;
                if (torn.charAt(0) == 'm') {
                    salari = salari + (horestreballades * 30);
                } else if (torn.charAt(0) == 't') {
                    salari = salari + (horestreballades * 30 * 1.2f);
                } else if (torn.charAt(0) == 'n') {
                        
                    salari = salari + (horestreballades * 30 * 1.5f);
                }
            
            if (salari < 700) {
                salari = salari * 0.08f;
            } else if ((salari >= 700) && (salari < 1100)) {
                salari = salari * 0.10f;
            } else {
                salari = salari * 0.12f;
            }
            System.out.println("El salari setmanal del treballador " + i + " és " + salari);
            System.out.println("Queden treballadors?");
            nombretreballadors--;
            switch (nombretreballadors) {
                case 1:
                    System.out.println("Queda "+nombretreballadors+ " treballador.");
                    break;
                case 0:
                    System.out.println("No queden treballadors.");
                    break;
                default:
                    System.out.println("Queden "+nombretreballadors+ " treballadors.");
                    break;
            }
        }
    }
}
