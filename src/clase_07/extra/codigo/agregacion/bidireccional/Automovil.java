package clase_07.extra.codigo.agregacion.bidireccional;

public class Automovil {

    // Atributos privados
    private String marca;
    private String modelo;
    private Airbag[] airbags; // Atributo necesario para la relación de agregación

    // Constructor

    public Automovil(String marca, String modelo, Airbag[] airbags) {
        this.marca   = marca;
        this.modelo  = modelo;
        this.airbags = airbags; // Asignación necesaria para la relación de agregación
    }

    // Getters
    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public Airbag[] getAirbags() {
        return this.airbags;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
