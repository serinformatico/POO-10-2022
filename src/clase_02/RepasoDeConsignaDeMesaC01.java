package clase_02;

public class RepasoDeConsignaDeMesaC01 {
    public static void main(String[] args) {
        /* Ejercicio 2:
            Para representar cada una de las características de las mascotas, crear una variable y darle
            el valor correspondiente en el IDE IntelliJ. No olvidar darle el tipo adecuado a lo que
            queremos que contenga. Por cada mascota de la veterinaria que figura en la siguiente
            tabla, vamos a tener que mostrar la información del animal.

            La información va a mostrarse como el siguiente ejemplo:
                “Manchitas tiene 2 años”
                “Manchitas come un kilo y medio y hace guau guau”
            Nota: Le implementamos una función estática
        */

        String nombrePerro      = "Manchitas";
        String edadPerro        = "2 años";
        String cuantoComePerro  = "1 kilo y medio";
        String respondemosPerro = "guau guau";
        System.out.println(imprimirPorPantalla(nombrePerro, edadPerro, cuantoComePerro, " y hace ", respondemosPerro));

        String nombrePez      = "Nemo";
        String edadPez        = "1 año";
        String cuantoComePez  = "140 gramos";
        String respondemosPez = "glub glub";
        System.out.println(imprimirPorPantalla(nombrePez, edadPez, cuantoComePez, " y hacen ", respondemosPez));

        String nombreGato      = "Silvestre";
        String edadGato        = "3 años";
        String cuantoComeGato  = "medio kilo";
        String respondemosGato = "miauu";
        System.out.println(imprimirPorPantalla(nombreGato, edadGato, cuantoComeGato, " y hace ", respondemosGato));

        String nombreTortuga      = "Manuelita";
        String edadTortuga        = "12 años";
        String cuantoComeTortuga  = "300 gramos";
        String respondemosTortuga = "Pehuajó";
        System.out.println(imprimirPorPantalla(nombreTortuga, edadTortuga, cuantoComeTortuga, " y vivía en ", respondemosTortuga));

        String nombrePajarito      = "Gardel";
        String edadPajarito        = "1 año";
        String cuantoComePajarito  = "350 gramos";
        String respondemosPajarito = "pio pio";
        System.out.println(imprimirPorPantalla(nombrePajarito, edadPajarito, cuantoComePajarito, " y hace ", respondemosPajarito));
    }

    public static String imprimirPorPantalla(String nombre, String edad, String cantidadDeComida, String frase, String respuesta) {
        return (nombre + " tiene " + edad + "\n" + nombre + " come " + cantidadDeComida + frase + respuesta + "\n");
    }
}
