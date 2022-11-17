package clase_05.actividad_de_mesa.codigo;

import java.util.Scanner;

public class SolucionConsignaDeMesaC05 {

    /* Ejercicio: Usuario de juego
        Para desarrollar un juego necesitamos implementar la clase UsuarioJuego. Los usuarios
        tienen nombre y clave, estos datos se deben suministrar cuando se crea un nuevo usuario.

        Inicialmente, tienen puntaje y nivel en cero. Sin embargo, pueden aumentar tanto el puntaje
        como el nivel en 1, debemos suministrar un método para poder hacerlo. El usuario también
        puede recibir un bonus, esto quiere decir que recibe un valor extra que se suma a su puntaje.

        Crear la clase del diagrama en Java. Al finalizar, crear un objeto y probar el
        funcionamiento de los métodos.
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresá el nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingresá la clave:");
        String clave = scanner.nextLine();

        UsuarioJuego jugador1 = new UsuarioJuego(nombre, clave);
        System.out.println("\nPuntaje inicial: " + jugador1.getPuntaje());
        System.out.println("Nivel inicial: " + jugador1.getNivel());

        jugador1.aumentarPuntaje();
        jugador1.aumentarNivel();
        jugador1.bonus(5);

        System.out.println("\nPuntaje final: " + jugador1.getPuntaje());
        System.out.println("Nivel final: " + jugador1.getNivel());
    }
}
