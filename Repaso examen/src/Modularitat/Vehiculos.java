package Modularitat;

/**
 *
 * @author crist
 */
public class Vehiculos {
    private String marca;
    private String modelo; 
    private int anyoFabricacion;
    private String color; 
    private double cilindrada; 
    private double precio; 

    public Vehiculos() {
    }

    public Vehiculos(String marca, String modelo, int anyoFabricacion, String color, double cilindrada, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anyoFabricacion = anyoFabricacion;
        this.cilindrada = cilindrada;
    }

    public Vehiculos(String modelo, int anyoFabricacion, String color, double cilindrada, double precio) {
        this.modelo = modelo;
        this.anyoFabricacion = anyoFabricacion;
        this.color = color;
        this.cilindrada = cilindrada;
        this.precio = precio;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }

    public void setAnyoFabricacion(int anyoFabricacion) {
        this.anyoFabricacion = anyoFabricacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Para poder imprimir todo de una (solo pongo lo que quiero imprimir). 
    @Override
    public String toString() {
        return "Vehiculos{" + "marca=" + marca + ", modelo=" + modelo + ", anyoFabricacion=" + anyoFabricacion + ", color=" + color + ", cilindrada=" + cilindrada + ", precio=" + precio + '}';
    }
//No se pone static pq crido desde el propi objecte, es un programa que afecta el objecte en Vehiculos_2 --> coche2.emplenaDesdeDintre
  public void emplenaDesdeDintre (Scanner in){
      String marca =in.nextLine(); 
      //Es inecessario, ya que get y set solo se utiiliza para llamarlo de otro fichero no en el mismo.Nosotros estamos dentro. No da error, funciona pero no es correcto.  
      //Dentro del propio objeto no se hace set ni get. 
      this.setMarca(marca);
      //Solo hay que poner esto
      this.marca=marca; 
  }
}
