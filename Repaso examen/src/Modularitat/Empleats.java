package Modularitat;

/**
 *
 * @author crist
 */
public class Empleats {
    private String nombre; 
    private int edad;
    private String telefono;
    private String departamento; 
    
    public Empleats() {
    }

    public Empleats(String nombre, int edad, String telefono, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.departamento=departamento; 
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

  
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    @Override
    public String toString() {
        return "Empleats{" + "nombre=" + nombre + ", edad=" + edad + ", telefono=" + telefono + ", departamento=" + departamento + '}';
    }

    

       
}
