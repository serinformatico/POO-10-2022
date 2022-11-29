package clase_19.actividad_en_vivo.factory_method.empleados;

public abstract class Empleado {

    // Atributos privados
    private String nombre;
    private String apellido;
    private int legajo;

    // Método abstracto público
    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Empleado = nombre: " + this.nombre +
                ", apellido: " + this.apellido +
                ", legajo: " + this.legajo +
                ", sueldo: USD" + this.calcularSalario();
    }

    // Getters & Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return this.legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
}
