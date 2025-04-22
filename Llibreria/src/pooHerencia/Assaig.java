package pooHerencia;

/**
 *
 * @author crist
 */
public class Assaig extends Llibreria {
    private int nombreAssajosAutor; 

    public Assaig() {
        super(); 
    }

    public Assaig(int nombreAssajosAutor, String titol, String isbn, String autor, String editorial, int exemplars, double preu) {
        super(titol, isbn, autor, editorial, exemplars, preu);
        this.nombreAssajosAutor = nombreAssajosAutor;
    }

    public int getNombreAssajosAutor() {
        return nombreAssajosAutor;
    }

    public void setNombreAssajosAutor(int nombreAssajosAutor) {
        this.nombreAssajosAutor = nombreAssajosAutor;
    }

   public void ImpNombreAssajos(){
       
   }
   
    @Override
    public String toString() {
        return "Llibreria{" + "titol=" + titol + ", isbn=" + isbn + ", autor=" + autor + ", editorial=" + editorial + ", exemplars=" + exemplars + ", preu=" + preu + ", nombre d'assajos de l'autor="+ nombreAssajosAutor+'}';
    }
    
}
