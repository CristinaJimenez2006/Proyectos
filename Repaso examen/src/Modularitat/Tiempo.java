package Modularitat;

/**
 *
 * @author crist
 */
public clas Tiempo {
    private String mes; 
    private double lluvia; 
    private double temperatura; 

    public Tiempo() {
    }

    public Tiempo(String mes, double lluvia, double temperatura) {
        this.mes = mes;
        this.lluvia = lluvia;
        this.temperatura = temperatura;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public double getLluvia() {
        return lluvia;
    }

    public void setLluvia(double lluvia) {
        this.lluvia = lluvia;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Tiempo{" + "mes=" + mes + ", lluvia=" + lluvia + ", temperatura=" + temperatura + '}';
    }  
    
    
}

