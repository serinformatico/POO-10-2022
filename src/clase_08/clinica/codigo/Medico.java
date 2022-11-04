package clase_08.clinica.codigo;

public class Medico {

    // Atributos protegidos
    protected int matricula;
    protected String nombre;
    protected double honorarioBasico;
    protected Paciente[] pacientesPorAtender;  // Atributo necesario para la relación de asociación

    // Constructor
    public Medico(int matricula, String nombre, double honorarioBasico) {
        this.matricula       = matricula;
        this.nombre          = nombre;
        this.honorarioBasico = honorarioBasico;
    }

    // Getters
    public int getMatricula() {
        return this.matricula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getHonorarioBasico() {
        return this.honorarioBasico;
    }

    public Paciente[] getPacientesPorAtender() {
        return pacientesPorAtender;
    }

    // Setters
    public void setMatricula(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setHonorarioBasico(double honorarioBasico) {
        this.honorarioBasico = honorarioBasico;
    }

    public void setPacientesPorAtender(Paciente[] pacientesPorAtender) {
        this.pacientesPorAtender = pacientesPorAtender;
    }
}
