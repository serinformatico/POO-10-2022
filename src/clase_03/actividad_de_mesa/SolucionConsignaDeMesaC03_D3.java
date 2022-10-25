package clase_03.actividad_de_mesa;

import java.util.Scanner;

public class SolucionConsignaDeMesaC03_D3 {
    public static void main(String[] args) {
        /* Desafío 3:
            Implementar un programa que nos permite mostrar por consola los primeros “n” números
            primos, siendo “n” un valor numérico ingresado por consola. Por ejemplo: Con n=7, lo
            que debería devolver el programa es “Los primeros 7 números primos son: 2, 3, 5, 7, 11, 13, 17”.
        */

        Scanner scanner             = new Scanner(System.in);
        int cantidadDeNumerosPrimos = 0;
        int contadorDeNumerosPrimos = 0;
        int numeroActual            = 1;

        System.out.println("Ingresá el valor de n (cantidad de números primos):");
        cantidadDeNumerosPrimos = scanner.nextInt();

        while (contadorDeNumerosPrimos < cantidadDeNumerosPrimos) {
            int contadorDeDivisores = 0;

            for (int i = 1; i <= numeroActual; i++) {
                // Busca los divisores del número actual por medio del resto %
                if (numeroActual % i == 0) {
                    contadorDeDivisores++;
                }

                // Finaliza el bucle si tiene más de dos dividores
                if (contadorDeDivisores > 2) {
                    break;
                }
            }

            // Determina si es un número primo
            if (contadorDeDivisores == 2) {
                contadorDeNumerosPrimos++;
                System.out.println(numeroActual);
            }

            numeroActual++;
        }
    }
}