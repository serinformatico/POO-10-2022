package clase_03.actividad_de_mesa;

import java.util.Scanner;

public class SolucionConsignaDeMesaC03_D4 {
    public static void main(String[] args) {
        /* Desafío 4:
            Por cuestiones laborales, se pueden trabajar hasta 40 horas semanales, si se trabajan más horas,
            las mismas se consideran horas extras cuyo valor es un 50% más que las horas de trabajo normales.
            Crear un programa que pueda informar el sueldo semanal de la programadora Julieta.
            Ella trabajó en la última semana “x” cantidad de horas y el valor de la hora semanal es de 875.
        */

        double valorDeHoraLaboral     = 875.0;
        double sueldoSemanal          = 0.0;
        int cantidadDeHorasTrabajadas = 0;
        Scanner scanner               = new Scanner(System.in);

        System.out.println("Ingresá la cantidad de horas trabajadas:");
        cantidadDeHorasTrabajadas = scanner.nextInt();

        if (cantidadDeHorasTrabajadas > 40) {
            sueldoSemanal = valorDeHoraLaboral * 40;
            sueldoSemanal += (valorDeHoraLaboral * 1.5) * (cantidadDeHorasTrabajadas - 40);
        } else {
            sueldoSemanal = cantidadDeHorasTrabajadas * valorDeHoraLaboral;
        }

        System.out.println("El sueldo semanal es de: $" + sueldoSemanal);
    }
}