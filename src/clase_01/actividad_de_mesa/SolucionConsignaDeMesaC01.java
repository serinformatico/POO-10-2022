package clase_01.actividad_de_mesa;

public class SolucionConsignaDeMesaC01 {
    public static void main(String[] args) {
        /* Ejercicio 2:
            Para representar cada una de las características de las mascotas, crear una variable y darle
            el valor correspondiente en el IDE IntelliJ. No olvidar darle el tipo adecuado a lo que
            queremos que contenga. Por cada mascota de la veterinaria que figura en la siguiente
            tabla, vamos a tener que mostrar la información del animal.

            La información va a mostrarse como el siguiente ejemplo:
                “Manchitas tiene 2 años”
                “Manchitas come un kilo y medio y hace guau guau”
        */

        String nombrePerro      = "Manchitas";
        String edadPerro        = "2 años";
        String cuantoComePerro  = "1 kilo y medio";
        String respondemosPerro = "guau guau";
        System.out.println(nombrePerro + " tiene " + edadPerro);
        System.out.println(nombrePerro + " come " + cuantoComePerro + " y hace " + respondemosPerro + "\n");

        String nombrePez      = "Nemo";
        String edadPez        = "1 año";
        String cuantoComePez  = "140 gramos";
        String respondemosPez = "glub glub";
        System.out.println(nombrePez + " tiene " + edadPez);
        System.out.println(nombrePez + " come " + cuantoComePez + " y hacen " + respondemosPez + "\n");

        String nombreGato      = "Silvestre";
        String edadGato        = "3 años";
        String cuantoComeGato  = "medio kilo";
        String respondemosGato = "miauu";
        System.out.println(nombreGato + " tiene " + edadGato);
        System.out.println(nombreGato + " come " + cuantoComeGato + " y hace " + respondemosGato + "\n");

        String nombreTortuga      = "Manuelita";
        String edadTortuga        = "12 años";
        String cuantoComeTortuga  = "300 gramos";
        String respondemosTortuga = "Pehuajó";
        System.out.println(nombreTortuga + " tiene " + edadTortuga);
        System.out.println(nombreTortuga + " come " + cuantoComeTortuga + " y vivía en " + respondemosTortuga + "\n");

        String nombrePajarito      = "Gardel";
        String edadPajarito        = "1 año";
        String cuantoComePajarito  = "350 gramos";
        String respondemosPajarito = "pio pio";
        System.out.println(nombrePajarito + " tiene " + edadPajarito);
        System.out.println(nombrePajarito + " come " + cuantoComePajarito + " y hace " + respondemosPajarito + "\n");
    }
}
