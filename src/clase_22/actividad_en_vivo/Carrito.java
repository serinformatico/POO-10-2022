package clase_20_es_22.actividad_en_vivo;

import clase_20_es_22.actividad_en_vivo.productos.Producto;

import java.util.ArrayList;

public class Carrito {

    // Atributo privado
    private ArrayList<Producto> productos = new ArrayList();

    // Métodos públicos
    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void quitarProducto(Producto producto) {
        this.productos.remove(producto);
    }

    public double calcularTotalDeLaCompra() {
        double totalDeLaCompra = 0.0;

        for (Producto producto : this.productos) {
            totalDeLaCompra += producto.calcularPrecio();
        }

        return totalDeLaCompra;
    }

    // Getter
    public ArrayList<Producto> getProductos() {
        return productos;
    }
}
