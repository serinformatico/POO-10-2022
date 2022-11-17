package clase_14_pre_evaluacion.actividad_de_mesa.codigo;

public class Capitan {

    // Atributos privados
    private String nombre;
    private String apellido;
    private int matricula;

    // Constructor
    public Capitan(String nombre, String apellido, int matricula) {
        this.nombre    = nombre;
        this.apellido  = apellido;
        this.matricula = matricula;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getMatricula() {
        return matricula;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}