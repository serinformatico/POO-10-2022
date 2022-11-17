package clase_14_pre_evaluacion.actividad_en_vivo.codigo;

public class Estudiante {

    private String nombre;
    private String apellido;
    private int legajo;
    private Examen[] examenes;

    public Estudiante(String nombre, String apellido, int legajo) {
        this.nombre   = nombre;
        this.apellido = apellido;
        this.legajo   = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public Examen[] getExamenes() {
        return examenes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setExamenes(Examen[] examenes) {
        this.examenes = examenes;
    }
}
