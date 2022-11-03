package clase_07.extra.codigo.dependencia.bidireccional;

public class DemoDependenciaBiDireccional {

    public static void main(String[] args) {

        Libro libroPOO = new Libro("Aprendiendo POO");
        Libro libroBD  = new Libro("Aprendiendo base de datos");
        Libro[] libros = new Libro[] {libroPOO, libroBD};

        Socio socio = new Socio("Pablo", "Medina");
        socio.leerLibro(libros);

        libroPOO.obtenerLector(socio);
        libroBD.obtenerLector(socio);

        // Esta relación no me permite preguntarle al socio que libro está leyendo
        //System.out.println("Estoy leyendo el libro " + socio.getLibro()[0].getTitulo());

        // Esta relación tampoco me permite preguntarle al libro que socio lo está leyendo
        //System.out.println("Me esta leyendo " + motor.getSocio().getDenominacion());
    }
}
