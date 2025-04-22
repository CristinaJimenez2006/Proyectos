package Modularitat;

/**
 *
 * @author crist
 */
public class Departamento {
  private double salari;
  private double hores;
  private String departaemnto; 

    public Departamento() {
    }

    public Departamento(double salari, double hores, String departaemnto) {
        this.salari = salari;
        this.hores = hores;
        this.departaemnto = departaemnto;
    }

    public double getSalari() {
        return salari;
    }

    public void setSalari(double salari) {
        this.salari = salari;
    }

    public double getHores() {
        return hores;
    }

    public void setHores(double hores) {
        this.hores = hores;
    }

    public String getDepartaemnto() {
        return departaemnto;
    }

    public void setDepartaemnto(String departaemnto) {
        this.departaemnto = departaemnto;
    }

    @Override
    public String toString() {
        return "Departamento{" + "salari=" + salari + ", hores=" + hores + ", departaemnto=" + departaemnto + '}';
    }
  
}
