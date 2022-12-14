package clase_22_es_pre_evaluacion.actividad_de_mesa.unidades;

public class UnidadDeTrabajoSimple extends UnidadDeTrabajo {

    private double montoPorPersona;
    private int cantidadDePersonas;

    private final double porcentajeDeIncremento = 20.0;

    @Override
    public double calcularMonto() {
        double monto = 0.0;

        monto += this.cantidadDePersonas * this.montoPorPersona;

        if (this.cantidadDePersonas > 10){
            monto += monto / 100 * this.porcentajeDeIncremento;
        }

        return monto;
    }

    @Override
    public String mostrarComponentes() {
        return "Nombre: " + this.getNombre() + " Monto: $" + this.calcularMonto();
    }

    public double getMontoPorPersona() {
        return montoPorPersona;
    }

    public void setMontoPorPersona(double montoPorPersona) {
        this.montoPorPersona = montoPorPersona;
    }

    public int getCantidadDePersonas() {
        return cantidadDePersonas;
    }

    public void setCantidadDePersonas(int cantidadDePersonas) {
        this.cantidadDePersonas = cantidadDePersonas;
    }

    public double getPorcentajeDeIncremento() {
        return porcentajeDeIncremento;
    }
}
