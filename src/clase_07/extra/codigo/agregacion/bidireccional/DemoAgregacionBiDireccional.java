package clase_07.extra.codigo.agregacion.bidireccional;

public class DemoAgregacionBiDireccional {

    public static void main(String[] args) {

        Airbag airbagDeVolante = new Airbag("Airbag de volante AIR-0114V");
        Airbag airbagDePuerta  = new Airbag("Airbag de puerta AIR-0118P");
        Airbag[] airbags       = new Airbag[] {airbagDeVolante, airbagDePuerta, airbagDePuerta};

        Automovil automovil = new Automovil("Ford", "Fiesta", airbags);

        // le pregunto al automóvil que airbag tiene en la primera posición
        System.out.println("Tengo instalado: " + automovil.getAirbags()[0].getDenominacion());

        airbags[0].setAutomovil(automovil);
        airbags[1].setAutomovil(automovil);
        airbags[2].setAutomovil(automovil);

        // La relación inversa; me permite preguntarle a un airbag en que automóvil está instalado
        System.out.println("Estoy instalado en un " + airbags[0].getAutomovil().getMarca());
    }
}
