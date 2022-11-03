package clase_07.extra.codigo.dependencia.bidireccional;

public class Socio {

    // Atributos privados
    private String marca;
    private String modelo;

    // Constructor
    public Socio(String marca, String modelo) {
        this.marca  = marca;
        this.modelo = modelo;
    }

    // Método necesario para la relación de dependencia
    public void leerLibro(Libro[] libros) {
        // Lógica;
        System.out.println("Mi primer libro para leer " + libros[0].getTitulo());
    }

    // Getters
    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

     // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
