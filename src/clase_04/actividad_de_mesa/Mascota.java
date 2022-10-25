package clase_04.actividad_de_mesa;

public class Mascota {

    private Cliente propietario;
    private String nombre;
    private String especie;
    private String raza;
    private double peso;
    private double altura;
    private double largo;
    private double ancho;
    private String estadoGeneral;

    public Mascota(Cliente propietario, String nombre, String especie, String raza) {
        this.propietario = propietario;
        this.nombre      = nombre;
        this.especie     = especie;
        this.raza        = raza;
    }
}
