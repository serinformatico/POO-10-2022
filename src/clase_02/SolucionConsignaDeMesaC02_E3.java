package material_dh.clase_02;

import java.util.Scanner;

public class SolucionConsignaDeMesaC02_E3 {

    /* Ejercicio 3:
        Escribir una función:
            boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB)
        la misma, debe tomar dos cadenas de texto y devolver true, en caso de que sean distintos,
        o false, en caso de que coincidan.
    */
    public static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB) {
        return !(unTextoA.equals(unTextoB));
    }


    /* Demostración */
    public static void main(String[] args) {

        System.out.println("\nEjercicio 3:");
        boolean cadenasDeTextoDistintas = cadenasDeTextoDistintas("Hola", "Hola");

        if (cadenasDeTextoDistintas) {
            System.out.println("Son distintas");
        } else {
            System.out.println("Son iguales");
        }
    }
}
