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
public class pr20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix el nombre d'anys de l'empresa");
        int nombreAnys, cont1 = 0, cont2 = 0, cont3 = 0, gratificacio, total=0, nombreAnysTreballador;
        nombreAnys = in.nextInt();

        if (nombreAnys == 20) {
            //quan l'empresa compleix 20 anys
            System.out.println("Introdueix el nombre de treballadors");
            int nombretreballadors;
            nombretreballadors = in.nextInt();
            for (int i = 1; i <= nombretreballadors; i++) {
                System.out.println("Introdueix el nombre d'anys que porta treballant el treballador a l'empresa");
                //Segons el nombre d'anys que porta treballant el treballador rebrà una gratificació d'una quantitat de diners diferent o no rebrà cap. 
                nombreAnysTreballador = in.nextInt();
                gratificacio=0; 
                if ((nombreAnysTreballador >= 3) && (nombreAnysTreballador < 10)) {
                    cont1++;
                    gratificacio=300;
                } else if ((nombreAnysTreballador >= 10) && (nombreAnysTreballador < 15)) {
                    cont2++;
                    gratificacio=400;
                } else if (nombreAnysTreballador >= 15) {
                    cont3++;
                    gratificacio=700; 
                }else{
                  System.out.println("El treballador "+i+ " no rep cap gratificació.");   
                }
                System.out.println("El treballador "+i+ " té una gratificació de "+gratificacio);
                total=total+gratificacio; 
            }
        }
        System.out.println("El nombre total de gratificacions són: " +(cont1+cont2+cont3));
        System.out.println("- Gratificacions de 300 euros: " +cont1);
        System.out.println("- Gratificacions de 400 euros: "+cont2);
        System.out.println("- Gratificacions de 700 euros: "+cont3);
        System.out.println("El nombre total a pagar en gratificacions és "+total+".");
    }
}
