package clase_08.clinica.codigo;

public class MedicoDermatologo extends Medico {

    // Constructor
    public MedicoDermatologo(int matricula, String nombre, double honorarioBasico) {
        super(matricula, nombre, honorarioBasico);
    }

    // Método y parámetro necesario para la relación de dependencia o uso
    public void recetarMedicamento(Medicamento[] medicamentos) {
        System.out.println("Medicamentos recetados: ");
        for (Medicamento medicamento : medicamentos) {
            System.out.println("    " + medicamento.getNombre());
        }
    }
}
