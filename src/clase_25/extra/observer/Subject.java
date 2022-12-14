package clase_25.extra.observer;

public interface Subject {

    public void suscribir(Observer observer);
    public void desuscribir(Observer observer);
    public void notificar();
}
