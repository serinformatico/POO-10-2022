package clase_08.extra.codigo;

public class Estudiante extends Persona {

    // Atributos privados
    private String carrera;
    private double promedioFinal;

    // Constructor
    public Estudiante(String nombre, String apellido, String carrera) {
        super(nombre, apellido);
        this.carrera       = carrera;
        this.promedioFinal = 0.0;
    }

    // Método público
    public void tomarClase(Clase clase) {
        // Lógica
    }

    // Getters
    public String getCarrera() {
        return carrera;
    }

    public double getPromedioFinal() {
        return promedioFinal;
    }

    // Setters
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setPromedioFinal(double promedioFinal) {
        this.promedioFinal = promedioFinal;
    }
}
