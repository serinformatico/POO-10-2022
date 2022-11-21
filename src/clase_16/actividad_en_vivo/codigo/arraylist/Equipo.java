package clase_16.actividad_en_vivo.codigo.arraylist;

import clase_16.actividad_en_vivo.codigo.Jugador;

import java.util.ArrayList;

public class Equipo {
    
    // Atributos privados
    private String nombre;
    private ArrayList<Jugador> jugadores = new ArrayList<>();

    // Métodos públicos
    public void agregarJugador(Jugador jugador) {
        this.jugadores.add(jugador); // Agrega el elemento al final de la lista
    }

    public void agregarJugador(Jugador jugador, int posicion) {
        this.jugadores.add(posicion, jugador); // Agrega el elemento en la posición indicada
    }

    public void mostrarJugadoresTitulares() {
        for (Jugador jugador: jugadores) {
            System.out.println(jugador.toString());
        }
    }

    public int obtenerCantidadDeJugadoresLesionados() {
        int cantidadDeLesionados = 0;

        for (Jugador jugador: jugadores) {
            if (jugador.getEstaLesionado()) {
                cantidadDeLesionados++;
            }
        }

        return cantidadDeLesionados;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
