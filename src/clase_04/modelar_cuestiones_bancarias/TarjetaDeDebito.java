package clase_04.modelar_cuestiones_bancarias;

public class TarjetaDeDebito {

    // Atributos o propiedades
    public String nombreDelTitular;
    public String numeroDeLaTarjeta;
    public int mesDeVencimiento;
    public int anioDeVencimiento;
    private double saldo;


    // Constructor
    public TarjetaDeDebito(String nombreDelTitular, String numeroDeLaTarjeta, int mesDeVencimiento, int anioDeVencimiento) {
        this.nombreDelTitular  = nombreDelTitular;
        this.numeroDeLaTarjeta = numeroDeLaTarjeta;
        this.mesDeVencimiento  = mesDeVencimiento;
        this.anioDeVencimiento = anioDeVencimiento;
        this.saldo             = 0.0;
    }


    // Métodos o comportamientos públicos
    public void acreditarDinero(double dinero) {
        this.saldo += dinero;
        System.out.println("Tu saldo actual es $" + this.obtenerSaldoActual());
    }

    public void extraerDinero(double dinero) {
        if (this.saldo < dinero) {
            System.out.println("Tu saldo es insuficiente. Ingresá una cantidad menor");
        } else {
            this.saldo -= dinero;
            System.out.println("Tu saldo actual es $" + this.obtenerSaldoActual());
        }
    }

    // Métodos o comportamientos privados
    private double obtenerSaldoActual() {
        return this.saldo;
    }
}