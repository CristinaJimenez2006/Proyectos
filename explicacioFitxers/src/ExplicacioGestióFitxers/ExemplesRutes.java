/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExplicacioGestióFitxers;

import java.io.File;

/**
 *
 * @author david
 */

public class ExemplesRutes {
    public static void main(String[] args) {
        // TODO code application logic here
        // Exemple amb carpetes
        
    	
        // RUTA DEL PROJECTE: /home/david/Escriptori
    	// EXEMPLE DE RUTA AMB WINDOWS: C:/Users/david/Desktop/M03-Programacio/CursJava
        
        File carpetaActual = new File(".");            // carpeta actual
        File carpetaPare = new File("..");             // carpeta superior → C:/Users/david/Desktop/M03-Programacio
        File carpetaArrel = new File("C:/");           // carpeta arrel de la unitat C: en Windows
        File carpeta1 = new File("C:/Users/david");    // carpeta david a la unitat C:
        File carpeta2 = new File("../../");            // puja dues carpetes → C:/Users/david/Desktop
        File carpeta3 = new File("../../../");         // puja tres carpetes → C:/Users/david
        File carpeta4 = new File("../imgs");           // C:/Users/david/Desktop/M03-Programacio/imgs

        // Exemple amb fitxers
        File arxiu1 = new File("../img1.png");         // C:/Users/david/Desktop/M03-Programacio/img1.png
        File arxiu2 = new File("C:/img2.png");         // ruta absoluta → C:/img2.png
        File arxiu3 = new File("../../img3.png");      // C:/Users/david/Desktop/img3.png
        File arxiu4 = new File("img4.png");            // ruta relativa des de la carpeta actual
        File arxiu5 = new File("imgs/img5.png");       // C:/Users/david/Desktop/M03-Programacio/CursJava/imgs/img5.png
    }
    
}
