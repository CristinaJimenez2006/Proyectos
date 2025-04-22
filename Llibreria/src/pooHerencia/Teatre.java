package pooHerencia;

/**
 *
 * @author crist
 */
public class Teatre extends Llibreria {
    private String argument; 

    public Teatre() {
        super(); 
    }

    public Teatre(String argument, String titol, String isbn, String autor, String editorial, int exemplars, double preu) {
        super(titol, isbn, autor, editorial, exemplars, preu);
        this.argument = argument;
    }

    public String getArgument() {
        return argument;
    }

    public void setArgument(String argument) {
        this.argument = argument;
    }
    
    public void imprimeixArgument(){
        
    }
      @Override
    public String toString() {
        return "Llibreria{" + "titol=" + titol + ", isbn=" + isbn + ", autor=" + autor + ", editorial=" + editorial + ", exemplars=" + exemplars + ", preu=" + preu + ", argument="+ argument +'}';
    }
}
