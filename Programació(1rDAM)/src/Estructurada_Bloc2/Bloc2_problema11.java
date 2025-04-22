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
public class Bloc2_problema11 {
   public static void main (String[] args){
	Scanner in= new Scanner(System.in);
	
        double PreuInicial,PreuFinal=0;
	int Descompte;

	System.out.printf(" Introduei la quantitat\n ");
	PreuInicial=in.nextFloat();
	if (PreuInicial >= 10000.00)
		{
		Descompte=10;
		}
	else
		{
		Descompte=5;
		}
	PreuFinal=((100.0-Descompte)/100.0)*PreuInicial;
	System.out.printf("T'he fet un descompte del %d %% i has de pagar %.2f euros",Descompte,PreuFinal);


        clearScreen();
        }

public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
}

}
