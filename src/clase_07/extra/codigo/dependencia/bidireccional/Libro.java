package clase_07.extra.codigo.dependencia.bidireccional;

public class Libro {

    // Atributos privados
    private String titulo;

    // Constructor
    public Libro(String titulo) {
        this.titulo = titulo;
    }

    // Método necesario para la relación inversa de dependencia
    public void obtenerLector(Socio lector) {
        // Lógica;
    }

    // Getters
    public String getTitulo() {
        return this.titulo;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
