package Modularitat;

/**
 *
 * @author crist
 */
public class Província {
    private String nom; 
    private int poblacio; 
    private int extensio; 
    private double rxc; 
    private String provinciescontacte; 

    public Província() {
    }

    public Província(String nom, int poblacio, int extensio, double rxc, String provinciescontacte) {
        this.nom = nom;
        this.poblacio = poblacio;
        this.extensio = extensio;
        this.rxc = rxc;
        this.provinciescontacte = provinciescontacte;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPoblacio() {
        return poblacio;
    }

    public void setPoblacio(int poblacio) {
        this.poblacio = poblacio;
    }

    public int getExtensio() {
        return extensio;
    }

    public void setExtensio(int extensio) {
        this.extensio = extensio;
    }

    public double getRxc() {
        return rxc;
    }

    public void setRxc(double rxc) {
        this.rxc = rxc;
    }

    public String getProvinciescontacte() {
        return provinciescontacte;
    }

    public void setProvinciescontacte(String provinciescontacte) {
        this.provinciescontacte = provinciescontacte;
    }

    @Override
    public String toString() {
        return "Prov\u00edncia{" + "nom=" + nom + ", poblacio=" + poblacio + ", extensio=" + extensio + ", rxc=" + rxc + ", provinciescontacte=" + provinciescontacte + '}';
    }
    
    public double densitat(){
        return (double) (this.poblacio / this.extensio);  
    }
    public void actualitzacio(double increment){
        this.rxc= this.rxc+((this.rxc*increment)/100); 
    }
}
