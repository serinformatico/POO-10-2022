package clase_19.actividad_en_vivo.factory_method;

import clase_19.actividad_en_vivo.factory_method.empleados.Empleado;

import java.util.ArrayList;

public class Empresa {

    // Atributos privados
    private String nombre;
    private ArrayList<Empleado> empleados = new ArrayList(); // Atributo inicializado correspondiente a la relación de composición.

    // Constructor
    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    // Método público
    public double calcularTotalPagadoDeSalarios() {
        double totalPagado = 0.0;

        for (Empleado empleado : this.empleados) {
            totalPagado += empleado.calcularSalario();
        }

        return totalPagado;
    }

    // Getters & Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return this.empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
}
