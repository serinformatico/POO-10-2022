package clase_18.actividad_en_vivo.codigo;

import java.util.ArrayList;
import java.util.Arrays;

public class Equipo {

    // Atributos privados
    private String nombre;
    private ArrayList<Jugador> plantel;

    // Constantes estáticas
    public static final String ARQUERO       = "ARQUERO";
    public static final String DEFENSOR      = "DEFENSOR";
    public static final String MEDIOCAMPISTA = "MEDIOCAMPISTA";
    public static final String DELANTERO     = "DELANTERO";

    public static ArrayList<String> posiciones = new ArrayList(Arrays.asList(Equipo.ARQUERO, Equipo.DEFENSOR, Equipo.MEDIOCAMPISTA, Equipo.DELANTERO));

    // Constructor
    public Equipo(String nombre) {
        this.nombre  = nombre;
        this.plantel = new ArrayList();;
    }

    public ArrayList<Jugador> obtenerJugadoresDeReserva() {
        ArrayList<Jugador> jugadoresDeReserva = new ArrayList();

        for (Jugador jugador : this.plantel) {
            if (jugador.getNumeroDeCamiseta() > 18) {
                jugadoresDeReserva.add(jugador);
            }
        }

        return jugadoresDeReserva;
    }

    public int obtenerCantidadDeJugadoresPorPosicion(String posicion) throws PosicionInexistenteException {
        int cantidadDeJugadores      = 0;

        if (!Equipo.posiciones.contains(posicion)) {
            throw new PosicionInexistenteException();
        }

        for (Jugador jugador: this.plantel){
            if (jugador.getPosicion().equals(posicion)){
                cantidadDeJugadores++;
            }
        }

        return cantidadDeJugadores;
    }

    public void agregarJugadorAlPlantel(Jugador jugador){
        if (this.plantel.size() < 23) {
            this.plantel.add(jugador);
        } else {
            System.out.println("Lista completa. No se puede agregar ningún jugador más");
        }
    }

    // Getters
    public String getNombre() {
        return this.nombre;
    }

    public ArrayList<Jugador> getPlantel() {
        return this.plantel;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPlantel(ArrayList<Jugador> plantel) {
        this.plantel = plantel;
    }
}
