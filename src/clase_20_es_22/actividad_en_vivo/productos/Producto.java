package clase_20_es_22.actividad_en_vivo.productos;

public abstract class Producto {

    // Atributos privados
    private String nombre;
    private double costo;

    // Atributo de clase (estático)
    public static double porcentajeDeGanancia = 30.0;

    // Constructor 1 (necesario para no complicar el diseño)
    public Producto() { }

    // Constructor 2
    public Producto(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    // Método público abstracto
    public abstract double calcularPrecio();

    // Getter & Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
