package material_dh.clase_02;

import java.util.Scanner;

public class SolucionEjercicioGuiadoC02Improvisado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el valor de compra");
        double valorDeCompra = scanner.nextDouble();

        System.out.println("Ingresa el valor de reventa");
        double valorDeVenta = scanner.nextDouble();

        double margenDeGanancia = valorDeVenta-valorDeCompra;
        double margenDeGananciaPorcentual = (100 / valorDeVenta) * margenDeGanancia;

        System.out.println("El margen de ganancia es $" + margenDeGanancia);
        System.out.println("El margen de ganancia porcentual es %" + margenDeGananciaPorcentual);
    }
}
