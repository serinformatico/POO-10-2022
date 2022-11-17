package clase_14_pre_evaluacion.actividad_en_vivo.codigo;

public abstract class Examen {

    protected String titulo;
    protected String enunciado;
    protected double nota;
    protected Estudiante estudiante;

    public Examen(String titulo, String enunciado, Estudiante estudiante) {
        this.titulo     = titulo;
        this.enunciado  = enunciado;
        this.estudiante = estudiante;
    }

    public abstract boolean consultarEstadoDeAprobacion();

    public String getTitulo() {
        return titulo;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public double getNota() {
        return nota;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
