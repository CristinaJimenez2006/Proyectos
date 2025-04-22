package pooHerencia;

/**
 *
 * @author crist
 */
public class Narrativa extends Llibreria {

    private String genere;

    public Narrativa() {
        super();
    }

    public Narrativa(String genere, String titol, String isbn, String autor, String editorial, int exemplars, double preu) {
        super(titol, isbn, autor, editorial, exemplars, preu);
        this.genere = genere;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
    
    public void imprimeixGenere(){
        
    }
    @Override
    public String toString() {
        return "Llibreria{" + "titol=" + titol + ", isbn=" + isbn + ", autor=" + autor + ", editorial=" + editorial + ", exemplars=" + exemplars + ", preu=" + preu + ", genere="+ genere +'}';
    }

}
