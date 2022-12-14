package clase_25.extra.observer.suscriptores;

import clase_25.extra.observer.Observer;

public class SuscriptorYoutube implements Observer {

    // Atributos privados
    private String nombre;
    private String apellido;

    // Constructor
    public SuscriptorYoutube(String nombre, String apellido) {
        this.nombre   = nombre;
        this.apellido = apellido;
    }

    // Método obligatorio
    @Override
    public void actualizar() {
        System.out.println(this.nombre + ", tenemos el agrado de notificarte que se ha subido un nuevo video");
    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
