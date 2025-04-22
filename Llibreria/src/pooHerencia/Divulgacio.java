package pooHerencia;

/**
 *
 * @author crist
 */
public class Divulgacio extends Llibreria {
    private String ambit; 

    public Divulgacio() {
        super(); 
    }

    public Divulgacio(String ambit, String titol, String isbn, String autor, String editorial, int exemplars, double preu) {
        super(titol, isbn, autor, editorial, exemplars, preu);
        this.ambit = ambit;
    }

    public String getAmbit() {
        return ambit;
    }

    public void setAmbit(String ambit) {
        this.ambit = ambit;
    }
    
    public void imprimeixAmbit(){
        
    }
    
    @Override
    public String toString() {
        return "Llibreria{" + "titol=" + titol + ", isbn=" + isbn + ", autor=" + autor + ", editorial=" + editorial + ", exemplars=" + exemplars + ", preu=" + preu + ", ambit="+ ambit+'}';
    }
}
