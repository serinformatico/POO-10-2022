package clase_18.actividad_de_mesa.codigo;

import java.util.Comparator;

public class Estacion implements Comparable<Estacion>, Comparator<Estacion> {

    // Atributos privados
    private String nombre;
    private int numeroDeLaEstacion;

    // Constructor
    public Estacion(String nombre, int numeroDeLaEstacion) {
        this.nombre             = nombre;
        this.numeroDeLaEstacion = numeroDeLaEstacion;
    }

    // Métodos sobrescritos de Java
    @Override
    public String toString() {
        return "Estación = nombre:" + nombre + ", numero de la estación: " + numeroDeLaEstacion;
    }

    @Override
    public int compareTo(Estacion estacion) {
        if (this.getNumeroDeLaEstacion() > estacion.getNumeroDeLaEstacion()) {
            return 1;
        } else if (this.getNumeroDeLaEstacion() < estacion.getNumeroDeLaEstacion()) {
            return -1;
        }

        return 0;
    }

    @Override
    public int compare(Estacion x, Estacion y) {
        return x.compareTo(y);
    }

    // Getters
    public String getNombre() {
        return this.nombre;
    }

    public int getNumeroDeLaEstacion() {
        return this.numeroDeLaEstacion;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroDeLaEstacion(int numeroDeLaEstacion) {
        this.numeroDeLaEstacion = numeroDeLaEstacion;
    }
}
