package clase_13.actividad_en_vivo.codigo;

public class DemoBancoNacionalConInterfaz {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(123456, "Medina", 35888455);
        Cliente cliente2 = new Cliente(654321, "Pereyra", 40557123);

        CajaDeAhorro cajaDeAhorro = new CajaDeAhorro(100.0);
        cajaDeAhorro.setCliente(cliente1);

        CuentaCorriente cuentaCorriente = new CuentaCorriente(100.0, 500.0);
        cuentaCorriente.setCliente(cliente1);

        // Asigno las cuentas al cliente
        cliente1.setCuentasBancarias(new Cuenta[]{ cajaDeAhorro, cuentaCorriente });


        cajaDeAhorro.depositarEfectivo(400.0);
        cuentaCorriente.depositarEfectivo(900.0);

        cajaDeAhorro.cobrarIntereses();
        cuentaCorriente.gravar(3.0);

        cajaDeAhorro.extraerEfectivo(500.0);
        cuentaCorriente.extraerEfectivo(1150.0);
    }
}
