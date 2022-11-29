package clase_20_es_22.actividad_en_vivo;

import clase_20_es_22.actividad_en_vivo.productos.Producto;

import java.util.ArrayList;

public class ComboComposite extends Producto {

    // Atributo privado
    private ArrayList<Producto> productos = new ArrayList();

    // Atributo de clase (estático)
    public static double porcentajeDeDescuento = 5.0;

    // Métodos públicos
    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void quitarProducto(Producto producto) {
        this.productos.remove(producto);
    }


    // Método público que cumple con la declaración abstracta en la superclase
    public double calcularPrecio() {
        double preciototal = 0.0;

        for (Producto producto : this.productos) {
            preciototal += producto.calcularPrecio();
        }

        return preciototal;
    }

    // Getter & Setter
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> graficos) {
        this.productos = graficos;
    }
}
