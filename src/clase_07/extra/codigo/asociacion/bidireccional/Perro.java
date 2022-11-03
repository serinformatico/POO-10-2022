package clase_07.extra.codigo.asociacion.bidireccional;

public class Perro {

    // Atributos privados
    private String denominacion;
    private Persona amo;

    // Constructor
    public Perro(String denominacion) {
        this.denominacion = denominacion;
    }

    // Getters
    public String getDenominacion() {
        return this.denominacion;
    }

    public Persona getAmo() {
        return this.amo;
    }

    // Setters
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public void setAmo(Persona persona) {
        this.amo = persona;
    }
}
