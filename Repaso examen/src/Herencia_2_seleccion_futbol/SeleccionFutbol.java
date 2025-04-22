package Herencia_2_seleccion_futbol;

/**
 *
 * @author crist
 */
public abstract class SeleccionFutbol {
    protected int id;
    protected String nombre;
    protected String apellidos; 
    protected int edad; 
    
    //constructores, getters y setters
    
    public SeleccionFutbol(){
    } 

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void viajar() {
        System.out.println("Viajar (Clase Padre)");
    }
    public void concentrarse(){
        System.out.println("Concentrarse (Clase Padre)");
    }
    
    //IMPORTANTE -> METODO ABSTRATCTO => no se implementa en la clase abstracta pero si en la clase hijas
    public abstract void entrenamiento();
    public void partidoFutbol(){
        System.out.println("Asistir al partido de fútbol (Clase Padre)");
    }
}
