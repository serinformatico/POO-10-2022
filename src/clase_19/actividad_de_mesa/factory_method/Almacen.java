package clase_19.actividad_de_mesa.factory_method;

import clase_19.actividad_de_mesa.factory_method.productos.Producto;

import java.util.ArrayList;

public class Almacen {

    // Atributo privado
    private ArrayList<Producto> productos = new ArrayList(); // Atributo inicializado correspondiente a la relación de agregación.


    // Método público
    public double calcularEspacioNecesario() {
        double espaciototal = 0.0;

        for (Producto producto : this.productos) {
            espaciototal += producto.calcularEspacio();
        }

        return espaciototal;
    }

    // Getters & Setters
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
}
