package clase_10.gimnasio.codigo;

import java.util.Objects;

public class SocioPileta extends Socio{

    // Atributos protegidos
    private String revisionMedica;
    private boolean estaHabilitado;
    private Pileta pileta;


    // Constructores (sobrecarga)
    public SocioPileta(String codigo, String nombre, String apellido) {
        super(codigo, nombre, apellido);
        this.pileta         = new Pileta(750.00);

    }

    public SocioPileta(String codigo, String nombre, String apellido, String revisionMedica, Pileta pileta) {
        super(codigo, nombre, apellido);
        this.revisionMedica = revisionMedica;
        this.pileta         = pileta;
    }


    // Método público definido
    public void habilitarSocio(String revisionMedica) {
        if (revisionMedica != null) {
            this.revisionMedica = revisionMedica;
            this.estaHabilitado = true;
        } else {
            this.estaHabilitado = false;
        }
    }


    // Método público redefinido
    @Override
    public double calcularCostoMensual() {
        return (this.costoFijoMensual + this.pileta.getCostoMensual());
    }


    // Métodos públicos heredados de la clase Object (redefinición)
    @Override
    public String toString() {
        return  super.toString() + ", " +
                "revisión médica: " + this.revisionMedica + ", " +
                "habilitado: "      + this.estaHabilitado + ", " +
                "costo extra: $"    + this.pileta.getCostoMensual();
    }

    @Override
    public boolean equals(Object obj) {
        // Verifica que obj no es nulo y que es una clase del tipo socio
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        } else {
            // realiza un casting de obj
            SocioPileta socio = (SocioPileta) obj;
            // Determina la igualdad de los objetos por medio del código de socio
            return socio.getCodigo() == this.getCodigo();
        }
    }

    @Override
    public int hashCode() {
        // Retorna la redefinición de un código hash único
        return Objects.hash(super.hashCode(), revisionMedica, estaHabilitado, pileta);
    }


    // Getters
    public String getRevisionMedica() {
        return this.revisionMedica;
    }

    public boolean isEstaHabilitado() {
        return this.estaHabilitado;
    }

    public Pileta getPileta() {
        return this.pileta;
    }


    // Setters
    public void setRevisionMedica(String revisionMedica) {
        this.revisionMedica = revisionMedica;
    }

    public void setEstaHabilitado(boolean estaHabilitado) {
        this.estaHabilitado = estaHabilitado;
    }

    public void setPileta(Pileta pileta) {
        this.pileta = pileta;
    }
}
