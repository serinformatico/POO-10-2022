package clase_20_es_22.actividad_en_vivo.productos;

public class PapaFrita extends Producto {

    // Constructor
    public PapaFrita(String nombre, double costo) {
        super(nombre, costo);
    }

    // Método público que cumple con la declaración abstracta en la superclase
    public double calcularPrecio() {
        double precio = this.getCosto() + (this.getCosto() / 100 * Producto.porcentajeDeGanancia);
        return precio;
    }
}
