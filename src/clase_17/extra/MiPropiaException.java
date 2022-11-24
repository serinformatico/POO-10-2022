package clase_17.extra;

public class MiPropiaException extends Exception {
    public MiPropiaException() {
        super("Hola y chau");
    }

    public MiPropiaException(String msj) {
        super(msj);
    }
}
