package clase_08.extra.codigo;

public class Experto extends Profesor {

    // Atributos privados
    private String temario;

    // Constructor
    public Experto(String nombre, String apellido, String materia, String temario) {
        super(nombre, apellido, materia);
        this.temario = temario;
    }

    // Método público
    public void dictarClase(Clase clase) {
        // Lógica
    }

    // Getter
    public String getTemario() {
        return temario;
    }

    // Setter
    public void setTemario(String temario) {
        this.temario = temario;
    }
}
