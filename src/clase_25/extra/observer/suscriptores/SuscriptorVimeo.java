package clase_25.extra.observer.suscriptores;

import clase_25.extra.observer.Observer;

public class SuscriptorVimeo implements Observer {

    // Atributos privados
    private String nombreDeUsuario;

    // Constructor
    public SuscriptorVimeo(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    // Método obligatorio
    @Override
    public void actualizar() {
        System.out.println(this.nombreDeUsuario + ", tenemos el agrado de notificarte que se ha subido un nuevo video");
    }

    // Getters & Setters
    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }
}
