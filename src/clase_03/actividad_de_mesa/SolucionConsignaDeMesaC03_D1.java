package clase_03.actividad_de_mesa;

import java.util.Scanner;

public class SolucionConsignaDeMesaC03_D1 {
    public static void main(String[] args) {
        /* Desafío 1:
            Hacé un programa que te permita jugar a “Piedra, papel o tijera”. En primer lugar, la
            aplicación solicita el nombre de cada gamer, después empieza el juego. El juego consiste
            en pedir qué opción elije cada uno y sumar puntos al winner —si lo hay—. Definí y utilizá
            una función llamada cualGana con dos parámetros con las jugadas de cada uno, que
            devuelve 0 en caso de empate, 1 si gana el primero, 2 si gana el segundo. El juego termina
            cuando el primero elije “*” como indicador de final.
        */

        comenzarJuego();
    }

    private static int cualGana(String jugadaDeGamer1, String jugadaDeGamer2) {
        // Jugada ganada por el gamer 1
        if (jugadaDeGamer1.equals("1") && jugadaDeGamer2.equals("3")) {
            return 1;
        } else if (jugadaDeGamer1.equals("2") && jugadaDeGamer2.equals("1")) {
            return 1;
        } else if (jugadaDeGamer1.equals("3") && jugadaDeGamer2.equals("2")) {
            return 1;
        }

        // Jugada ganada por el gamer 1
        if (jugadaDeGamer2.equals("1") && jugadaDeGamer1.equals("3")) {
            return 2;
        } else if (jugadaDeGamer2.equals("2") && jugadaDeGamer1.equals("1")) {
            return 2;
        } else if (jugadaDeGamer2.equals("3") && jugadaDeGamer1.equals("2")) {
            return 2;
        }

        // Jugada empatada
        return 0;
    }

    private static void deteminarGanadorDelPartido(String nombreDeGamer1, String nombreDeGamer2, int puntosDeGamer1, int puntosDeGamer2) {
        if (puntosDeGamer1 > puntosDeGamer2) {
            System.out.println("El partido lo ganó " + nombreDeGamer1 + " con " + puntosDeGamer1 + "pts.");
        } else if(puntosDeGamer1 < puntosDeGamer2) {
            System.out.println("El partido lo ganó " + nombreDeGamer2 + " con " + puntosDeGamer2 + "pts.");
        } else {
            System.out.println("El partido terminó en un empate (" + puntosDeGamer2 + " a "+ puntosDeGamer2 + ")");
        }
    }

    public static void comenzarJuego() {
        String nombreDeGamer1 = "";
        String nombreDeGamer2 = "";
        String jugadaDeGamer1 = "";
        String jugadaDeGamer2 = "";
        int puntosDeGamer1    = 0;
        int puntosDeGamer2    = 0;
        Scanner scanner       = new Scanner(System.in);

        System.out.println("Ingrese el nombre del gamer N°1:");
        nombreDeGamer1 = scanner.nextLine();

        System.out.println("Ingrese el nombre del gamer N°2:");
        nombreDeGamer2 = scanner.nextLine();

        System.out.println("¡Que comience el juego!");
        while (!jugadaDeGamer1.equals("*")) {
            System.out.println("1 -> Piedra");
            System.out.println("2 -> Papel");
            System.out.println("3 -> Tijeras");
            System.out.println("* -> Terminar el juego");

            System.out.println("Gamer N°1 elejí tu jugada:");
            jugadaDeGamer1 = scanner.nextLine();

            if (!jugadaDeGamer1.equals("*")) {
                System.out.println("Gamer N°2 elejí tu jugada:");
                jugadaDeGamer2 = scanner.nextLine();

                if (cualGana(jugadaDeGamer1, jugadaDeGamer2) == 1) {
                    System.out.println("El gamer N°1 ha ganado esta jugada\n");
                    puntosDeGamer1++;
                } else if (cualGana(jugadaDeGamer1, jugadaDeGamer2) == 2) {
                    System.out.println("El gamer N°2 ha ganado esta jugada\n");
                    puntosDeGamer2++;
                } else {
                    System.out.println("Esta jugada ha quedado en empate\n");
                }
            }
        }

        deteminarGanadorDelPartido(nombreDeGamer1, nombreDeGamer2, puntosDeGamer1, puntosDeGamer2);
    }
}
