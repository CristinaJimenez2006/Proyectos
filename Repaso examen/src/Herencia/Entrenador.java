package Herencia;

/**
 *
 * @author crist
 */
public class Entrenador extends SeleccionFutbol {
  private String idfederacion; 

    public Entrenador() {
        super(); 
    }

    public Entrenador(String idfederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idfederacion = idfederacion;
    }

    public String getIdfederacion() {
        return idfederacion;
    }

    public void setIdfederacion(String idfederacion) {
        this.idfederacion = idfederacion;
    }

    public void DirigirPartido (){
        
    }
    
    public void DirigirEntreno(){
        
    }
  
}

