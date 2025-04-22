package Herencia;

/**
 *
 * @author crist
 */
public class Futbolista extends SeleccionFutbol {
    private int dorsal;
    private String desmarcacion;

    public Futbolista() {
        super(); 
    }

    public Futbolista(int dorsal, String desmarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.desmarcacion = desmarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDesmarcacion() {
        return desmarcacion;
    }

    public void setDesmarcacion(String desmarcacion) {
        this.desmarcacion = desmarcacion;
    }
    
    public void JugarPartido(){
        
    }
    
    public void Entrenar (){
        
    }
    
}
