package material_dh.clase_02;

import java.util.Scanner;

public class SolucionConsignaDeMesaC02_E2 {

    /* Ejercicio 2:
        Escribir una función que reciba tres números y devuelva el máximo entre los tres números.
            Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC)

        Luego hacer un programa que permita el ingreso de 3 valores, utilice la función y muestre
        el resultado.
    */
    public static Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC) {

        Integer maximo = unNumeroA;

        if (maximo < unNumeroB) {
            maximo = unNumeroB;
        }

        if (maximo < unNumeroC) {
            maximo = unNumeroC;
        }

        return maximo;
    }


    /* Demostración */
    public static void main(String[] args) {

        System.out.println("\nEjercicio 2:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor para el numero A:");
        Integer unNumeroA = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el valor para el numero B:");
        Integer unNumeroB = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el valor para el numero C:");
        Integer unNumeroC = scanner.nextInt();
        scanner.nextLine();

        Integer resultado = maximoEntreTresNumeros(unNumeroA, unNumeroB, unNumeroC);
        System.out.println("El maximo de " + unNumeroA + ", " + unNumeroB + " y " + unNumeroC + " es " + resultado);
    }
}
