package clase_05.setters_getters_statics.codigo;

public class CochePro {

    // Constante
    public final double IVA = 21.0;


    // Atributo estático
    public static double porcentajeDeDescuento = 20.0;


    // Atributos o propiedades
    private String marca;
    public String modelo;
    public String color;
    public int anio;
    private double costo;
    private double precio;


    // Constructor
    public CochePro(String marca, String modelo, String color, int anio) {
        this.marca  = marca;
        this.modelo = modelo;
        this.color  = color;
        this.anio   = anio;
    }


    // Métodos getters
    public String getMarca() {
        return marca;
    }

    public double getCosto() {
        return costo;
    }

    public double getPrecio() {
        return precio;
    }


    // Método setter
    public void setMarca(String marca) {
        this.marca = marca;
    }


    // Método privado
    private Double calcularMargen(double costo, double margenPorcentual) {
        return ((costo / 100) * margenPorcentual);
    }


    // Métodos públicos
    public double calcularPrecio(double costo, double margenPorcentual) {
        return this.precio = costo + this.calcularMargen(costo, margenPorcentual);
    }

    public void encender() {
        // Lógica
    }

    public void avanzar() {
        // Lógica
    }

    public void frenar() {
        // Lógica
    }
}


