package clase_08.clinica.codigo;

public class DemoClinica {
    public static void main(String[] args) {

        Medicamento medicamento1   = new Medicamento("Dupixent 300mg", 275.0);
        Medicamento medicamento2   = new Medicamento("Bepanthol 50g", 350.0);
        Medicamento[] medicamentos = new Medicamento[] { medicamento1, medicamento2 };

        System.out.println("\nDERMATOLOGO:");
        MedicoDermatologo medicoDermatologo = new MedicoDermatologo(12345, "Pablo Medina", 1500);
        System.out.println(medicoDermatologo.getNombre());
        medicoDermatologo.recetarMedicamento(medicamentos);


        Estudio estudio1   = new Estudio("Electrocardiograma", 550.0);
        Estudio estudio2   = new Estudio("Ergometría", 985.0);
        Estudio estudio3   = new Estudio("Ecocardiograma Doppler", 1100.0);
        Estudio[] estudios = new Estudio[] { estudio1, estudio2, estudio3 };

        System.out.println("\nCARDIOLOGO:");
        MedicoCardiologo medicoCardiologo = new MedicoCardiologo(12345, "Lorena Páez", 1500);
        System.out.println(medicoCardiologo.getNombre());
        medicoCardiologo.realizarEstudio(estudios);


        MedicoAyudante ayudante1   = new MedicoAyudante(150777, "Fernando Aguilera", 1500.0);
        MedicoAyudante ayudante2   = new MedicoAyudante(150798, "Fernanda Puebla", 1500.0);
        MedicoAyudante[] ayudantes = new MedicoAyudante[] { ayudante1, ayudante2 };

        System.out.println("\nCIRUJANO:");
        MedicoCirujano medicoCirujano = new MedicoCirujano(12345, "Miguel Páez", 1500);
        medicoCirujano.setAyudantes(ayudantes);
        System.out.println(medicoCirujano.getNombre());
        System.out.println("    Ayudante 1: " + medicoCirujano.getAyudantes()[0].getNombre());
        System.out.println("    Ayudante 2: " + medicoCirujano.getAyudantes()[1].getNombre());
    }
}
