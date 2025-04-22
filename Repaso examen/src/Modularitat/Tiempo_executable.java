package Modularitat;

/**
 *
 * @author crist
 */
public class Tiempo_executable {
    public static void main (String[]args){
    Tiempo[] tiempo = new  Tiempo[12]; 
    
    emplenaArrayExemples(tiempo); 
   //ALGORISMOS DE ORDENACION (MIRAR)
    mesMasSeco(tiempo); 
    }
    public static void emplenaArrayExemples(Tiempo [] tiempo) {
    tiempo[0] = new Tiempo("Enero",5.7,7.4);
    tiempo[1] = new Tiempo("Febrero",8.6,5.6);
    tiempo[2] = new Tiempo("Marzo",12.9,10.9);
    tiempo[3] = new Tiempo("Abril",20.3,3.2);
    tiempo[4] = new Tiempo("Mayo",26.1,5.9);
    tiempo[5] = new Tiempo("Junio",14.8,1.3);
    tiempo[6] = new Tiempo("Julio",34.9,8.4);
    tiempo[7] = new Tiempo("Agosto",15.7,9.5);
    tiempo[8] = new Tiempo("Septiembre",17.2,24.2);
    tiempo[9] = new Tiempo("Octubre",19.8,11.6);
    tiempo[10] = new Tiempo("Noviembre",22.2,14.3);
    tiempo[11] = new Tiempo("Diciembre",23.5,19.8);    
    }
    public static String mesMasSeco(Tiempo []tiempo){
        double minLluvia=0; 
        String minMes=""; 
        for (int i = 0; i < tiempo.length; i++) {
          if(tiempo[i]!=null){
             if (i==0){
                 minLluvia=tiempo[i].getLluvia();
                 minMes=tiempo[i].getMes(); 
             }else{
                 if(minLluvia>tiempo[i].getLluvia()){
                    minLluvia=tiempo[i].getLluvia();
                    minMes=tiempo[i].getMes(); 
                 }
             }
          }  
        }
        return minMes; 
    }
    }


