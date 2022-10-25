package clase_04.juguemos_a_adivinar;

public class Jugador {

    // Atributos o propiedades públicas
    private String nombre;
    public String apellido;
    public String posicion;
    public int numero;

    // Constructor 1
    public Jugador(String nombre) {
        this.nombre   = nombre;
        this.apellido = "";
        this.posicion = "";
        this.numero   = 0;
    }

    // Constructor 2
    public Jugador(String nombre, String apellido, String posicion, int numero) {
        this.nombre   = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.numero   = numero;
    }

    // Métodos públicos y sobrecarga de metodos
    public void patear() { // Firma: patear()
        // Lógica
    }

    public void patear(boolean tipo) { // Firma: patearBoolean()
        // Lógica
    }

    public void patear(boolean tipo, String x) { // Firma: patearBooleanString()
        // Lógica
    }

    public void correr() {
        // Lógica
    }

    public void saltar() {
        // Lógica
    }
}
