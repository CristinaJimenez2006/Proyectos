/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen;

/**
 *
 * @author crist
 */
public class Tres_numeros_multiplicats_correccio_examen {
    public static void main (String[]args){
        
        int passades=0; 
        for (int i=1; i<72;i++){
            for (int j=1; j<72; j++){
                for (int u=1; u<72; u++){
                    if (i*j*u==72){
                     System.out.println(i+"-"+j+"-"+u);   
                    }
                    passades++; 
                }
            }
        }
        System.out.println("> " + passades);
    }
}
