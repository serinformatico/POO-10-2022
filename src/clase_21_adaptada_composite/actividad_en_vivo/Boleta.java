package clase_21_adaptada.actividad_en_vivo;

import clase_21_adaptada.actividad_en_vivo.productos.Producto;

import java.time.LocalDate;
import java.util.ArrayList;

public class Boleta {

    // Atributos privados
    private ArrayList<Producto> productos = new ArrayList();
    private boolean estaPagada            = false;
    private LocalDate fecha;

    // Métodos públicos
    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void quitarProducto(Producto producto) {
        this.productos.remove(producto);
    }

    public String mostrarProductos() {
        String listaDeProductos = "";

        for (int i = 0; i < this.productos.size(); i++) {
            listaDeProductos += "\n  " + (i+1) + ". " + this.productos.get(i).getNombre() + " " + this.productos.get(i).getColor();
        }

        return listaDeProductos;
    }

    public double calcularTotal() {
        double toalDeLaCompra = 0.0;

        for (Producto producto : this.productos) {
            toalDeLaCompra += producto.calcularPrecio();
        }

        return toalDeLaCompra;
    }

    public void finalizar() {
        if (this.productos.size() > 0) {
            this.fecha      = LocalDate.now();
            this.estaPagada = true;
        }
    }

    // Getters
    public ArrayList<Producto> getProductos() {
        return this.productos;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public boolean getEstaPagada() {
        return this.estaPagada;
    }
}
