package clase_07.extra.codigo.composicion.direccional;

public class DemoAgregacionDireccional {

    public static void main(String[] args) {

        Automovil automovil = new Automovil("Ford", "Fiesta");

        automovil.getMotor().setDenominacion("Diésel 1800cc 120HP");

        // le pregunto al automóvil que motor tiene instalado
        System.out.println("Tengo instalado: " + automovil.getMotor().getDenominacion());

        // No hay una relación inversa; entonces, no me permite preguntarle a un motor en que automóvil está instalado
        //System.out.println("Estoy instalado en un " + motor.getMotor().getDenominacion());
    }
}
