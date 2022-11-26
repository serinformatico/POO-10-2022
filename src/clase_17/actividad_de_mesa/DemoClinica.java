package clase_17.actividad_de_mesa;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoClinica {
    public static void main(String[] args) throws FechaException {

        Scanner scanner   = new Scanner(System.in);
        Paciente paciente = new Paciente("Juan", "Perez", "12345");

        try {

            System.out.println("\nFecha de internación: ");
            System.out.println("    Ingresa el día");
            int diaDeLaFechaDeInternacion  = scanner.nextInt();

            System.out.println("    Ingresa el mes");
            int mesDeLaFechaDeInternacion  = scanner.nextInt();

            System.out.println("    Ingresa el año ####");
            int anioDeLaFechaDeInternacion = scanner.nextInt();

            LocalDate fechaDeInternacion = LocalDate.of(anioDeLaFechaDeInternacion, mesDeLaFechaDeInternacion, diaDeLaFechaDeInternacion);
            paciente.internar(fechaDeInternacion);


            System.out.println("\nFecha de alta: ");
            System.out.println("    Ingresa el día");
            int diaDeLaFechaDeAlta  = scanner.nextInt();

            System.out.println("    Ingresa el mes");
            int mesDeLaFechaDeAlta  = scanner.nextInt();

            System.out.println("    Ingresa el año");
            int anioDeLaFechaDeAlta = scanner.nextInt();

            LocalDate fechaDeAlta = LocalDate.of(anioDeLaFechaDeAlta, mesDeLaFechaDeAlta, diaDeLaFechaDeAlta);
            paciente.darDeAlta(fechaDeAlta);

        } catch (FechaException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Operación incorrecta. El valor debe ser un número entero");
        } catch (NullPointerException e) {
            System.out.println("Operación incorrecta. No se permiten valores nulos");
        } finally {
            System.out.println("Gracias por utilizar nuestros servicios");
        }
    }
}
