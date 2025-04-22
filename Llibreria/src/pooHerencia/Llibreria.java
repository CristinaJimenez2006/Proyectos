package pooHerencia;

/**
 *
 * @author crist
 */
public class Llibreria {

    protected String titol;
    protected String isbn;
    protected String autor;
    protected String editorial;
    protected int exemplars;
    protected double preu;

    public Llibreria() {
    }

    public Llibreria(String titol, String isbn, String autor, String editorial, int exemplars, double preu) {
        this.titol = titol;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
        this.exemplars = exemplars;
        this.preu = preu;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getExemplars() {
        return exemplars;
    }

    public void setExemplars(int exemplars) {
        this.exemplars = exemplars;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    @Override
    public String toString() {
        return "Llibreria{" + "titol=" + titol + ", isbn=" + isbn + ", autor=" + autor + ", editorial=" + editorial + ", exemplars=" + exemplars + ", preu=" + preu + '}';
    }

    public void imprimeixTotesDades() {

    }

    public void generaFitxa() {
        System.out.printf("Títol: " + this.titol + "\nAutor: " + this.autor + "\nIsbn: " + this.isbn);
    }

    public void modificaPreuIsbn(String percentatge) {

        if (((percentatge.charAt(0) == '+') || (percentatge.charAt(0) == '-')) && ((percentatge.charAt(1) == '0')||(percentatge.charAt(1) == '1')||
                (percentatge.charAt(1) == '2')||(percentatge.charAt(1) == '3') || (percentatge.charAt(1) == '4')
                ||(percentatge.charAt(1) == '5')||(percentatge.charAt(1) == '6')||(percentatge.charAt(1) == '7')||(percentatge.charAt(1) == '8')
                ||(percentatge.charAt(1) == '9'))) {
            double percentatgeNum = Double.parseDouble(percentatge);
               this.preu=this.preu+(this.preu*(percentatgeNum/100)); 
           
        }

    }
}
