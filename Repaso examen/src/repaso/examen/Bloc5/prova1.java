package repaso.examen.Bloc5;

import java.util.Scanner; 
/**
 *
 * @author crist
 */
public class prova1 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in); 
        
        int files=5, columnes=5, fitxes=10, x,y; 
        char [][] tauler = new char [files][columnes]; 
        
        for (int i = 0; i < fitxes; i++) {
            x = (int)(Math.random()*5); 
            y=(int)(Math.random()*5); 
            if(tauler[x][y]=='X'){
                i--;
            }else{
                tauler[x][y]='X'; 
            }
            
        }
        for (int i = 0; i < files; i++) {
            System.out.print("|");
            for (int j = 0; j < columnes; j++) {
               if (tauler[i][j]!='X'){
                tauler[i][j]='0'; 
                        }
                System.out.print(tauler[i][j]+"|");
            }
            System.out.println("");
        }
        int intents=100, tir=0, acerts=0, fallats=0;
        x=0;
        y=0; 
        //Impactar 10 objectes perquè s'acabi el joc i només té 100 intents. 
        while((tir<intents)&&(acerts<fitxes)){
            System.out.println("Introdueix la posicio en aquest format 'x,y'");
            String pos = in.nextLine();  
            String[] parts = pos.split(",");

            // Convertim la primera part a un número
            x = Integer.parseInt(parts[0]);
            y = Integer.parseInt(parts[1]); 
            
            if(tauler[x][y]=='X'){
                acerts++;
                tauler[x][y]='1'; 
                System.out.println("Has acertat. Et queden "+(fitxes-acerts)+" objectes.");
            }else if(tauler[x][y]=='1'){
                System.out.println("Ja has disparat aquí.");
                fallats++; 
            }else{
                fallats++; 
            }
            tir++;
            System.out.println("Has fet "+(intents-tir)+" intents.");
            
        }
}
}
