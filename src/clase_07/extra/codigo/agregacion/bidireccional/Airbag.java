package clase_07.extra.codigo.agregacion.bidireccional;

public class Airbag {

    // Atributos privados
    private String denominacion;
    private Automovil automovil;

    // Constructor
    public Airbag(String denominacion) {
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
