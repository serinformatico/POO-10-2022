package clase_16.actividad_en_vivo.codigo.linkedlist;

import clase_16.actividad_en_vivo.codigo.Jugador;

import java.util.Collections;

public class DemoLinkedList {
    public static void main(String[] args) {

        Jugador jugador1 = new Jugador();
        jugador1.setNumeroDeCamiseta(1);
        jugador1.setNombre("Pablo");
        jugador1.setEsTitular(true);
        jugador1.setEstaLesionado(false);

        Jugador jugador2 = new Jugador();
        jugador2.setNumeroDeCamiseta(2);
        jugador2.setNombre("Mario");
        jugador2.setEsTitular(true);
        jugador2.setEstaLesionado(false);

        Jugador jugador5 = new Jugador();
        jugador5.setNumeroDeCamiseta(5);
        jugador5.setNombre("Mariano");
        jugador5.setEsTitular(true);
        jugador5.setEstaLesionado(false);

        Jugador jugador9 = new Jugador();
        jugador9.setNumeroDeCamiseta(9);
        jugador9.setNombre("Alejandro");
        jugador9.setEsTitular(true);
        jugador9.setEstaLesionado(true);

        Jugador jugador10 = new Jugador();
        jugador10.setNumeroDeCamiseta(10);
        jugador10.setNombre("Pablo");
        jugador10.setEsTitular(true);
        jugador10.setEstaLesionado(false);

        Jugador jugador12 = new Jugador();
        jugador12.setNumeroDeCamiseta(12);
        jugador12.setNombre("Alberto");
        jugador12.setEsTitular(false);
        jugador12.setEstaLesionado(true);

        Jugador jugador15 = new Jugador();
        jugador15.setNumeroDeCamiseta(15);
        jugador15.setNombre("Pablo");
        jugador15.setEsTitular(false);
        jugador15.setEstaLesionado(false);

        Equipo equipo = new Equipo();
        equipo.setNombre("super club");
        equipo.agregarJugador(jugador10);
        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(jugador2);
        equipo.agregarJugador(jugador9);
        equipo.agregarJugador(jugador5);
        equipo.agregarJugador(jugador15);
        equipo.agregarJugador(jugador12);

        System.out.println("\nARRAYLIST DESORDENADO");
        equipo.mostrarJugadoresTitulares();
        System.out.println(equipo.obtenerCantidadDeJugadoresLesionados());

        System.out.println("\nARRAYLIST ORDENADO (de menor a mayor)");
        Collections.sort(equipo.getJugadores());
        equipo.mostrarJugadoresTitulares();

        System.out.println("\nARRAYLIST ORDENADO (de mayor a menor)");
        Collections.reverse(equipo.getJugadores());
        equipo.mostrarJugadoresTitulares();
    }
}
