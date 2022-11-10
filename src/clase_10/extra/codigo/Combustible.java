package clase_10.extra.codigo;

public class Combustible {

    // Atributos privados
    private String nombre;
    private double costo;


    // Constructor
    public Combustible(String nombre, double costo) {
        this.nombre = nombre;
        this.costo  = costo;
    }


    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }


    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
