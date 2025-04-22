package Modularitat;

import java.util.Scanner; 
/**
 *
 * @author crist
 */
public class Vehiculos_2 {
    public static void main (String []args){
        // Enunciado: Dime el modelo, el año de fabricacion, el color, la cilindrada, el precio y la marca de tres coches diferentes. Cabe destacar que para obtener la información se tiene que utilizar tres constructores diferentes. Puedes hacer uso de los metodos. 
        //Dissenya una classse anomenada vehicles amb els atributs (marcca, modelo . . .) i els constructors i mètodes bàsics. Generea un fitxer fora executable: 
        //a) Genera un objecte buit. Demana informació i afegeix-la. 
        //b) genera un altre objecte. Crida un mètode static que l'empleni informació. Amb els parametres necessaris. 
        //c) Genera un altre objecte que cridi a un metode no static i que l'empleni d'informacio. Valora l'ús e this.setMarca(marca) i this.marca=marca. 
        Vehiculos coche1 = new Vehiculos(); 
        Vehiculos coche2 = new Vehiculos("hsg",1956,"blanco",15.5,7000.5); 
        Vehiculos coche3 = new Vehiculos("jhgjk","hsg",2023,"rojo",19.75,5546.5);  
        
        //Imprime todo de una vez. 
        System.out.println(coche3.toString());
        
        //Imprime todo de uno en uno.
        System.out.println(coche2.toString());
        coche2.setMarca("jshdg");
        System.out.println(coche2.getMarca());
        
        coche1.setMarca("jshdg");
        System.out.println(coche1.getMarca());
        coche1.setModelo("jshdg");
          System.out.println(coche1.getModelo());
        coche1.setAnyoFabricacion(1942);
          System.out.println(coche1.getAnyoFabricacion());
        coche1.setColor("azul");
          System.out.println(coche1.getColor());
        coche1.setCilindrada(19.75);
          System.out.println(coche1.getCilindrada());
        coche1.setPrecio(1900.7);
        Scanner in =new Scanner (System.in); 
        //També es pot mostrar  d'aquesta manera
        coche1.setPrecio(in.nextDouble());// No funciona perquè es un string i em demana un double
        
        //També puc crear un altre objecte
        Vehiculos coche2 =new Vehiculos (); 
        emplenaDades (coche2,in); 
    }
    public static void emplenaDades (Vehiculos coche, Scanner in){
        //Llenarlo con los datos anteriores
    }
    
}
