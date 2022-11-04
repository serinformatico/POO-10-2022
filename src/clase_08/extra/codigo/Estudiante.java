package clase_08.extra.codigo;

public class Estudiante extends Persona {

    // Atributos privados
    private String carrera;
    private double promedioFinal;

    // Constructor
    public Estudiante(String nombre, String apellido, String carrera, double promedioFinal) {
        super(nombre, apellido);
        this.carrera = carrera;
        this.promedioFinal = promedioFinal;
    }

    // Método público
    public void tomarClase(Clase Clase) {
        // Lógica
    }

    // Getters
    public String getCarrera() {
        return this.carrera;
    }

    public double getPromedioFinal() {
        return this.promedioFinal;
    }

    // Setters
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setPromedioFinal(double promedioFinal) {
        this.promedioFinal = promedioFinal;
    }
}
