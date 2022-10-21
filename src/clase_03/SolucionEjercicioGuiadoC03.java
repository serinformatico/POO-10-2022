package clase_03;

import java.util.Scanner;

public class SolucionEjercicioGuiadoC03 {
    public static void main(String[] args) {
        /* Ejercicio 1:
            En la veterinaria tienen perros de diferentes tipos. Cada uno de ellos come una cantidad fija
            de alimento balanceado por día. El proveedor de alimentos le envía un pack con diferentes
            cantidades de alimento. En cada uno hay sobres con pequeñas raciones para que se consuman
            por cada día, sabiendo que deben darles por lo menos 3 kg por día para que cada perro no se
            sienta con hambre y ladre toda la noche.

            Precisamos hacer un programa que nos ayude a simular la situación: Pedirá primero el nombre
            y la cantidad de comida que come el perro. La idea es que mediante una función llamada
            cuantosPaquetes indique el nombre y cuantos paquetes usará. Dada la cantidad necesaria la
            función cuantosPaquetes pedirá uno a uno los pesos de cada paquete hasta llegar a esa
            cantidad y retorna el número de paquetes que precisó.

            Ejemplo:
                Rintintin come 4 kg diarios.
                paquetes: 1.2 0.7 1.1 1.3
                resultado: Rintintin precisa 4 paquetes.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del perro:");
        String nombrePerro = scanner.nextLine();

        System.out.println("Ingrese la cantidad de alimento necesaria para el perro:");
        double cantidadTotalDeAlimento = scanner.nextDouble();

        System.out.println("\n" + nombrePerro + " debe comer al menos " + cantidadTotalDeAlimento + " kg por día");

        System.out.println("\nSe necesitan " + cuantosPaquetes(cantidadTotalDeAlimento, scanner) + " paquetes de alimento para " + nombrePerro);
    }

    /* Demostración */
    public static int cuantosPaquetes(double pCantidadDeComida, Scanner pScanner) {
        int contadorDePaquetes   = 0;
        double acumuladorDeAlimento = 0.0;

        while (acumuladorDeAlimento < pCantidadDeComida) {
            System.out.println("Ingrese el pesaje del paquete de alimento:");
            acumuladorDeAlimento += pScanner.nextDouble();
            pScanner.nextLine();
            contadorDePaquetes++;
        }

        return contadorDePaquetes;
    }
}
