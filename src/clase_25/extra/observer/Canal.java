package clase_25.extra.observer;

import java.util.ArrayList;

public class Canal implements Subject {

    // Atributos privados
    private String nombreDelCanal;
    private ArrayList<Observer> suscriptores = new ArrayList();

    // Constructor
    public Canal(String nombreDelCanal) {
        this.nombreDelCanal = nombreDelCanal;
    }

    // Método obligatorio
    @Override
    public void suscribir(Observer observer) {
        this.suscriptores.add(observer);
    }

    @Override
    public void desuscribir(Observer observer) {
        this.suscriptores.remove(observer);
    }

    @Override
    public void notificar() {
        for (Observer suscriptor : this.suscriptores) {
            suscriptor.actualizar();
        }
    }

    // Método público
    public void subirVideo(String tituloDelVideo) {
        System.out.println("Se ha subido un video (" + tituloDelVideo + ")");
        this.notificar();
    }

    // Getters & Setters
    public String getNombreDelCanal() {
        return nombreDelCanal;
    }

    public void setNombreDelCanal(String nombreDelCanal) {
        this.nombreDelCanal = nombreDelCanal;
    }

    public ArrayList<Observer> getSuscriptores() {
        return suscriptores;
    }

    public void setSuscriptores(ArrayList<Observer> suscriptores) {
        this.suscriptores = suscriptores;
    }
}
