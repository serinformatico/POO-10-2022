package clase_11.actividad_de_mesa.codigo;

import java.util.Objects;

public abstract class Cuenta {

    // Atributo protegido
    protected Cliente cliente;
    protected double saldo;


    // Constructor
    public Cuenta(double saldo) {
        this.cliente = new Cliente();
        this.saldo   = saldo;
    }


    // Métodos públicos
    public double informarSaldo() {
        return this.saldo;
    }


    // Métodos abstractos
    public abstract void depositarEfectivo(double monto);
    public abstract void extraerEfectivo(double monto);


    @Override
    public String toString() {
        return "cliente=" + cliente + ", saldo=" + saldo;
    }


    // Getters
    public Cliente getCliente() {
        return this.cliente;
    }

    public double getSaldo() {
        return this.saldo;
    }


    // Setters
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
