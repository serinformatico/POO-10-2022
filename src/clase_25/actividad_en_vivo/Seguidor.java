package clase_25.actividad_en_vivo;

public class Seguidor implements Observer {

    // Atributos privados
    private String nombre;
    private String apellido;
    private int cantidadDeNotificaciones = 0;

    // Constructor
    public Seguidor(String nombre, String apellido) {
        this.nombre   = nombre;
        this.apellido = apellido;
    }

    // Método obligatorio
    @Override
    public void actualizar() {
        System.out.println(this.nombre + ", tenemos el agrado de notificarte que se ha subido una nueva foto");
        this.cantidadDeNotificaciones++;
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

    public int getCantidadDeNotificaciones() {
        return cantidadDeNotificaciones;
    }

    public void setCantidadDeNotificaciones(int cantidadDeNotificaciones) {
        this.cantidadDeNotificaciones = cantidadDeNotificaciones;
    }
}
