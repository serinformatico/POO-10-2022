package clase_08.clinica.codigo;

public class MedicoCirujano extends Medico {

    // Atributo privado
    private MedicoAyudante[] ayudantes = new MedicoAyudante[2]; // Atributo necesario para la relación de asociación

    // Constructor
    public MedicoCirujano(int matricula, String nombre, double honorarioBasico) {
        super(matricula, nombre, honorarioBasico);
    }

    // Getter
    public MedicoAyudante[] getAyudantes() {
        return ayudantes;
    }

    // Setter
    public void setAyudantes(MedicoAyudante[] ayudantes) {
        this.ayudantes = ayudantes;
    }
}
