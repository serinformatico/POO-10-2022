package material_extra.clase_20.state;

public abstract class LuzState {

    protected String nombre;

    public abstract String mostrar();

    public abstract void siguiente(Semaforo semaforo);
}
