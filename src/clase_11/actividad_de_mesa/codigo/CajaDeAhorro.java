package clase_11.actividad_de_mesa.codigo;

import java.util.Objects;

public class CajaDeAhorro extends Cuenta{

    // Atributo privado
    private double tasaDeInteres;


    // Constructor
    public CajaDeAhorro(double saldo, double tasaDeInteres) {
        super(saldo);
        this.tasaDeInteres = tasaDeInteres;
    }


    // Definición del método depositarEfectivo() (está declarado en la superclase)
    public void depositarEfectivo(double monto) {
        this.saldo += monto;
        System.out.println("En tu caja de ahorros Has depositado $" + monto);
    }

    // Definición del método extraerEfectivo() (está declarado en la superclase)
    public void extraerEfectivo(double monto) {
        if ((this.getSaldo() + this.tasaDeInteres) >= monto) {
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
        return Objects.hash(tasaDeInteres);
    }

    @Override
    public String toString() {
        return "Caja de Ahorro: " + super.toString() + ", tasa de interés=" + tasaDeInteres;
    }

    // Getter
    public double getTasaDeInteres() {
        return tasaDeInteres;
    }


    // Setter
    public void setTasaDeInteres(double tasaDeInteres) {
        this.tasaDeInteres = tasaDeInteres;
    }
}
