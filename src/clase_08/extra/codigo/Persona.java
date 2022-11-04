package clase_08.extra.codigo;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

    // Atributos protegidos
    protected String nombre;
    protected String apellido;

    // Constructor
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Método público
    public int calcularEdad(LocalDate fechaDeNacimiento) {
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaDeNacimiento, fechaActual).getYears();
    }

    // Getters
    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
