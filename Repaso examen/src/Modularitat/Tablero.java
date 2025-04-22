package Modularitat;

/**
 *
 * @author crist
 */
public class Tablero {
    private String nom;
    private int Humitat;
    private int Temperatura;
    private double puntuacio=10;

    public Tablero() {
    }

    public Tablero(String nom, int Humitat, int Temperatura) {
        this.nom = nom;
        this.Humitat = Humitat;
        this.Temperatura = Temperatura;
    }
    
     public Tablero(int Humitat, int Temperatura) {
        this.Humitat = Humitat;
        this.Temperatura = Temperatura;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHumitat() {
        return Humitat;
    }

    public void setHumitat(int Humitat) {
        this.Humitat = Humitat;
    }

    public int getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(int Temperatura) {
        this.Temperatura = Temperatura;
    }

    public double getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(double puntuacio) {
        this.puntuacio = puntuacio;
    }

    @Override
    public String toString() {
        return "Marques_2{" + "nom=" + nom + ", Humitat=" + Humitat + ", Temperatura=" + Temperatura + ", puntuacio=" + puntuacio + '}';
    }
    
    
}
