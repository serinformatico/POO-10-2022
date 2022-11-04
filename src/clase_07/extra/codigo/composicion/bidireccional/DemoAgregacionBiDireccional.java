package clase_07.extra.codigo.composicion.bidireccional;

public class DemoAgregacionBiDireccional {

    public static void main(String[] args) {

        Automovil automovil = new Automovil("Ford", "Fiesta");

        Motor motor = automovil.getMotor();
        motor.setDenominacion("Diésel 1800cc 120HP");

        // le pregunto al automóvil que motor tiene instalado
        System.out.println("Tengo instalado: " + automovil.getMotor().getDenominacion());

        motor.setAutomovil(automovil);

        // La relación inversa; me permite preguntarle a un motor en que automóvil está instalado
        System.out.println("Estoy instalado en un " + motor.getAutomovil().getMarca());
    }
}
