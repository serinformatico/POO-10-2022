package clase_18.actividad_de_mesa.codigo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DemoEstacion {
    public static void main(String[] args) throws EstacionInexistenteException {

        Estacion mercedes  = new Estacion("Mercedes", 3);
        Estacion chivilcoy = new Estacion("Chivilcoy", 5);
        Estacion lujan     = new Estacion("Luján", 2);
        Estacion bsas      = new Estacion("Buenos Aires", 1);
        Estacion suipacha  = new Estacion("Suipacha", 4);
        Estacion bragado   = new Estacion("Bragado", 7);
        Estacion alberti   = new Estacion("Alberti", 6);

        Recorrido recorrido = new Recorrido();
        recorrido.setEstaciones(new ArrayList(Arrays.asList(mercedes, chivilcoy, lujan, bsas, suipacha, bragado, alberti)));
        Collections.sort(recorrido.getEstaciones());

        Reserva reserva1 = new Reserva("R151", bsas, bragado, 50); // Recorrido completo
        Reserva reserva2 = new Reserva("R152", mercedes, chivilcoy, 25);
        Reserva reserva3 = new Reserva("R153", lujan, bragado, 20);
        Reserva reserva4 = new Reserva("R154", bsas, suipacha, 30);
        Reserva reserva5 = new Reserva("R155", bragado, bsas, 25);

        Empresa empresa = new Empresa();
        empresa.setRecorrido(recorrido);
        empresa.setReservas(new ArrayList(Arrays.asList(reserva1, reserva2, reserva3, reserva4, reserva5)));

        System.out.println("\nRecaudación Total:");
        System.out.println(empresa.calcularRecaudacionTotal());

        try {
            System.out.println("\nEstación de Buenos Aires: Cantidad de pasajeros que la recorrieron");
            System.out.println(empresa.calcularCantidadDePasajerosQueRecorrieronUnaEstacion(bsas));

            System.out.println("\nEstación de San Juan: Cantidad de pasajeros que la recorrieron");
            Estacion sanjuan = new Estacion("San juan", 15);
            System.out.println(empresa.calcularCantidadDePasajerosQueRecorrieronUnaEstacion(sanjuan));
        } catch (EstacionInexistenteException e) {
            System.out.println(e.getMessage());
        }
    }
}
