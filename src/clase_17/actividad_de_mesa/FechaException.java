package clase_17.actividad_de_mesa;

public class FechaException extends Exception {
    public FechaException() {
        super("Operación incorrecta...");
    }

    public FechaException(String mensaje) {
        super(mensaje);
    }
}
