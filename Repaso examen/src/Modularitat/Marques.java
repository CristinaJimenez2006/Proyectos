package Modularitat;

/**
 *
 * @author crist
 */
public class Marques {
       public static void main(String[] args) {
        int ample = 10; 
        int alt = 5;    

        // Crear la quadrícula
        Tablero[][] tablero = new Tablero[alt][ample];
        emplena(tablero, ample, alt);
        actualizaPuntuacio(tablero, ample, alt); 
        zonaConstruccio(tablero, ample, alt); 
        
       }
       public static final int temperaturaConst=20; 
       public static final int humitatConst=20; 
        
       public static void emplena(Tablero [][]tablero, int ample, int alt){
          int aux=0;   
        // Omplir la quadrícula amb valors aleatoris per a humitat i temperatura
        for (int i = 0; i < alt; i++) {
            for (int j = 0; j < ample; j++) {
                int humitat = (int)(20 + (Math.random()* 81)); // entre 20 i 100
                int temperatura = (int)(Math.random()* 31); // entre 0 i 30
                String nom =Integer.toString(aux); 
                aux++; 
                tablero [i][j] = new Tablero(nom, humitat, temperatura);
            }
        }
        
        }
       
       public static void actualizaPuntuacio(Tablero [][]tablero, int ample, int alt){
       int aux=0; 
       //Comparar la temperatura i la humitat amb els valors constants i modifica o no la puntuació. 
         for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                //Estalviem d'aquesta forma l'utilitzar les variables ample i alt.
                if(tablero[i][j]!=null){
                if((temperaturaConst<tablero[i][j].getTemperatura())||(temperaturaConst>tablero[i][j].getTemperatura())){
                    aux=temperaturaConst-tablero[i][j].getTemperatura(); 
                    //També és pot fer ús del "Math.abs()". Si fico -7, em torna 7. Si fico 5, em torna 5. 
                    if(aux>0){
                       tablero[i][j].setPuntuacio(tablero[i][j].getPuntuacio()-(aux*0.5));  
                    }else{
                       aux=aux*(-1); 
                       tablero[i][j].setPuntuacio(tablero[i][j].getPuntuacio()-(aux*0.5));
                    }   
                }
                if((humitatConst<tablero[i][j].getHumitat())||(humitatConst>tablero[i][j].getHumitat())){
                    aux=humitatConst-tablero[i][j].getHumitat(); 
                    if(aux>0){
                       tablero[i][j].setPuntuacio(tablero[i][j].getPuntuacio()-(aux*0.1));  
                    }else{
                       aux=aux*(-1); 
                       tablero[i][j].setPuntuacio(tablero[i][j].getPuntuacio()-(aux*0.1));
                    }
                }
            }
            }
        }
        
       }
       
       public static void zonaConstruccio(Tablero [][]tablero, int ample, int alt) {

        double millorPuntuacio = 0;
        String millorZona = "";
        
        //Trobar la zona amb millor puntuació
        for (int i = 0; i < alt; i++) {
            for (int j = 0; j < ample; j++) {
                if(tablero[i][j]!=null){
                double puntuacioActual = tablero[i][j].getPuntuacio();
                if(i==0){
                   millorPuntuacio = puntuacioActual;
                   millorZona = "(" + i + ", " + j + ")"; 
                }else{
                if (puntuacioActual > millorPuntuacio) {
                    millorPuntuacio = puntuacioActual;
                    millorZona=""; 
                    millorZona = "(" + i + ", " + j + ")";
                } else if (puntuacioActual == millorPuntuacio) {
                    millorZona += ",(" + i + ", " + j + ")";
                }
                }
            }
        }
        }

        // Mostrar el resultat
        System.out.println("La zona o zones més propícies per construir el palau del Marqués (amb la millor puntuació):");
        System.out.println(millorZona);
        System.out.println("Puntuació: " + millorPuntuacio);
    }
}


