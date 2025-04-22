/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen;

import java.util.Scanner; 
/**
 *
 * @author crist
 */
public class prpiedras {
    public static void main (String []args){
       Scanner in = new Scanner (System.in); 
        System.out.println("Introdueix el nombre de pedres");
        int pedres=in.nextInt();
        int filas=0, lado=0, pedressobrant=pedres; 
        
        for (int i=1;i<pedressobrant; i++){
            filas=filas+i;
            lado++;
            pedressobrant=pedressobrant-i; 
          }
        System.out.println("Nombre de pedres: "+pedres+"; triangle de "+lado+"; sobren "+pedressobrant+" i pedres utilitzades "+filas);
    }
}
