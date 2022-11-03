package clase_08.extra.codigo;

import java.util.Date;

public class Persona {

    // Atributos protegidos
    protected String nombre;
    protected String apellido;

    // Constructor
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    // Método público
    public int calcularEdad(Date fechaDeNacimiento) {
        // Lógica
        return 0;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
