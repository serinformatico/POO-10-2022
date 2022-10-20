package clase_01;

public class SolucionEjercicioAsincronoC01 {
    public static void main(String[] args) {

        /* Ejercicio 1:
            Definir dos números enteros. Asignarles un valor a cada uno. Comprobar si un número es
            divisible por el segundo e indicar mediante un mensaje el resultado obtenido.
            NOTA: Que sea divisible quiere decir que al dividir da un valor exacto, es decir, sin
            decimales.
        */

        int numeroUno = 10;
        int numeroDos = 3;
        if ((numeroUno % numeroDos) == 0) {
            System.out.println("El número " + numeroUno + " es divisible en " + numeroDos);
        } else {
            System.out.println("El número " + numeroUno + " no es divisible en " + numeroDos);
        }
    }
}
