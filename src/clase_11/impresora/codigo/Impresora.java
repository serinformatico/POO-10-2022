package clase_11.impresora.codigo;

import java.util.Date;
import java.util.Objects;

public abstract class Impresora {

    // Atributos privados
    private String modelo;
    private String tipoConexion;
    private Date fechaFabricacion;
    private int hojasDisponibles;
    private double porcentajeTinta;


    // Métodos públicos definidos
    public boolean tienePapel() {
        return this.hojasDisponibles > 0;
    }

    public boolean necesitaTinta() {
        return this.porcentajeTinta <= 0.0;
    }


    // Método público abstracto (se debe definir en las subclases)
    public abstract String imprimir();


    // Métodos públicos heredados de la clase Object (redefinición)
    @Override
    public String toString() {
        return "Impresora{" +
                "modelo='"          + modelo           + ", " +
                "tipoConexion='"    + tipoConexion     + ", " +
                "fechaFabricacion=" + fechaFabricacion + ", " +
                "hojasDisponibles=" + hojasDisponibles + ", " +
                "porcentajeTinta="  + porcentajeTinta  + "}";
    }

    @Override
    public boolean equals(Object obj) {
        // Verifica que obj no es nulo y que es una clase del tipo socio
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        } else {
            // realiza un casting de obj
            Impresora socio = (Impresora) obj;
            // Determina la igualdad de los objetos por medio del código de socio
            return socio.getModelo() == this.getModelo();
        }
    }

    @Override
    public int hashCode() {
        // Retorna la redefinición de un código hash único
        return Objects.hash(modelo, tipoConexion, fechaFabricacion, hojasDisponibles, porcentajeTinta);
    }


    // Getters
    public String getModelo() {
        return modelo;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public int getHojasDisponibles() {
        return hojasDisponibles;
    }

    public double getPorcentajeTinta() {
        return porcentajeTinta;
    }


    // Setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public void setHojasDisponibles(int hojasDisponibles) {
        this.hojasDisponibles = hojasDisponibles;
    }

    public void setPorcentajeTinta(double porcentajeTinta) {
        this.porcentajeTinta = porcentajeTinta;
    }
}
