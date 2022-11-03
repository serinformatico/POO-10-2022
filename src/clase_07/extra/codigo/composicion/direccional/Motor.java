package clase_07.extra.codigo.composicion.direccional;

public class Motor {

    // Atributos privados
    private String denominacion;

    // Constructor 1
    public Motor() { }

    // Constructor 2
    public Motor(String denominacion) {
        this.denominacion = denominacion;
    }

    // Getters
    public String getDenominacion() {
        return this.denominacion;
    }

    // Setters
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
}
