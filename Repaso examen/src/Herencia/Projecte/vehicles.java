package Herencia.Projecte;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class vehicles { 
    protected String matricula;
    protected String model;
    protected String color;
    protected boolean activat=true; 

    public vehicles() {
    }

    public vehicles(String matricula, String model, String color) {
        this.matricula = matricula;
        this.model = model;
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isActivat() {
        return activat;
    }

    public void setActivat(boolean activat) {
        this.activat = activat;
    }

    @Override
    public String toString() {
        return "vehicles{" + "matricula=" + matricula + ", model=" + model + ", color=" + color + ", activat=" + activat + '}';
    }
}
class electrics extends vehicles{
    private double capacitatBateria; 
    private double consumElectric; 
    private double autonomia; 
    private double potenciaCarrega; 

    public electrics() {
        super(); 
    }

    public electrics(double capacitatBateria, double consumElectric, double autonomia, double potenciaCarrega, String matricula, String model, String color) {
        super(matricula, model, color);
        this.setCapacitatBateria (capacitatBateria);
        //S'ha d'obligar a que opassi pel set per poder filtrar bé la capacitat de bateria. En el constructor, com la condició es definidia en el set, el col·locaria sin complir amb el requisit.  
        this.consumElectric = consumElectric;
        this.setAutonomia (autonomia);
        this.potenciaCarrega = potenciaCarrega;
    }

    public double getCapacitatBateria() {
        return capacitatBateria;
    }

    public void setCapacitatBateria(double capacitatBateria) {
       Scanner in = new Scanner(System.in);
        while (capacitatBateria<100){
            System.out.println("La capacitat de bateria no té un valor correcte.");
            System.out.println("Introdueix una nova capacitat");
            capacitatBateria=in.nextDouble(); 
        }
         this.capacitatBateria = capacitatBateria;
    }

    public double getConsumElectric() {
        return consumElectric;
    }

    public void setConsumElectric(double consumElectric) {
        this.consumElectric = consumElectric;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        Scanner in = new Scanner(System.in);
        while (autonomia>=0){
        System.out.println("L'autonomia no té un valor correcte.");
        System.out.println("Introdueix una nou valor de autonomia");
        autonomia=in.nextDouble(); 
        }
        this.autonomia = autonomia;
    }

    public double getPotenciaCarrega() {
        return potenciaCarrega;
    }

    public void setPotenciaCarrega(double potenciaCarrega) {
        this.potenciaCarrega = potenciaCarrega;
    }

    @Override
    public String toString() {
        return "electrics{" + "capacitatBateria=" + capacitatBateria + ", consumElectric=" + consumElectric + ", autonomia=" + autonomia + ", potenciaCarrega=" + potenciaCarrega + '}';
    }
    public void canviarUnitat(String lletra){
        if(lletra.toLowerCase().equals("w")){
            this.potenciaCarrega=this.potenciaCarrega*1000; 
        }else{
            this.potenciaCarrega=this.potenciaCarrega*1000000; 
    }
    
}
}
class combustio extends vehicles{
    private int cilindrada; 
    private String tipusMotor; 
    private double consumCombustible;
    private double potencia; 

    public combustio() {
        super(); 
    }

    public combustio(int cilindrada, String tipusMotor, double consumCombustible, double potencia, String matricula, String model, String color) {
        super(matricula, model, color);
        this.cilindrada = cilindrada;
        this.setTipusMotor(tipusMotor);
        this.consumCombustible = consumCombustible;
        this.potencia = potencia;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipusMotor() {
        return tipusMotor;
    }

    public void setTipusMotor(String tipusMotor) {
        Scanner str = new Scanner(System.in);
        while(!((tipusMotor.toLowerCase().equals("benzina"))||(tipusMotor.toLowerCase().equals("diesel")))){
        System.out.println("El tipus de motor no és correcte.");
        System.out.println("Introdueix una nou tipus de motor");
        tipusMotor=str.nextLine().toLowerCase(); 
        }
        this.tipusMotor = tipusMotor;
    }

    public double getConsumCombustible() {
        return consumCombustible;
    }

    public void setConsumCombustible(double consumCombustible) {
        this.consumCombustible = consumCombustible;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "combustio{" + "cilindrada=" + cilindrada + ", tipusMotor=" + tipusMotor + ", consumCombustible=" + consumCombustible + ", potencia=" + potencia + '}';
    }
    
}
class incidencies {
    private String matricula;
    private String problema;
    private double hores;
    private boolean estat=false;
    private int id; 

    public incidencies() {
    }

    public incidencies(String matricula, String problema) {
        this.matricula = matricula;
        this.problema = problema;
    }

    public incidencies(String matricula, String problema, int id) {
        this.matricula = matricula;
        this.problema = problema;
        this.id = id;
    }
    
    public incidencies(String matricula, String problema, double hores, int id) {
        this.matricula = matricula;
        this.problema = problema;
        this.hores = hores;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public double getHores() {
        return hores;
    }

    public void setHores(double hores) {
        this.hores = hores;
    }

    public boolean isEstat() {
        return estat;
    }

    public void setEstat(boolean estat) {
        this.estat = estat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "incidencias{" + "matricula=" + matricula + ", problema=" + problema + ", hores=" + hores + ", estat=" + estat + ", id=" + id +'}';
    }
    
}

