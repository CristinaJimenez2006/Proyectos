/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bucle4;

/**
 *
 * @author crist
 */
public class pr7 {
    public static void main (String[] args){
        int i, cont1=0,cont2=0; 
        for (i=1; i<=100; i++){
            if (i%2==0){
                cont1++; 
            }if (i%5==0){
                cont2++; 
            }
        }
        System.out.println("Nombres múltiples de 2 "+cont1);
        System.out.println("Nombres múltiples de 5 "+cont2);
    }
}
