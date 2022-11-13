package clase_11.actividad_de_mesa.codigo;

public class DemoBancoNacional {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(123456, "Medina", 35888455);
        Cliente cliente2 = new Cliente(654321, "Pereyra", 40557123);

        CajaDeAhorro cajaDeAhorro1 = new CajaDeAhorro(100.0);
        cajaDeAhorro1.setCliente(cliente1);

        CajaDeAhorro cajaDeAhorro2 = new CajaDeAhorro(100.0);
        cajaDeAhorro2.setCliente(cliente1);

        CuentaCorriente ctaCte= new CuentaCorriente(100.0, 500.0);
        ctaCte.setCliente(cliente1);


        // Asigno las cuentas al cliente
        cliente1.setCuentasBancarias(new Cuenta[]{ cajaDeAhorro1, cajaDeAhorro2, ctaCte });


        cajaDeAhorro1.depositarEfectivo(900.0);
        cajaDeAhorro2.depositarEfectivo(1400.0);
        ctaCte.depositarEfectivo(2400.0);

        cajaDeAhorro1.cobrarIntereses();
        cajaDeAhorro2.cobrarIntereses();

        cajaDeAhorro1.extraerEfectivo(500.0);
        cajaDeAhorro2.extraerEfectivo(1900.0);
        ctaCte.extraerEfectivo(2800.0);

    }
}
