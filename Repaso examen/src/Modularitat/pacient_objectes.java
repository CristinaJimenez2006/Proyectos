package Modularitat;

/**
 *
 * @author crist
 */
//APUNTS
public class pacient_objectes {
    //Atributos
  private String nom;
  private String cognom;
  private int edat;
  private float alsada; 

  //Constructores
    public pacient_objectes() {
    }

    public pacient_objectes(String nom, String cognom) {
        this.nom = nom;
        this.cognom = cognom;
    }
  
  //Setters y Getters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    //Lo mete dentro
    public String getCognom() {
        return cognom;
    }
    //Lo saca fuera para imprimirlo, guarddarla en una variable, etc. 
    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public float getAlsada() {
        return alsada;
    }

    public void setAlsada(float alsada) {
        this.alsada = alsada;
    }
    
    
}
