package clase_17.actividad_en_vivo;

public class LimiteException extends Exception {

    public LimiteException() {
        super("Operación incorrecta...");
    }

    public LimiteException(String mensaje) {
        super(mensaje);
    }
}
