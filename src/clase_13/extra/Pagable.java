package clase_13.extra;

public interface Pagable {

    // Constante
    public final double PORCENTAJE_DE_IMPUESTO_AL_CHEQUE = 0.6;

    // Métodos
    public boolean autorizarPago();
    public void emitirCheque(String apellido, String nombre);
}
