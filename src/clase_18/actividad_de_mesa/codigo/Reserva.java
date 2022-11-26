package clase_18.actividad_de_mesa.codigo;

public class Reserva {

    // Atributos privados
    private String codigo;
    private Estacion estacionDePartida;
    private Estacion estacionDeDestino;
    private int cantidadDePasajeros;

    // Constante estática pública
    private static final double precioDelBoleto = 50.00;


    // Constructor
    public Reserva(String codigo, Estacion estacionDePartida, Estacion estacionDeDestino, int cantidadDePasajeros) {
        this.codigo              = codigo;
        this.estacionDePartida   = estacionDePartida;
        this.estacionDeDestino   = estacionDeDestino;
        this.cantidadDePasajeros = cantidadDePasajeros;
    }

    // Métodos públicos
    public double calcularPrecioDeReserva() {
        double precioDeReserva = Reserva.precioDelBoleto * this.cantidadDePasajeros;

        if ((this.estacionDePartida.getNombre().equals("Buenos Aires") && this.estacionDeDestino.getNombre().equals("Bragado"))
            || (this.estacionDePartida.getNombre().equals("Bragado") && this.estacionDeDestino.getNombre().equals("Buenos Aires"))) {
            precioDeReserva -= precioDeReserva * 0.20;
        }

        return precioDeReserva;
    }

    // Método sobrescrito
    @Override
    public String toString() {
        return "Reserva = código: " + codigo + ", estación de partida: " + estacionDePartida.getNombre() + ", estación de destino: " + estacionDeDestino.getNombre() + ", cantidad de pasajeros: " + cantidadDePasajeros;
    }

    // Getters
    public String getCodigo() {
        return this.codigo;
    }

    public Estacion getEstacionDePartida() {
        return this.estacionDePartida;
    }

    public Estacion getEstacionDeDestino() {
        return this.estacionDeDestino;
    }

    public int getCantidadDePasajeros() {
        return this.cantidadDePasajeros;
    }

    // Setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setEstacionDePartida(Estacion estacionDePartida) {
        this.estacionDePartida = estacionDePartida;
    }

    public void setEstacionDeDestino(Estacion estacionDeDestino) {
        this.estacionDeDestino = estacionDeDestino;
    }

    public void setCantidadDePasajeros(int cantidadDePasajeros) {
        this.cantidadDePasajeros = cantidadDePasajeros;
    }
}
