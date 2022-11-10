package clase_11.actividad_de_mesa.codigo;

public class DemoBancoNacional {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(123456, "Medina", 35888455);
        Cliente cliente2 = new Cliente(654321, "Pereyra", 40557123);

        CajaDeAhorro cajaDeAhorro = new CajaDeAhorro(1000.0, 3.0);
        cajaDeAhorro.setCliente(cliente1);
        cajaDeAhorro.depositarEfectivo(100.0);
        cajaDeAhorro.extraerEfectivo(1850.0);

        CuentaCorriente cuentaCorriente = new CuentaCorriente(1500.0, 250.0);
        cuentaCorriente.setCliente(cliente2);
        cuentaCorriente.depositarEfectivo(100.0);
        cuentaCorriente.extraerEfectivo(1850.0);
    }
}
