package clase_07.extra.codigo.asociacion.direccional;

public class DemoAsociacionDireccional {

    public static void main(String[] args) {

        Perro perro1   = new Perro("Caniche Toy");
        Perro perro2   = new Perro("Pastor alemán");
        Perro[] perros = new Perro[] {perro1, perro2};

        Persona persona = new Persona("Pablo", "Medina");
        persona.setPerros(perros);

        // le pregunto a la persona que perro tiene en la primera posición
        System.out.println("Mi mascota es un " + persona.getPerros()[0].getDenominacion());

        // No hay una relación inversa; entonces, no me permite preguntarle a un perro quien es su amo
        //System.out.println("Fuí adoptado por " + perros[0].getAmo().getNombre());
    }
}
