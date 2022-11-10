package clase_10.gimnasio.codigo;

import java.util.Objects;

public class Socio {

    // Atributos protegidos
    protected String codigo;
    protected String nombre;
    protected String apellido;

    protected double costoFijoMensual   = 1000.0;
    protected boolean estaPagadaLaCuota = false;


    // Constructores (sobrecarga)
    public Socio(String codigo, String nombre, String apellido) {
        this.codigo   = codigo;
        this.nombre   = nombre;
        this.apellido = apellido;
    }

    public Socio(String codigo, String nombre, String apellido, boolean estaPagadaLaCuota) {
        this.codigo   = codigo;
        this.nombre   = nombre;
        this.apellido = apellido;
        this.estaPagadaLaCuota = estaPagadaLaCuota;
    }


    // Método público definido
    public double calcularCostoMensual() {
        return this.costoFijoMensual;
    }


    // Método público sobrecargado
    public boolean pagarCostoMensual(double monto) {
        if (this.costoFijoMensual == monto) {
            this.estaPagadaLaCuota = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean pagarCostoMensual(double monto, double porcentajeDeDescuento) {
        return (this.costoFijoMensual == (monto + (this.costoFijoMensual / 100 * porcentajeDeDescuento)));
    }


    // Métodos públicos heredados de la clase Object (redefinición)
    @Override
    public String toString() {
        return  "código: "         + this.codigo + ", " +
                "nombre: "         + this.nombre + ", " +
                "apellido: "       + this.apellido + ", " +
                "cuota mensual: $" + this.costoFijoMensual + ", " +
                "cuota pagada: "   + this.estaPagadaLaCuota;
    }

    @Override
    public boolean equals(Object obj) {
        // Verifica que obj no es nulo y que es una clase del tipo socio
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        } else {
            // realiza un casting de obj
            Socio socio = (Socio) obj;
            // Determina la igualdad de los objetos por medio del código de socio
            return socio.getCodigo() == this.getCodigo();
        }
    }

    @Override
    public int hashCode() {
        // Retorna la redefinición de un código hash único
        return Objects.hash(codigo, nombre, apellido, costoFijoMensual, estaPagadaLaCuota);
    }


    // Getters
    public String getCodigo() {
        return this.codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public double getCostoFijoMensual() {
        return this.costoFijoMensual;
    }

    public boolean getEstaPagadaLaCuota() {
        return this.estaPagadaLaCuota;
    }


    // Setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
