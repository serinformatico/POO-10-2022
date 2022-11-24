package clase_17.actividad_en_vivo;

public class Cliente {

    // Atributos privados
    private String nombre;
    private String apellido;
    private String dni;
    private double saldoDeudor;
    private double limite;

    // Constructor
    public Cliente(String nombre, String apellido, String dni, double limite) {
        this.nombre   = nombre;
        this.apellido = apellido;
        this.dni      = dni;
        this.limite   = limite;
    }

    public void comprar(double monto) throws LimiteException {
        if(monto > this.limite) {
            throw new LimiteException("ERROR: El monto de la compra supera el límite disponible");
        }

        this.saldoDeudor -= monto;
    }

    public void saldarDeuda(double monto) throws LimiteException {
        if(this.saldoDeudor == 0) {
            throw new LimiteException("ERROR: no tiene deuda el cliente con DNI: " + this.dni);
        }

        this.saldoDeudor += monto;
    }
}
