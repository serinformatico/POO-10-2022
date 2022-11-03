package clase_07.extra.codigo.composicion.bidireccional;

public class Motor {

    // Atributos privados
    private String denominacion;
    private Automovil automovil;

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

    public Automovil getAutomovil() {
        return this.automovil;
    }

    // Setters
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }
}
