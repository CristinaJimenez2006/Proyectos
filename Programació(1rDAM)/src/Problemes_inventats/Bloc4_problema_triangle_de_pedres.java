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
public class Bloc4_problema_triangle_de_pedres {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tamanotriangle=0, numpiedras;
        System.out.println("Introdueix un numero");
        numpiedras = in.nextInt();
        
        for (int i=1; i <=numpiedras; i++){
            tamanotriangle++; 
            numpiedras=numpiedras-i;   
        }
        System.out.println(""+numpiedras);
        System.out.println(""+tamanotriangle);    
        }
    } 

