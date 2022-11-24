package clase_17.actividad_en_vivo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoComercio {
    public static void main(String[] args) throws LimiteException {

        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente("Pedro", "Pérez", "35444000", 500.0);

        try {

            System.out.println("Ingresa el monto de la compra");
            double montoDeCompra = scanner.nextDouble();
            cliente.comprar(montoDeCompra);

            System.out.println("Ingresa el monto a pagar");
            double montoAPagar = scanner.nextDouble();
            cliente.saldarDeuda(montoAPagar);

        } catch (LimiteException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Operación incorrecta. El valor debe ser un número");
        } catch (NullPointerException e) {
            System.out.println("Operación incorrecta. No se permiten valores nulos");
        } finally {
            System.out.println("Gracias por utilizar nuestros servicios");
        }
    }
}
