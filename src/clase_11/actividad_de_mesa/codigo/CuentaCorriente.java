package clase_11.actividad_de_mesa.codigo;

import java.util.Objects;

public class CuentaCorriente extends Cuenta{

    // Atributo privado
    private double montoAutorizadoDeGiro;


    // Constructor
    public CuentaCorriente(double saldo, double montoAutorizadoDeGiro) {
        super(saldo);
        this.montoAutorizadoDeGiro = montoAutorizadoDeGiro;
    }


    // Definición del método depositarEfectivo() (está declarado en la superclase)
    public void depositarEfectivo(double monto) {
        this.saldo += monto;
        System.out.println("En tu cuenta corriente Has depositado $" + monto);
    }

    // Definición del método extraerEfectivo() (está declarado en la superclase)
    public void extraerEfectivo(double monto) {
        if ((this.getSaldo() + this.montoAutorizadoDeGiro) >= monto) {
            this.setSaldo(this.getSaldo() - monto);
            System.out.println("Has extraído $" + monto);
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        CajaDeAhorro cajaDeAhorro = (CajaDeAhorro) obj;
        return this.getCliente().getNumero() == cajaDeAhorro.getCliente().getNumero();
    }

    @Override
    public int hashCode() {
        return Objects.hash(montoAutorizadoDeGiro);
    }

    @Override
    public String toString() {
        return "Caja de Ahorro: " + super.toString() + ", monto autorizado de giro=" + montoAutorizadoDeGiro;
    }

    // Getter
    public double getMontoAutorizadoDeGiro() {
        return montoAutorizadoDeGiro;
    }


    // Setter
    public void setMontoAutorizadoDeGiro(double montoAutorizadoDeGiro) {
        this.montoAutorizadoDeGiro = montoAutorizadoDeGiro;
    }
}
