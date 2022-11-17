package clase_08.clinica.codigo;

public class MedicoCardiologo extends Medico {

    // Constructor
    public MedicoCardiologo(int matricula, String nombre, double honorarioBasico) {
        super(matricula, nombre, honorarioBasico);
    }

    // Método y parámetro necesario para la relación de dependencia o uso
    public void realizarEstudio(Estudio[] estudios) {
        System.out.println("Estudio realizados: ");
        for (Estudio estudio : estudios) {
            System.out.println("    " + estudio.getNombre());
        }
    }
}
