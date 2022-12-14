package clase_20_es_22.actividad_en_vivo;

import clase_20_es_22.actividad_en_vivo.productos.Producto;

import java.util.ArrayList;

public class ComboComposite extends Producto {

    // Atributo privado
    private ArrayList<Producto> productos = new ArrayList();

    // Atributo de clase (estático)
    public static double porcentajeDeDescuento = 5.0;

    // Constructor
    public ComboComposite(String nombre) {
        super(nombre, 0.0);
    }


    // Métodos públicos
    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void quitarProducto(Producto producto) {
        this.productos.remove(producto);
    }


    // Método público que cumple con la declaración abstracta en la superclase
    public double calcularPrecio() {
        double precioTotal = 0.0;

        for (Producto producto : this.productos) {
            precioTotal += producto.calcularPrecio();
        }

        return precioTotal;
    }

    // Getter
    public ArrayList<Producto> getProductos() {
        return productos;
    }
}
