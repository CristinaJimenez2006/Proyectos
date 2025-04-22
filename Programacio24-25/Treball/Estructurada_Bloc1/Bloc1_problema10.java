
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author crist
 */
public class Bloc1_problema10 {
     public static void main(String[] args) {
     
        Scanner in = new Scanner(System.in);
        
        int hores, minuts;
       
        System.out.print("Introdueix hora: ");
        hores = in.nextInt();
       
        System.out.print("Introdueix minuts: ");
        minuts = in.nextInt();
        
        int minutsTranscorreguts;
        
        minutsTranscorreguts = hores * 60 + minuts;
        
        System.out.println("Minuts transcorreguts = " + minutsTranscorreguts);
}
