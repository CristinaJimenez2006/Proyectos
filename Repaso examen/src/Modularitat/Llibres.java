package Modularitat;

/**
 *
 * @author crist
 */
public class Llibres {

    private String titol;
    private String autor;
    private String ISBN;
    private float preu;
    private int quantitat;

    public Llibres() {
    }

    public Llibres(String titol, String autor, String ISBN, float preu, int quantitat) {
        this.titol = titol;
        this.autor = autor;
        this.ISBN = ISBN;
        this.preu = preu;
        this.quantitat = quantitat;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public float getPreu() {
        return preu;
    }

    public void setPreu(float preu) {
        this.preu = preu;
    }

    public int getQuantitat() {
        return quantitat;
    }

    public void setQuantitat(int quantitat) {
        this.quantitat = quantitat;
    }

    public void preuIva2(Llibres[] recollirllibres, String ISBN) {
        //ACABAR
    }

    public float afegeixIVA() {
        return (float) (this.preu * 0.21);
    }

    public float indexpujada( float percentatge) {
        if (this.preu >= 20) {
                        System.out.println("Preu amb el index de pujada del " + percentatge + "%:" + (this.preu* (percentatge / 100)));
                    } else {
                        percentatge = percentatge / 2;
                        System.out.println("Preu amb el index de pujada del " + percentatge + "%:" + (this.preu * (percentatge / 100)));

                    }
                    this.preu=preu; 
    }

    @Override
    public String toString() {
        return "Llibres{" + "titol=" + titol + ", autor=" + autor + ", ISBN=" + ISBN + ", preu=" + preu + ", quantitat=" + quantitat + '}';
    }

}
