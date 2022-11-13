package clase_12.actividad_de_mesa.codigo;

import java.util.Objects;

public class CuentaComitente extends Cuenta {

    // Atributo privado
    private String clave;


    // Constructor
    public CuentaComitente(double saldo, String clave) {
        super(saldo);
        this.clave = clave;
    }


    // Definición del método depositarEfectivo() (está declarado en la superclase)
    public void depositarEfectivo(double monto) {
        this.saldo += monto - (monto / 100 * 1);
        System.out.println("En tu cuenta comitente has depositado $" + monto + " --> Saldo actual: $" + this.saldo);
    }


    // Definición del método extraerEfectivo() (está declarado en la superclase)
    public void extraerEfectivo(double monto) {
        if ((this.saldo / 2) >= monto) {
            this.saldo -= monto;
            System.out.println("De tu cuenta comitente has extraído $" + monto + " --> Saldo actual: $" + this.saldo);
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }


    // Sobrecarga del método extraerEfectivo()
    public void extraerEfectivo(double monto, String clave) {
        if (this.clave.equals(clave) && this.saldo >= monto) {
            this.saldo -= monto;
            System.out.println("De tu cuenta comitente (acceso con clave) has extraído $" + monto + " --> Saldo actual: $" + this.saldo);
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }


    // Métodos heredados de la clase Object
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
        return Objects.hash(clave);
    }


    // Método sobrescrito
    @Override
    public String toString() {
        return "Cuenta Comitente: " + super.toString() + ", clave=" + clave;
    }


    // Getter
    public String getClave() {
        return clave;
    }


    // Setter
    public void setClave(String clave) {
        this.clave = clave;
    }
}
