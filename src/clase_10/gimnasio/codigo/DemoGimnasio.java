package clase_10.gimnasio.codigo;

public class DemoGimnasio {

    /*
        Ejercicio:
            Un gimnasio que ya tiene implementado un sistema que cuenta con un módulo para el cobro de cuota de sus socios.
            Los socios en el sistema poseen un código de socio, nombre, costo fijo mensual, y si ha pagado la cuota
            —esto es solo el nombre de la actividad—.

            El gimnasio incorporó a sus instalaciones una pileta de costo mensual fijo, por lo que ofrece como servicio vip,
            el acceso a dicha pileta. Para ingresar a la misma, se debe estar habilitado. Es decir, tener la revisión médica.
            Para incorporar este nuevo servicio, el analista propone extender las clases existentes de la siguiente manera:
            el gimnasio necesita saber cuál es la cuota que debe abonar el socio, en caso que no esté habilitado para ingresar
            a la pileta, no se le cobra este costo adicional.
    */

    public static void main(String[] args) {

        Pileta pileta = new Pileta(750.00);

        Socio socio1       = new Socio("GYM1410", "Pablo", "Medina", true);
        SocioPileta socio2 = new SocioPileta("GYM1420", "Lorena", "Medina");
        Socio socio3       = new Socio("GYM1430", "Angela", "Gómez");
        SocioPileta socio4 = new SocioPileta("GYM1440", "Angela", "Gómez", "Revisión correcta", pileta);
        Socio socio5       = new Socio("GYM1430", "Patricia", "Páez"); // Código repetido (socio3)

        System.out.println("\nSOCIO 1");
        System.out.println(socio1.toString());
        System.out.println("Es igual al socio 2: " + socio1.equals(socio2));
        System.out.println("HashCode: " + socio1.hashCode());

        System.out.println("\nSOCIO 2");
        socio2.setPileta(pileta);
        socio2.habilitarSocio("Revisión correcta");
        System.out.println(socio2.toString());
        System.out.println("Es igual al socio 3: " + socio2.equals(socio3));
        System.out.println("HashCode: " + socio2.hashCode());

        System.out.println("\nSOCIO 3");
        System.out.println("¿Pudo pagar? " + socio3.pagarCostoMensual(850));
        System.out.println(socio3.toString());
        System.out.println("Es igual al socio 4: " + socio3.equals(socio4));
        System.out.println("HashCode: " + socio3.hashCode());

        System.out.println("\nSOCIO 4");
        System.out.println("¿Pudo pagar? " + socio4.pagarCostoMensual(1750));
        System.out.println(socio4.toString());
        System.out.println("Es igual al socio 5: " + socio4.equals(socio5));
        System.out.println("HashCode: " + socio4.hashCode());

        System.out.println("\nSOCIO 5");
        System.out.println("¿Pudo pagar? " + socio5.pagarCostoMensual(850, 15.0));
        System.out.println(socio5.toString());
        System.out.println("Es igual al socio 3: " + socio5.equals(socio3));
        System.out.println("HashCode: " + socio5.hashCode());
    }
}
