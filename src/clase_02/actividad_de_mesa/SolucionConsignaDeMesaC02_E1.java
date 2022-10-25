package clase_02.actividad_de_mesa;

import java.util.Scanner;

public class SolucionConsignaDeMesaC02_E1 {

    /* Ejercicio 1:
        Hacer una función que dado un número indica si es un número primo o no. Un número
        primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya
        que 25 es divisible por 1, 5 y 25. 17 sí es primo porque solo se puede dividir por 1 y por 17.
        Usar esta función en un programa, que permita el ingreso de un número y luego llame a la
        función desarrollada para comprobar si es primo o no. Para resolverlo usar la función
        obtenida en el ejercicio desarrollado en la clase asincrónica.
            boolean esDivisible(int n, int divisor)
    */
    public static boolean esPrimo(int n) {
        int divisores = 1;

        for (int i = 2; i <= n; i ++) {
            if (n % i == 0) {
                divisores ++;
            }
        }

        return (divisores == 2);
    }


    /* Demostración */
    public static void main(String[] args) {

        //Ejercicio 1
        System.out.println("Ejercicio 1:");
        if (esPrimo(3)) {
            System.out.println(3 + " es primo");
        } else {
            System.out.println(3 + " no es primo");
        }
    }
}
