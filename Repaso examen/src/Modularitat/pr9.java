package Modularitat;

import java.util.Scanner; 
/**
 *
 * @author crist
 */
public class pr9 {
    //FALTA HACERLO CON METODOS
    public static void main (String []args){
        Scanner in = new Scanner (System.in); 
        int files=2, salaritre, aument; 
        int [] salario= new int [files];
        for (int i = 0; i < files; i++) {
            System.out.println("Introdueix el salari del treballador" +i);
            salaritre=in.nextInt(); 
            salario [i]= salaritre;
            System.out.print(salario[i]);
        }
        
        //Aumento a aplicar
        for (int i = 0; i < files; i++) {
             System.out.println("Introdueix l'aument a aplicar al treballador" +i);
             aument=in.nextInt(); 
             salario [i] = (((100-aument)/100)*salario[i])+salario [i];
             System.out.print(salario[i]
        }
    }
    
}

//NOTAS: Puc fer --> public static void emplena (float[] sal, Scanner in){}. En lo arrays no hace falta return. 

