package clase_04.actividad_de_mesa.ejercicio1;

public class CajaDeAhorro {

    // Atributos privados
    private int numeroDeCuenta;
    private String titular;
    private String cbu;
    private String alias;
    private double saldo;

    public CajaDeAhorro(int numeroDeCuenta, String titular, String cbu, String alias, double saldo) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.titular        = titular;
        this.cbu            = cbu;
        this.alias          = alias;
        this.saldo          = saldo;
    }

    public void retirar(double monto) {
        if (validarSaldo(monto)) {
            this.saldo -= monto;
        }
    }

    public void depositar(double monto) {
        this.saldo += monto;
    }

    public void transferencia(double monto) {
        if (validarSaldo(monto)) {
            this.saldo -= monto;
        }
    }

    private boolean validarSaldo(double monto) {
        if (this.saldo < monto) {
            System.out.println("Saldo insuficiente");
            return false;
        } else {
            System.out.println("Saldo validado");
            return true;
        }
    }
}
