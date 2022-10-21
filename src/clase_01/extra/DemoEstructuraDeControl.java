package clase_01.extra;

public class DemoEstructuraDeControl {
    public static void main(String[] args) {
        int numero = 1;

        // Estructura condicional ternaria
        boolean esVerdadero = (numero >= 1 || numero <= 10) ? true : false;

        // Estructura condicional multiple 'if'
        System.out.println("\nEstructura condicional simple 'if':");
        if (numero == 1) {
            System.out.println("Esta opción es igual a uno");
        } else if (numero == 2) {
            System.out.println("Esta opción es igual a dos");
        } else {
            System.out.println("Esta opción no se reconoce");
        }

        // Estructura condicional múltiple 'switch'
        System.out.println("\nEstructura condicional múltiple 'switch':");
        switch (numero) {
            case 1:
                System.out.println("Esta opción es igual a uno");
                break;
            case 2:
                System.out.println("Esta opción es igual a dos");
                break;
            default:
                System.out.println("Esta opción no se reconoce");
        }

        int[] numeros = { 1, 2, 3, 4, 5 };

        // Estructura cíclica 'for'
        System.out.println("\nEstructura cíclica 'for':");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El valor es: " + numeros[i]);
        }

        // Estructura cíclica 'foreach'
        System.out.println("\nEstructura cíclica 'foreach':");
        for (int n : numeros) {
            // Imprimir números impares
            if (n % 2 != 0) {
                System.out.println("Esta opción es: " + n);
            }
        }

        // Estructura cíclica 'while'
        System.out.println("\nEstructura cíclica 'while':");
        int j = 0;
        while (j < numeros.length) {
            System.out.println("Esta opción es: " + numeros[j]);
            j++;
        }
    }
}
