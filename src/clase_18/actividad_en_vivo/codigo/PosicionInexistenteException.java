package clase_18.actividad_en_vivo.codigo;

public class PosicionInexistenteException extends Exception{

    public PosicionInexistenteException(){
        super("Posición inexistente");
    }

    public PosicionInexistenteException(String mensaje){
        super(mensaje);
    }
}
