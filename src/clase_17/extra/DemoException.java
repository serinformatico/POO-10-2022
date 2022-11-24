package clase_17.extra;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoException {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int resultado   = 0;

        try {

            System.out.println("Ingresa un número entero");
            int numeroA = scanner.nextInt();

            System.out.println("Ingresa otro número entero");
            int numeroB = scanner.nextInt();

            System.out.println("Has ingresado " + numeroA + " y " + numeroB);

            if (numeroA < numeroB) {
                throw new MiPropiaException();
            } else {
                resultado = numeroA / numeroB;
            }

        } catch (InputMismatchException e) {
            System.out.println("Ingresaste un valor que no es un número entero");
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        } catch (NullPointerException e) {
            System.out.println("No se puede operar con valores nulos");
        } catch (MiPropiaException e) {
            System.out.println(e.getMessage()); // Imprime el mensaje que se le pasó por el parámetro del constructor.
        } finally {
            System.out.println("Resultado: " + resultado);
        }

        System.out.println("Continua en ejecución de programa");
    }

}
