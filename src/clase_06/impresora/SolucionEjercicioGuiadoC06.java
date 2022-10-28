package clase_06.impresora;

import java.util.Date;

public class SolucionEjercicioGuiadoC06 {
    public static void main(String[] args) {

        /* Ejercicio: Ejercicio de codificación
            Modelar en UML y luego codificar en Java la clase Impresora.

            Las impresoras tienen un modelo, un tipo de conexión, ya que muchas son USB y otras
            inalámbricas. Poseen una fecha de fabricación y todas ellas saben la cantidad de hojas
            disponibles que tienen.
        */


        Impresora impresora1 = new Impresora("HP1102", "USB");
        impresora1.setHojasDisponibles(5);
        impresora1.imprimir("Hola mundo 1", 8);

        Impresora impresora2 = new Impresora("HP1102w", "WIFI", new Date(2015, 01, 25));
        impresora2.setHojasDisponibles(5);
        impresora2.imprimir("Hola mundo 2", 2);

    }
}









