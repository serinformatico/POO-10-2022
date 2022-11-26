package clase_17.actividad_de_mesa;

import java.time.LocalDate;

public class Paciente {

    // Atributos privados
    String nombre;
    String apellido;
    String historiaClinica;
    LocalDate fechaDeInternacion;
    LocalDate fechaDeAlta;

    // Constructor
    public Paciente(String nombre, String apellido, String historiaClinica) {
        this.nombre             = nombre;
        this.apellido           = apellido;
        this.historiaClinica    = historiaClinica;
    }

    public void internar(LocalDate fechaDeInternacion) throws FechaException {
        if (!fechaDeInternacion.equals(LocalDate.now())) {
            throw new FechaException("No se puede realizar la internación");
        }

        this.fechaDeInternacion = fechaDeInternacion;
        System.out.println("Se ha realizado correctamente la internación (" + fechaDeInternacion.getDayOfMonth() + "-" + fechaDeInternacion.getMonthValue() + "-" + fechaDeInternacion.getYear() + ")");
    }

    public void darDeAlta(LocalDate fechaDeAlta) throws FechaException {
        if (fechaDeAlta.isBefore(this.fechaDeInternacion)) {
            throw new FechaException("No se puede generar el alta");
        }

        this.fechaDeAlta = fechaDeAlta;
        System.out.println("Se ha generado correctamente el alta (" + fechaDeAlta.getDayOfMonth() + "-" + fechaDeAlta.getMonthValue() + "-" + fechaDeAlta.getYear() + ")");
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

    public LocalDate getFechaDeInternacion() {
        return fechaDeInternacion;
    }

    public LocalDate getFechaDeAlta() {
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

    public void setFechaDeInternacion(LocalDate fechaDeInternacion) {
        this.fechaDeInternacion = fechaDeInternacion;
    }

    public void setFechaDeAlta(LocalDate fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }
}
