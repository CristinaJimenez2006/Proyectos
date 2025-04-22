package Modularitat;

/**
 *
 * @author crist
 */
public class Persona {
    private int identificador; 
    private double peso;
    private int edad; 

    public Persona() {
    }

    public Persona(int identificador, double peso, int edad) {
        this.identificador = identificador;
        this.peso = peso;
        this.edad = edad;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "identificador=" + identificador + ", peso=" + peso + ", edad=" + edad + '}';
    }
    
    
}
