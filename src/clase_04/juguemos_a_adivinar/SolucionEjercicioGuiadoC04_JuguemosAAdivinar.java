package clase_04.juguemos_a_adivinar;

public class SolucionEjercicioGuiadoC04_JuguemosAAdivinar {
    public static void main(String[] args) {

        /* Ejercicio: Juguemos a Adivinar
            En la cancha
        */

        Jugador jugador1 = new Jugador("Pablo", "Medina", "Arquero", 1);
        Jugador jugador2 = new Jugador("Mario", "Medina", "Defensor", 2);
        Jugador jugador3 = new Jugador("Lucas", "Ontiveros", "Defensor", 6);
        Jugador jugador4 = new Jugador("Manuel", "Quintero", "Volante", 7);
        Jugador jugador5 = new Jugador("Adrian", "Paez", "Volante", 5);
        Jugador jugador6 = new Jugador("Walter", "Romero", "Delantero", 9);

        Jugador jugador7 = new Jugador("Pablo");
        //jugador7.nombre = "Pablo"; // Falla porque el atributo es privado
        jugador7.apellido = "Ramirez";
        jugador7.posicion = "Delantero";
        jugador7.numero = 15;
    }
}









