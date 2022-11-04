package clase_08.clinica.codigo;

public class Medicamento {

    // Atributos privados
    private String nombre;
    private double costo;

    // Constructor
    public Medicamento(String nombre, double costo) {
        this.nombre = nombre;
        this.costo  = costo;
    }

    // Getters
    public String getNombre() {
        return this.nombre;
    }

    public double getCosto() {
        return this.costo;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
