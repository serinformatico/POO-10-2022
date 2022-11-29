package clase_19.actividad_de_mesa.factory_method.productos;

public abstract class Producto {

    // Atributo privado
    private double peso;

    // Método abstracto público
    public abstract double calcularEspacio();

    @Override
    public String toString() {
        return "Producto = peso: " + this.peso + "kgs";
    }

    // Getters & Setters
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
