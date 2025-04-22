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
public class pr18 {
    public static void main (String []args){  
     Scanner in = new Scanner (System.in);
     double compras=1,total=0, desc1, desc2;
     System.out.println("Introdueix el preu de cadascuna de les compres realitzades");
          
     while(compras!=0){
         compras=in.nextDouble();
         total=total+compras;
        }
     System.out.println("El client ha gastat "+total);
     System.out.println("Introdueix el descompte que és realitza en el cas de compres entre 300 i 800 euros");
     desc1=in.nextDouble();
     desc1=desc1/100;
     System.out.println("Introdueix també el descompte que és realitza en el cas de compres superiors a 800 euros");
     desc2=in.nextDouble();
     desc2=desc2/100;
     if ((total>=300)&&(total<=800)){
         total = total*(desc1);
          System.out.println("L'import total gastat pel client és "+total);
     }else if(total>800){
         total = total*(desc2);
          System.out.println("L'import total gastat pel client és "+total);
     }
    }
}
