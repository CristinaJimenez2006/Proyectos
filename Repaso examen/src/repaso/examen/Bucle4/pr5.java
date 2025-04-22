/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bucle4;

/**
 *
 * @author crist
 */
public class pr5 {
public static void main (String []args){
    int i, suma=0, multiplicacio=1;
    for (i=1; i<=20; i++){
        if (i%2==0){
          suma=suma+i;  
        }else{
            multiplicacio=multiplicacio*i;
        }     
    }
    System.out.println("La suma dels 20 nombres naturals parells és "+suma);
    System.out.println("La multiplicació dels 20 nombres imparells és "+multiplicacio);
}    
}
