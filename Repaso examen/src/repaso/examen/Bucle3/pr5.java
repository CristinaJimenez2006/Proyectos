/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bucle3;

/**
 *
 * @author crist
 */
public class pr5 {
    public static void main (String []args){
        int i, u, resultat=0; 
      for (u=2; u<=10; u++){ 
        System.out.println("Taula del "+u);
        for ( i=1; i<=10; i++){
            resultat=u*i; 
            System.out.println(u+"*"+i+"="+resultat);
        }
    }
}}
