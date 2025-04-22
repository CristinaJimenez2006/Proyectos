package Modularitat;

/**
 *
 * @author crist
 */
public class pr9_level_2 {
    public static void main (String [] args){
        int filas=12;
        double promedio=0; 
        double [] precioMensual = new double [filas]; 
        
        for (int i = 0; i < precioMensual.length; i++) {
            precioMensual[i]= (double)(Math.random()* 25);
            System.out.println(precioMensual[i]);
        }
        for (int i = 0; i < precioMensual.length; i++) {
            //Mirar la corrección porque puede realizarse de maneras diferentes. 
            if (i==0){
                promedio=precioMensual[i]; 
            }else{
                if(promedio<precioMensual[i]){
                    System.out.println("El precio "+precioMensual[i]+" es mayor al promedio " +promedio);
                }
                 promedio=(promedio+precioMensual[i])/(i); 
            }
        }
    }
}
