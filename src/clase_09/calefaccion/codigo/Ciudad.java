package clase_09.calefaccion.codigo;

public class Ciudad {

    // Atributos protegidos
    private String nombre;
    private Vivienda[] viviendas;

    // Constructor
    public Ciudad(String nombre, Vivienda[] viviendas) {
        this.nombre    = nombre;
        this.viviendas = viviendas;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public Vivienda[] getViviendas() {
        return viviendas;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setViviendas(Vivienda[] viviendas) {
        this.viviendas = viviendas;
    }
}
