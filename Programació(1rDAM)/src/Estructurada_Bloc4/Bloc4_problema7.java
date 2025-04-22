/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructurada_Bloc4;

/**
 *
 * @author crist
 */
public class Bloc4_problema7 {
    public static void main(String[] args) {
        int cont=0, num=0;
         for (int i=1; i < 100 ; i++){
           if ((num%2==0)&&(num%5==0)){
               cont=cont+1;
           }
            num++;
       }
          System.out.println(cont);
}
}
