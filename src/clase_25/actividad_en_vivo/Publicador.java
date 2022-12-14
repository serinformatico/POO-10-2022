package clase_25.actividad_en_vivo;

import java.util.ArrayList;

public class Publicador implements Subject {

    // Atributos privados
    private String nombre;
    private String apellido;
    private ArrayList<Observer> seguidores = new ArrayList();

    // Constructor
    public Publicador(String nombre, String apellido) {
        this.nombre   = nombre;
        this.apellido = apellido;
    }

    // Método obligatorio
    @Override
    public void agregar(Observer observer) {
        this.seguidores.add(observer);
    }

    @Override
    public void eliminar(Observer observer) {
        this.seguidores.remove(observer);
    }

    @Override
    public void notificar() {
        for (Observer seguidor : this.seguidores) {
            seguidor.actualizar();
        }
    }

    // Método público
    public void subirFoto(String titulo) {
        System.out.println("Se ha subido una foto (" + titulo + ")");
        this.notificar();
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

    public ArrayList<Observer> getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(ArrayList<Observer> seguidores) {
        this.seguidores = seguidores;
    }
}
