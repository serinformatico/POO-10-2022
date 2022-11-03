package clase_07.extra.codigo.composicion.bidireccional;

public class DemoAgregacionBiDireccional {

    public static void main(String[] args) {

        Motor motor = new Motor("Diésel 1800cc 120HP");

        Automovil automovil = new Automovil("Ford", "Fiesta");
        automovil.setMotor(motor);

        // le pregunto al automóvil que motor tiene instalado
        System.out.println("Tengo instalado: " + automovil.getMotor().getDenominacion());

        motor.setAutomovil(automovil);

        // La relación inversa; me permite preguntarle a un motor en que automóvil está instalado
        //System.out.println("Estoy instalado en un " + motor.getAutomovil().getMarca());
    }
}
