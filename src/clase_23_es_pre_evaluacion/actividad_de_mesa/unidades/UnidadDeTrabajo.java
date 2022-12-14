package clase_22_es_pre_evaluacion.actividad_de_mesa.unidades;

public abstract class UnidadDeTrabajo {

    private String nombre;
    private String descripcion;

    public abstract double calcularMonto();

    public abstract String mostrarComponentes();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
