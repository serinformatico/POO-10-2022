package clase_13.extra;

public class DemoBono {
    public static void main(String[] args) {

        Bono bono1 = new Bono("ABC123", 1735.45);
        Bono bono2 = new Bono("ABC789", 500.17);
        Bono bono3 = new Bono("ABC154", 1252.12);

        //Bono bono4 = bono3; // La referencia se mantiene al mismo objeto
        Bono bono4 = bono3.clone(); // Nuevo objeto
        bono4.setCodigo("ABC100");

        System.out.println(bono1.compareTo(bono2));
        System.out.println(bono2.compareTo(bono3));
        System.out.println(bono3.compareTo(bono4));

        bono1.registrarBono();
        bono4.autorizarPago();
        bono1.emitirCheque("Medina", "Pablo");
    }
}
