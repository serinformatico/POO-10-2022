package clase_18.actividad_en_vivo.codigo;

public class Jugador {

    // Atributos privados
    private String posicion;
    private String apellido;
    private int numeroDeCamiseta;

    // Constructor
    public Jugador(String posicion, String apellido, int numeroDeCamiseta) {
        this.posicion         = posicion;
        this.apellido         = apellido;
        this.numeroDeCamiseta = numeroDeCamiseta;
    }

    // Getters
    public String getPosicion() {
        return this.posicion;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getNumeroDeCamiseta() {
        return this.numeroDeCamiseta;
    }

    // Setters
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumeroDeCamiseta(int numeroDeCamiseta) {
        this.numeroDeCamiseta = numeroDeCamiseta;
    }

    @Override
    public String toString() {
        return "Jugador de posición: " + this.posicion + ", apellido: " + this.apellido + ", número de camiseta: " + this.numeroDeCamiseta;
    }
}
