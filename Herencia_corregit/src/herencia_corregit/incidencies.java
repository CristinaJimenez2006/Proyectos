package herencia_corregit;

/**
 *
 * @author crist
 */
import java.util.Scanner;

public class incidencies {

    // Atributs
    private String matricula;
    // per defecte la incidència la generem oberta
    private boolean oberta = true;
    private float hores = 0;
    private String avaria;

    public incidencies(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isOberta() {
        return oberta;
    }

    public void setOberta(boolean oberta) {
        Scanner in = new Scanner(System.in);
        this.oberta = oberta;
        // Al tancar-la hem de comprovar que les hores estan introduides
        if (!oberta) {
            while (this.hores == 0) {
                System.out.println("Si vols tancar has de posar les hores ");
                System.out.println("Indica les hores");
                this.hores = in.nextFloat();
            }
        }
    }

    public float getHores() {
        return hores;
    }

    public void setHores(float hores) {

        System.out.println("No pots posar les hores. Les hauràs de posar en tancar la incidència");

    }

    public String getAvaria() {
        return avaria;
    }

    public void setAvaria(String avaria) {
        this.avaria = avaria;
    }

}