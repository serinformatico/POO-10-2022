package material_dh.clase_02;

import java.util.Scanner;

public class SolucionEjercicioGuiadoC02 {
    public static void main(String[] args) {
        /* Ejercicio 1: *********************************************************************************
            Ingresa tu nombre y tu apellido por separado, a partir de estas variables obtener en una
            tercera tus iniciales y tu fecha de nacimiento, para la fecha ingresa, 3 valores que
            representan día, mes y año.

            Luego muestra un mensaje, como si fuera una ficha, con tu nombre completo. Las iniciales
            de tu nombre y apellido y tu fecha de nacimiento con el formato "dd/mm/aaaa".

            Nota: Utilizar alguna función para resolver, por ejemplo una que dados los 3 valores
            devuelve la fecha como un string.
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        String nombre   = scanner.nextLine();

        System.out.println("Ingresa tu apellido");
        String apellido = scanner.nextLine();

        System.out.println("Ingresa dos dígitos para el día de tu fecha de nacimiento");
        int diaDeFechaDeNacimiento = scanner.nextInt();

        System.out.println("Ingresa dos dígitos para el mes de tu fecha de nacimiento");
        int mesDeFechaDeNacimiento = scanner.nextInt();

        System.out.println("Ingresa dos dígitos para el año de tu fecha de nacimiento");
        int anioDeFechaDeNacimiento = scanner.nextInt();

        String iniciales = String.valueOf(nombre.charAt(0)) + String.valueOf(apellido.charAt(0));

        System.out.println("\n ****** FICHA PERSONAL ******");
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("Iniciales: " + iniciales);
        System.out.println("Fecha de nacimiento: " + obtenerFechaDeNacimiento(diaDeFechaDeNacimiento, mesDeFechaDeNacimiento, anioDeFechaDeNacimiento));
    }

    public static String obtenerFechaDeNacimiento(int dia, int mes, int anio) {
        return dia + "/" + mes + "/" + anio;
    }
}
