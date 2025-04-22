/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructurada_Bloc4;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Bloc4_problema6 {
     public static void main(String[] args) {
       int num=0;
         for (int i=0; ((i<=0)&&(i>=100)); i++){
           if (num%3==0){
             i--;
           }else{
               i++;
            System.out.println("Números entre 0 i 100 sense ser múltiples de 3"+num);
           }
       }
}}
