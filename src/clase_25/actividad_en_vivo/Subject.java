package clase_25.actividad_en_vivo;

public interface Subject {

    public void agregar(Observer observer);
    public void eliminar(Observer observer);
    public void notificar();
}
