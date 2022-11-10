package clase_11.extra.codigo;

public class DemoVehiculoAbstract {
    public static void main(String[] args) {

        Combustible nafta      = new Combustible("Nafta", 170.00);
        Combustible diesel     = new Combustible("Diésel", 150.00);
        Combustible euroDiesel = new Combustible("Euro Diésel", 190.00);

        //Vehiculo vehiculoCiclomotor = new Vehiculo("Zanella", "Sol 50cc", 123456); // No se puede crear una instancia (objeto) de una clase abstracta

        System.out.println("\nCICLOMOTOR 1");
        Ciclomotor ciclomotor1 = new Ciclomotor("Zanella", "Sol 50cc", 123456, "Universal Z50");
        ciclomotor1.encenderMotor();
        ciclomotor1.acelerar();
        ciclomotor1.girar(true);
        ciclomotor1.frenar();
        ciclomotor1.bajarCaballete();
        ciclomotor1.cargarCombustible(nafta);
        ciclomotor1.subirCaballete();

        System.out.println("\nCOUPE");
        Coupe coupe = new Coupe("Fiat", "Cronos", 645321);
        coupe.encenderMotor();
        coupe.acelerar();
        coupe.girar(true);
        coupe.frenar();
        coupe.cargarCombustible(diesel);
        coupe.abrirBaul();
        coupe.cerrarBaul();

        System.out.println("\nPICKUP");
        Pickup pickup = new Pickup("Ford", "F100", 142536);
        pickup.encenderMotor();
        pickup.acelerar();
        pickup.girar(true);
        pickup.frenar();
        pickup.cargarCombustible(euroDiesel);
        pickup.abrirCompuertaDeCarroceria();
        pickup.cerrarCompuertaDeCarroceria();


        Ciclomotor ciclomotor2 = new Ciclomotor("Zanella", "Sol 50cc", 123456, "Universal Z50");
        Ciclomotor ciclomotor3 = new Ciclomotor("Zanella", "Sol 50cc", 456789, "Universal Z50");


        System.out.println("\nMétodo toString()");
        System.out.println(ciclomotor1.toString());


        System.out.println("\nMétodo equals()");
        System.out.println("Valor nulo: " + ciclomotor1.equals(null));
        System.out.println("Objeto de tipo pickup: " + ciclomotor1.equals(pickup));
        System.out.println("Objeto de tipo ciclomotor2: " + ciclomotor1.equals(ciclomotor2)); // Verdadero. Los objetos tienen el mismo número de chasis
        System.out.println("Objeto de tipo ciclomotor3: " + ciclomotor1.equals(ciclomotor3));


        System.out.println("\nMétodo equals()");
        System.out.println(ciclomotor1.hashCode());
    }
}
