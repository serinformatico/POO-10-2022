package clase_06.impresora.codigo;

import java.util.Date;

public class Impresora {

    // Atributos o propiedades
    private String modelo;
    private String tipoConexion;
    private Date fechaFabricacion;
    private Integer hojasDisponibles = 0;


    // Constructor 1
    public Impresora(String modelo, String tipoConexion, Date fechaFabricacion) {
        this.modelo           = modelo;
        this.tipoConexion     = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
    }

    // Constructor 2
    public Impresora(String modelo, String tipoConexion) {
        this.modelo       = modelo;
        this.tipoConexion = tipoConexion;
    }


    // Método privado
    private boolean tienePapelSuficiente(int cantidadDeHojas) {
        return (hojasDisponibles >= cantidadDeHojas);
    }


    // Métodos públicos
    public void imprimir(String texto, int cantidadDeHojas) {
        if (this.tienePapelSuficiente(cantidadDeHojas)) {
            System.out.println("Imprimiendo...");
        } else {
            System.out.println("Falta papel...");
        }
    }


    // Métodos getters
    public String getModelo() {
        return modelo;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public Integer getHojasDisponibles() {
        return hojasDisponibles;
    }


    // Métodos getters y setters
    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public void setHojasDisponibles(Integer hojasDisponibles) {
        this.hojasDisponibles = hojasDisponibles;
    }
}
