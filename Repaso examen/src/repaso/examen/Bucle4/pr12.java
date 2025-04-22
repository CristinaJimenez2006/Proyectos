/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.examen.Bucle4;

/**
 *
 * @author crist
 */
public class pr12 {
    public static void main (String []args){
        int i, u, numfilas=5, valorinici=10; 
        
        for (u=numfilas; u>=1; u--){
            System.out.println();
            for (i=valorinici; i>=0;i--){
                System.out.print(+i);
            }
             valorinici--;
        }
    }
}
