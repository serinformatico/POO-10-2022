package clase_08.extra.codigo;

public class Profesor extends Persona {

    // Atributos privados
    private String materia;

    // Constructor
    public Profesor(String nombre, String apellido, String materia) {
        super(nombre, apellido);
        this.materia = materia;
    }

    // Método público
    public void proponerTema(String tema) {
        // Lógica
    }

    // Getter
    public String getTemario() {
        return materia;
    }

    // Setter
    public void setTemario(String temario) {
        this.materia = temario;
    }
}
