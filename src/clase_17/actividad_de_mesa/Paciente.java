package clase_17.actividad_de_mesa;

import java.util.Date;

public class Paciente {

    // Atributos privados
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaDeInternacion;
    Date fechaDeAlta;

    // Constructor
    public Paciente(String nombre, String apellido, String historiaClinica) {
        this.nombre             = nombre;
        this.apellido           = apellido;
        this.historiaClinica    = historiaClinica;
    }

    public void internar(Date fechaDeInternacion) throws FechaException {
        if (fechaDeInternacion.after(new Date())) {
            this.fechaDeInternacion = fechaDeInternacion;
            System.out.println("Se ha realizado correctamente la internación (" + fechaDeAlta.getDay() + "-" + fechaDeAlta.getMonth() + "-" + fechaDeAlta.getYear() + ")");
        } else {
            throw new FechaException("No se puede realizar la internación");
        }
    }

    public void darDeAlta(Date fechaDeAlta) throws FechaException {
        if (this.fechaDeInternacion.before(fechaDeAlta)) {
            System.out.println("Se ha generado correctamente el alta (" + fechaDeAlta.getDay() + "-" + fechaDeAlta.getMonth() + "-" + fechaDeAlta.getYear() + ")");
        } else {
            throw new FechaException("No se puede generar el alta");
        }
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getHistoriaClinica() {
        return historiaClinica;
    }

    public Date getFechaDeInternacion() {
        return fechaDeInternacion;
    }

    public Date getFechaDeAlta() {
        return fechaDeAlta;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setHistoriaClinica(String historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public void setFechaDeInternacion(Date fechaDeInternacion) {
        this.fechaDeInternacion = fechaDeInternacion;
    }

    public void setFechaDeAlta(Date fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }
}
