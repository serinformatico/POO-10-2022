package clase_07.extra.codigo.composicion.direccional;

public class Automovil {

    // Atributos privados
    private String marca;
    private String modelo;
    private Motor motor; // Atributo necesario para la relación de composición

    // Constructor

    public Automovil(String marca, String modelo) {
        this.marca  = marca;
        this.modelo = modelo;
        this.motor  = new Motor(); // Instancia necesaria para la relación de composición
    }

    // Getters
    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public Motor getMotor() {
        return motor;
    }

     // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
