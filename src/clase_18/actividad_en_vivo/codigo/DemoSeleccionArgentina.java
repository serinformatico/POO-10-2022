package clase_18.actividad_en_vivo.codigo;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoSeleccionArgentina {
    public static void main(String[] args) {

        Equipo seleccionArgentina = new Equipo("Argentina");

        Jugador alberto = new Jugador(Equipo.ARQUERO, "Alberto", 1);
        Jugador javier  = new Jugador(Equipo.DEFENSOR, "Javier", 2);
        Jugador jose    = new Jugador(Equipo.MEDIOCAMPISTA, "Jose", 5);
        Jugador miguel  = new Jugador(Equipo.DELANTERO, "Miguel", 9);
        Jugador mario   = new Jugador(Equipo.DELANTERO, "Mario", 10);
        Jugador pablo   = new Jugador(Equipo.ARQUERO, "Pablo", 12);
        Jugador juan    = new Jugador(Equipo.DEFENSOR, "Juan", 18);
        Jugador luis    = new Jugador(Equipo.MEDIOCAMPISTA, "Luis", 20);
        Jugador alex    = new Jugador(Equipo.DELANTERO, "Alex", 22);

        ArrayList<Jugador> plantel = new ArrayList(Arrays.asList(alberto, javier, jose, miguel, mario, pablo, juan, luis));
        seleccionArgentina.setPlantel(plantel);
        seleccionArgentina.agregarJugadorAlPlantel(alex);

        try {
            System.out.println("\nCantidad de arqueros: " + seleccionArgentina.obtenerCantidadDeJugadoresPorPosicion(Equipo.ARQUERO));
            System.out.println("\nCantidad de defensores: " + seleccionArgentina.obtenerCantidadDeJugadoresPorPosicion("defensa"));
        } catch(PosicionInexistenteException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("\nJugadores de reserva: ");

            System.out.println("\nOpción A: ForEach general");
            for (Jugador jugador : seleccionArgentina.obtenerJugadoresDeReserva()) {
                System.out.println(jugador.toString());
            }

            System.out.println("\nOpción B: ForEach propio de la clase ArrayList (lambda function)");
            seleccionArgentina.obtenerJugadoresDeReserva().forEach( (jugador) -> System.out.println(jugador.toString()));
        }
    }
}
