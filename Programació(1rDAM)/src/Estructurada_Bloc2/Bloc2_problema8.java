/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructurada_Bloc2;

import java.util.Scanner; 

/**
 *
 * @author crist
 */
public class Bloc2_problema8 {
    public static void main (String[] args){
  	Scanner in= new Scanner(System.in);
        int solucions;
        double a,b,c,solucio1,solucio2,disc;

        System.out.printf("\nIntroduiex el paràmetre a: ");
        a=in.nextInt();
        System.out.printf("\nIntroduiex el paràmetre b: ");
        b=in.nextInt();
        System.out.printf("\nIntroduiex el paràmetre c: ");
        c=in.nextInt();

        // Calculem el discriminant
        disc=b*b-(4*a*c);
        // Esbrinem el nombre de solucions
        if (disc>0)
            {
            solucions=2;
            System.out.printf("El discriminant és %f per tant tenim %d solucions ",disc,solucions);
            solucio1= (b*(-1) + Math.sqrt(disc))/(2*a);
            solucio2= (b*(-1) - Math.sqrt(disc))/(2*a);
            System.out.printf("les solucions són: %f i %f",solucio1,solucio2);
            }
        else if (disc<0)
            {
            solucions=0;
            System.out.printf("El discriminant és %f per tant no tenim solució ",disc);
            System.out.printf("No té cap solució");
            }
            else
                {
                solucions=1;
                System.out.printf("El discriminant és %f per tant tenim %d solució ",disc,solucions);
                solucio1= (b*(-1) + Math.sqrt(disc))/(2*a);
                System.out.printf("La solució és: %f",solucio1);
                }


        }  
}
