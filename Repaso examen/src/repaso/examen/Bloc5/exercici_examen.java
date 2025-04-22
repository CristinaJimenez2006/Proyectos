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
public class exercici_examen {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        float[] guardarsalariosanuales = new float[10];
        float[] guardarsalariosmensuales = new float[10];
        float salaribrut, salaribruttotal; 
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Empleat "+i);
            System.out.println("Introdueix el salari brut anual");
            salaribrut=in.nextInt();
            salaribruttotal=salaribrut;
            if (salaribrut<=1400000){
                 salaribruttotal-=(salaribrut*0.08f); 
            }else if (salaribrut<=1800000){
                 salaribruttotal-=(salaribrut*0.11f); 
            }else if (salaribrut<=2200000){
                 salaribruttotal-=(salaribrut*0.13f); 
            }else if (salaribrut<=3000000){
                 salaribruttotal-=(salaribrut*0.17f); 
            }else if (salaribrut<=5000000){
                 salaribruttotal-=(salaribrut*0.20f); 
            }else{
                 salaribruttotal-=(salaribrut*0.25f);  
            }
            salaribruttotal-=(salaribrut*0.06f);
            guardarsalariosanuales[i]=salaribruttotal; 
            System.out.println("El salari net anual és de "+guardarsalariosanuales[i]+ " euros."); 
            salaribruttotal/=14;
            guardarsalariosmensuales[i]=salaribruttotal;
            System.out.println("El salari mensual és de "+guardarsalariosmensuales[i]+ " euros.");
        }
    }
}
