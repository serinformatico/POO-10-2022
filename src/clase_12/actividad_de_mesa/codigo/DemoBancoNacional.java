package clase_12.actividad_de_mesa.codigo;

public class DemoBancoNacional {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(123456, "Medina", 35888455);
        Cliente cliente2 = new Cliente(654321, "Pereyra", 40557123);

        CajaDeAhorro cajaDeAhorro = new CajaDeAhorro(100.0);
        cajaDeAhorro.setCliente(cliente1);

        CuentaCorriente cuentaCorriente = new CuentaCorriente(100.0, 500.0);
        cuentaCorriente.setCliente(cliente1);

        CuentaComitente cuentaComitente = new CuentaComitente(100.0, "123456");
        cuentaComitente.setCliente(cliente1);


        // Asigno las cuentas al cliente
        cliente1.setCuentasBancarias(new Cuenta[]{ cajaDeAhorro, cuentaCorriente, cuentaComitente });


        cajaDeAhorro.depositarEfectivo(400.0);
        cuentaCorriente.depositarEfectivo(900.0);
        cuentaComitente.depositarEfectivo(2900.0);

        cajaDeAhorro.cobrarIntereses();

        cajaDeAhorro.extraerEfectivo(500.0);
        cuentaCorriente.extraerEfectivo(1150.0);
        cuentaComitente.extraerEfectivo(2800.0);
        cuentaComitente.extraerEfectivo(2800.0, "123456");
    }
}
