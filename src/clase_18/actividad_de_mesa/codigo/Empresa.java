package clase_18.actividad_de_mesa.codigo;

import java.util.ArrayList;

public class Empresa {

    // Atributos privados
    private ArrayList<Reserva> reservas = new ArrayList<>();
    private Recorrido recorrido         = new Recorrido();

    // Métodos públicos
    public double calcularRecaudacionTotal() {
        double recaudacionTotal = 0.00;

        for (Reserva reserva : this.reservas) {
            recaudacionTotal += reserva.calcularPrecioDeReserva();
        }

        return recaudacionTotal;
    }

    public int calcularCantidadDePasajerosQueRecorrieronUnaEstacion(Estacion estacion) throws EstacionInexistenteException {
        if (!this.recorrido.getEstaciones().contains(estacion)) {
            throw new EstacionInexistenteException("La estación '" + estacion.getNombre() + "' no existe");
        }

        int cantidadDePasajerosQueRecorrieronLaEstacion = 0;

        for (Reserva reserva : this.reservas) {
            if (reserva.getEstacionDePartida().equals(estacion) || reserva.getEstacionDeDestino().equals(estacion)) {
                cantidadDePasajerosQueRecorrieronLaEstacion += reserva.getCantidadDePasajeros();
            }
        }

        return cantidadDePasajerosQueRecorrieronLaEstacion;
    }

    // Getters
    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public Recorrido getRecorrido() {
        return recorrido;
    }

    // Setters
    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void setRecorrido(Recorrido recorrido) {
        this.recorrido = recorrido;
    }
}
