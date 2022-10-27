package clase_04.actividad_de_mesa.ejercicio2;

import java.time.LocalDate;

public class SolucionConsignaDeMesaC04_E2 {

    /* Ejercicio 2:
            Paulina es clienta del banco Digital Bank y tiene una cuenta corriente que le permite
            emitir cheques para pagar electrodomésticos. El banco ofrece dos tipos de cheques:
                ● Común
                ● De pago diferido
            Los cheques tienen una fecha de emisión y una fecha de vencimiento, con un plazo
            máximo de 30 días para su presentación a contar desde la fecha de vencimiento. Pueden
            ser transferidos a otras personas mediante una acción conocida como endoso, esto implica
            escribir los datos de la nueva persona propietaria al dorso del cheque.

            Actividad
            Modelar la clase cheque para que pueda ser utilizada en un programa del banco. Agregar
            atributos o métodos si te parece que faltan.
    */

    public static void main(String[] args) {

        Cheque cheque = new Cheque("Pago diferido", LocalDate.of(2022, 11, 26), "Pablo Medina", 1000.0);
        cheque.endosante = "Lorena Pereyra";
    }
}
