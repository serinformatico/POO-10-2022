package clase_16.actividad_en_vivo.codigo.linkedlist;

import clase_16.actividad_en_vivo.codigo.Jugador;
import java.util.LinkedList;

public class Equipo {
    
    // Atributos privados
    private String nombre;
    private LinkedList<Jugador> jugadores = new LinkedList<>();

    // Métodos públicos
    public void agregarJugador(Jugador jugador) {
        this.jugadores.add(jugador); // Agrega el elemento al final de la lista
    }

    public void agregarJugador(Jugador jugador, int posicion) {
        this.jugadores.add(posicion, jugador); // Agrega el elemento en la posición indicada
    }

    public void mostrarJugadoresTitulares() {
        for (Jugador jugador: jugadores) {
            if (jugador.getEsTitular()) {
                System.out.println(jugador.toString());
            }
        }
    }

    public int obtenerCantidadDeJugadoresLesionados() {
        int cantidadDeLesionados = 0;

        for (Jugador jugador: jugadores) {
            if (jugador.getEstaLesionado() && jugador.getEsTitular()) {
                cantidadDeLesionados++;
            }
        }

        return cantidadDeLesionados;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public LinkedList<Jugador> getJugadores() {
        return jugadores;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setJugadores(LinkedList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
