package clase_04.modelar_cuestiones_bancarias;

import java.util.Scanner;

public class SolucionEjercicioGuiadoC04_ModelarCuestionesBancarias {
    public static void main(String[] args) {

        /* Ejercicio: Modelar cuestiones bancarias
            Banco digital
            Un banco por lo general ofrece diferentes servicios a personas, empresas e instituciones. Estos servicios
            bancarios a menudo incluyen paquetes o combos para sus clientes. Particularmente nos concentramos en el
            análisis de las llamadas tarjetas de crédito y tarjetas de débito.

            Una tarjeta de débito: permite realizar transacciones de forma vinculada con nuestro saldo en la cuenta del
            banco, es como si estuviéramos utilizando el dinero guardado en la cuenta sin tener que extraer el dinero
            físico de un cajero automático. En el frente podemos notar que tiene el nombre del titular, un número, día
            mes de vencimiento.

            Una tarjeta de crédito: nos permite realizar compras sin tener la necesidad de contar con la cantidad
            exacta de dinero en la cuenta bancaria, el banco nos autoriza un monto límite de financiación, el cual se
            disminuye cada vez que utilizamos la tarjeta de crédito. Las compras se abonan en cuotas a las que se
            agregan intereses, cada tarjeta tiene un interés y una cantidad máxima de cuotas. Cuando pagamos el
            resumen de la tarjeta, se recupera una parte del límite de financiación, el cual se completa cuando
            terminamos de abonar nuestras deudas, por lo cual se tiene siempre un saldo consumido y un saldo impago.

            Actividad
            Crear un diagrama UML para la tarjeta de crédito y otro para la tarjeta de débito, con sus atributos y
            métodos incluyendo un constructor adecuado a cada una.
        */

        TarjetaDeDebito tarjetaDeDebito = new TarjetaDeDebito("Pablo Medina", "4522-8877-5500-4410", 10, 27);

        Scanner scanner = new Scanner(System.in);

        String respuestaDeAcreditacion = "S";
        while (respuestaDeAcreditacion.equalsIgnoreCase("S")) {
            System.out.println("\n" + tarjetaDeDebito.nombreDelTitular + ", ingresa la cantidad de dinero que deseas acreditar");
            tarjetaDeDebito.acreditarDinero(scanner.nextDouble());

            System.out.println("\n¿Quieres acreditar más dinero?");
            System.out.println("   N - NO");
            System.out.println("   S - SI");
            scanner.nextLine();
            respuestaDeAcreditacion = scanner.nextLine();
        }

        String respuestaDeExtraccion = "S";
        while (respuestaDeExtraccion.equalsIgnoreCase("S")) {
            System.out.println("\n" + tarjetaDeDebito.nombreDelTitular + ", ingresa la cantidad de dinero que deseas extraer");
            tarjetaDeDebito.extraerDinero(scanner.nextDouble());

            System.out.println("\n¿Quieres extraer más dinero?");
            System.out.println("   N - NO");
            System.out.println("   S - SI");
            scanner.nextLine();
            respuestaDeExtraccion = scanner.nextLine();
        }
    }
}









