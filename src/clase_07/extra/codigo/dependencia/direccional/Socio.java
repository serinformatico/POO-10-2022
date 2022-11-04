package clase_07.extra.codigo.dependencia.direccional;

public class Socio {

    // Atributos privados
    private String nombre;
    private String apellido;

    // Constructor
    public Socio(String nombre, String apellido) {
        this.nombre   = nombre;
        this.apellido = apellido;
    }

    // Método necesario para la relación de dependencia
    public void leerLibro(Libro[] libros) {
        // Lógica;
        System.out.println(this.nombre + ", mi primer libro para leer es " + libros[0].getTitulo());
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
