package clase_08.clinica.codigo;

public class DemoClinica {
    public static void main(String[] args) {

        Medicamento m = new Medicamento("diclofenac", 400);
        Medicamento[] medicamentos = new Medicamento[] { m };

        MedicoDermatologo medicoDermatologo = new MedicoDermatologo(12345, "Pablo", 1500);
        System.out.println(medicoDermatologo.getNombre());
        medicoDermatologo.recetarMedicamento(medicamentos);

    }
}
