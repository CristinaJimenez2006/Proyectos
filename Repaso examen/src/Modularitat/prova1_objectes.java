package Modularitat;

/**
 *
 * @author crist
 */
public class prova1_objectes {
    public static void main (String[]args) {
     //Un objeto que se llama paciente 1
     //En la otra hoja tengo los objetos, aquí los llamo solo. 
    pacient_objectes pacient1 = new pacient_objectes();
    pacient_objectes malalt1 = new pacient_objectes();
    pacient_objectes malalt2 = new pacient_objectes("Pepe","Gómez");

    //Lo meto en el atributo
    pacient1.setNom("Pedro");
    //Lo saco del atributo
    System.out.println(pacient1.getNom());

    //Me sacara el nombre de Pepe que es el que guardé linias anteriores. 
     String nom=malalt2.getNom();
     
     //Tiene que acceder a traves de un set o de un get, no puede ser directamente sine ellos a menos que de private lo ponga a public
     //No debo ponerlo publico, siempre privado. 
}    
}
