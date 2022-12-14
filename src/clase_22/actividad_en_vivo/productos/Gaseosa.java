package clase_20_es_22.actividad_en_vivo.productos;

public class Gaseosa extends Producto {

    // Constructor
    public Gaseosa(String nombre, double costo) {
        super(nombre, costo);
    }

    // Método público que cumple con la declaración abstracta en la superclase
    public double calcularPrecio() {
        double precio = this.getCosto() + (this.getCosto() / 100 * Producto.porcentajeDeGanancia);
        return precio;
    }
}
