package clase_04.actividad_de_mesa;

public class Veterinario {

    private String nombre;
    private String apellido;
    private int numeroDelConsultorio;

    public Veterinario(String nombre, String apellido, int numeroDelConsultorio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDelConsultorio = numeroDelConsultorio;
    }

    public String diagnosticarMascota(Mascota mascota) {
        // lógica
        return "Diagnostico";
    };

    public void medicarMascota(Mascota mascota) {
        // lógica
    };
}
