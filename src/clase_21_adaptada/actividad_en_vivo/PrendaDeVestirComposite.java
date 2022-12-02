package clase_21_adaptada.actividad_en_vivo;

import clase_21_adaptada.actividad_en_vivo.productos.Producto;

import java.util.ArrayList;

public class PrendaDeVestirComposite extends Producto {

    // Atributos privados
    private ArrayList<Producto> materiales = new ArrayList();
    private double costoDeManoDeObra;

    // Métodos públicos
    public void agregarMaterial(Producto producto) {
        this.materiales.add(producto);
    }

    public void quitarMaterial(Producto producto) {
        this.materiales.remove(producto);
    }

    public String mostrarMateriales() {
        String listaDeMateriales = "";

        for (int i = 0; i < this.materiales.size(); i++) {
            listaDeMateriales += "\n  " + (i+1) + ". " + this.materiales.get(i).getNombre() + " " + this.materiales.get(i).getColor();
        }

        return listaDeMateriales;
    }

    public double calcularPrecio() {
        double precioTotal = 0.0;

        for (Producto producto : this.materiales) {
            precioTotal += producto.calcularPrecio();
        }

        return precioTotal + this.costoDeManoDeObra;
    }

    public double calcularPrecio(double porcentajeDeDescuento) {
        return this.calcularPrecio() - (this.calcularPrecio() / 100 * porcentajeDeDescuento);
    }

    // Getters y Setters
    public ArrayList<Producto> getMateriales() {
        return this.materiales;
    }

    public double getCostoDeManoDeObra() {
        return this.costoDeManoDeObra;
    }

    public void setCostoDeManoDeObra(double costoDeManoDeObra) {
        this.costoDeManoDeObra = costoDeManoDeObra;
    }
}
