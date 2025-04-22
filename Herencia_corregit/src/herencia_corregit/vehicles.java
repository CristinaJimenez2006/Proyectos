package herencia_corregit;

/**
 *
 * @author crist
 */
import java.util.Scanner;

public abstract class vehicles {

    // Atributs
    protected String matricula;
    protected String marca;
    protected String model;
    protected boolean activat = true;
    protected double preu;

    //Constructors
    public vehicles() {
    }

    public vehicles(String matricula, String marca, String model) {
        this.matricula = matricula;
        this.marca = marca;
        this.model = model;
    }

    public vehicles(String matricula, String marca, String model, double preu) {
        this.matricula = matricula;
        this.marca = marca;
        this.model = model;
        this.preu = preu;
    }

    // Settes i getters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isActivat() {
        return activat;
    }

    public void setActivat(boolean activat) {
        this.activat = activat;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public abstract void generaFacturaVenda(float bonificacio);

    public abstract void generaInformeEmissionsZero();

    public abstract void informaTipusPreu();
    
    public abstract void canviMoneda(); 

}

class electrics extends vehicles {

    // Atributs
    private float capacitatBateria;
    private float consumElectric;
    private int autonomia;
    private float potenciaCarrega;

    // Constructors
    public electrics() {
        super();
    }

    public electrics(String matricula, String marca, String model) {
        super(matricula, marca, model);
    }

    // Setters i getters
    public electrics(String matricula, String marca, String model, float capacitatBateria, float consumElectric) {
        super(matricula, marca, model);
        this.setCapacitatBateria(capacitatBateria);
        this.consumElectric = consumElectric;
    }

    public electrics(String matricula, String marca, String model, double preu, float capacitatBateria, float consumElectric) {
        super(matricula, marca, model, preu);
        this.setCapacitatBateria(capacitatBateria);
        this.consumElectric = consumElectric;
    }

    public float getCapacitatBateria() {
        return capacitatBateria;
    }

    public void setCapacitatBateria(float capacitatBateria) {
        Scanner in = new Scanner(System.in);

        while (capacitatBateria < 100) {
            System.out.println("La capacitat de bateria no té un valor correcte");
            System.out.println("Inro nova capacitat");
            capacitatBateria = in.nextFloat();
        }
        this.capacitatBateria = capacitatBateria;
    }

    public float getConsumElectric() {
        return consumElectric;
    }

    public void setConsumElectric(float consumElectric) {
        this.consumElectric = consumElectric;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        Scanner in = new Scanner(System.in);
        while (autonomia < 0) {
            System.out.println("La autonmia no pot ser negativa");
            System.out.println("Intro nova autonomia");
            autonomia = in.nextInt();
        }
        this.autonomia = autonomia;
    }

    public float getPotenciaCarrega() {
        return potenciaCarrega;
    }

    public void setPotenciaCarrega(float potenciaCarrega) {
        this.potenciaCarrega = potenciaCarrega;
    }

    public void canviUnitats() {
        this.potenciaCarrega = this.potenciaCarrega * 1000;
    }

    public void generaPC() {
        String cadena = "Permís de circulacio de vehicle \n";
        cadena = "Matrícula: " + this.matricula + "\n";
        cadena += "Marca: " + this.marca + "\n";
        cadena += "Consum elèctric: " + this.consumElectric + "\n";
        cadena += "Autonomia: " + this.autonomia + "\n";
        System.out.println(cadena);
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = "Matrícula: " + this.matricula + "\n";
        cadena += "Marca: " + this.marca + "\n";
        cadena += "Model: " + this.model + "\n";
        cadena += "Activat: " + this.activat + "\n";
        cadena += "Capacitat de bateria: " + this.capacitatBateria + "\n";
        cadena += "Consum elèctric: " + this.consumElectric + "\n";
        cadena += "Autonomia: " + this.autonomia + "\n";
        cadena += "Potencia de càrrega: " + this.potenciaCarrega + "\n";
        return cadena;
    }

    @Override
    public void generaFacturaVenda( float bonificacio) {
        System.out.println("Genera una factura de venda (Clase elèctrics)");
        this.preu = this.preu - bonificacio;
    }

    @Override
    public void generaInformeEmissionsZero() {

        System.out.println("Matrícula" + this.matricula);
        System.out.println("Capacitat Bateria: " + this.capacitatBateria);
    }

    @Override
    public void informaTipusPreu() {
        System.out.println("Aquest vehicle és elèctric i el seu preu és de" + this.preu + " €");
    }
    
    @Override
    public void canviMoneda() {
        System.out.println("Aquest vehicle és elèctric i el seu preu en € és de" + this.preu + " i en dòlars de "+(this.preu*1.08)+".");
    }
}

class combustio extends vehicles {
    // Atributs

    private int cilindrada;
    private String tipus;
    private float consum;
    private int potencia;

    // Constructors
    public combustio() {
        super();
    }

    public combustio(int cilindrada, String tipus, String matricula, String marca, String model, double preu) {
        super(matricula, marca, model, preu);
        this.cilindrada = cilindrada;
        this.tipus = tipus;
    }

    public combustio(String matricula, String marca, String model) {
        super(matricula, marca, model);
    }

    // Setters i getters
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        Scanner in = new Scanner(System.in);

        while (!(tipus.toLowerCase().equals("benzina") || tipus.toLowerCase().equals("diesel"))) {
            System.out.println("Tipus de motor no vàlid");
            System.out.println("Torna'l a introduir");
            tipus = in.nextLine();
        }
        this.tipus = tipus.toLowerCase();
    }

    public float getConsum() {
        return consum;
    }

    public void setConsum(float consum) {
        this.consum = consum;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void generaPC() {
        String cadena = "Permís de circulacio de vehicle \n";
        cadena = "Matrícula: " + this.matricula + "\n";
        cadena += "Marca: " + this.marca + "\n";
        cadena += "Cilindrada: " + this.cilindrada + "\n";
        cadena += "Tipus motor: " + this.tipus + "\n";
        System.out.println(cadena);
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = "Matrícula: " + this.matricula + "\n";
        cadena += "Marca: " + this.marca + "\n";
        cadena += "Model: " + this.model + "\n";
        cadena += "Activat: " + this.activat + "\n";
        cadena += "Cilindrada: " + this.cilindrada + "\n";
        cadena += "Tipus motor: " + this.tipus + "\n";
        cadena += "Consum: " + this.consum + "\n";
        cadena += "potencia: " + this.potencia + "\n";
        return cadena;
    }

    @Override
    public void generaFacturaVenda(float bonificacio) {
        System.out.println("Genera una factura de venda (Clase combustió)");
    }

    @Override
    public void generaInformeEmissionsZero() {
        System.out.println("No és generea l'informe, perquè és un vehicle de combustió.");;
    }

    @Override
    public void informaTipusPreu() {
        System.out.println("Aquest vehicle és de combustió i el seu preu és de" + this.preu + " €");
    }
    @Override
    public void canviMoneda() {
        System.out.println("Aquest vehicle és de combustió i el seu preu en € és de" + this.preu + " i en iens de "+(this.preu*161.38)+".");
    }

}
