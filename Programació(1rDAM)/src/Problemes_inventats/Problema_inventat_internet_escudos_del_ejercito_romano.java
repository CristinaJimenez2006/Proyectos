/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problemes_inventats;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Problema_inventat_internet_escudos_del_ejercito_romano {
    public static void main(String[] args) {
        canner in = new Scanner(System.in);
        System.out.println("Introdueix un numero");
        int soldats=in.nextInt();
        int numfront= in.nextInt();
        int numlat = in.nextInt();
        int numint = in.nextInt();
        int costat; 
        int escudosfront=0, escudoslat=0, escudosint=0, escudostotales=0;
        //Quadrat que poden sortir
        while (soldats!=0){
            costat = (int) (Math.sqrt(soldats));
            //Fem que el numero si es per exmple: 8,889898 sortir només 8 (l'enter sense decimals). 
            System.out.println("Quadrat de:"+costat);
            soldats = soldats - (costat*costat);
           escudoslat=(costat*4*numfront)-(numlat*4);
           escudosfront=4*numlat;
           escudosint=(costat*costat)-escudoslat-escudosfront;
           escudostotales=escudoslat+escudosint+escudosfront;
           System.out.println("Total escudos:"+escudostotales);
           escudosttotales=escudostotales*
        }
        //nombres d'escuts a partir del costat
        
    }
}

 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     
        int escudos=0, escudostotales=0;
        //Quadrat que poden sortir
            int soldats =75;
while (soldats!=0){
            costat = (int) (Math.sqrt(soldats));
            //Fem que el numero si es per exmple: 8,889898 sortir només 8 (l'enter sense decimals). 
            System.out.println("Quadrat de:"+costat);
            soldats = soldats - (costat*costat);
           escutsTotals=escutsTotals + escuts;
           System.out.println("Quadrat de:"+costat);
        System.out.println("Quadrat de:"+costat);
        }
        //nombres d'escuts a partir del costat
        
    }
}