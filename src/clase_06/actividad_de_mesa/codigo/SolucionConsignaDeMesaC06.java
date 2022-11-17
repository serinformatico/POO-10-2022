package clase_06.actividad_de_mesa.codigo;

import java.util.Scanner;

public class SolucionConsignaDeMesaC06 {

    /* Ejercicio: Clases, atributos y responsabilidades
        Objetivo
        Identificar, modelar e implementar en Java la clase involucrada en siguiente enunciado
        especificando sus atributos, responsabilidades, al menos dos constructores y los
        correspondientes getters, y setters.

        Contexto: Para una institución que adopta perros se requiere tener de ellos: si están en
        adopción o no, raza, año aproximado de nacimiento, peso, si tiene o no chip, si está o no
        lastimado y el nombre de pila que le asignaron en la institución.

        Deberemos poder preguntar la edad de un perro y si es un perro factible de perderse
        —entendiendo que los perros que tienen chip son los que no se pueden perder—. Por otro
        lado, se puede enviar a adopción a un perro si no está lastimado y su peso es mayor a 5.45
        kg.
    */

    public static void main(String[] args) {

        Scanner capturador = new Scanner(System.in);

        System.out.println("Ingresá el nombre:");
        Perro perro1 = new Perro(capturador.nextLine());

        System.out.println("Ingresá la raza:");
        perro1.setRaza(capturador.nextLine());

        System.out.println("Ingresá el peso:");
        perro1.setPeso(capturador.nextDouble());

        System.out.println("Ingresá un año aproximado de nacimiento:");
        perro1.setAnioDeNacimiento(capturador.nextInt());

        System.out.println("Se puede perder: " + perro1.comprobarSiSePuedePerder());
        System.out.println("Edad aproximada: " + perro1.obtenerEdadAproximada());
        perro1.enviarAAdopcion();
    }
}
