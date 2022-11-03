package clase_07.extra.codigo.asociacion.direccional;

public class Persona {

    // Atributos privados
    private String nombre;
    private String apellido;
    private Perro[] perros; // Atributo necesario para la relación de asociación

    // Constructor
    public Persona(String nombre, String apellido) {
        this.nombre   = nombre;
        this.apellido = apellido;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Perro[] getPerros() {
        return perros;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Setter necesario para la relación de asociación
    public void setPerros(Perro[] perros) {
        this.perros = perros;
    }
}