package clase_22_es_pre_evaluacion.actividad_de_mesa.unidades;

import java.util.ArrayList;

public class UnidadDeTrabajoCombinadaComposite extends UnidadDeTrabajo {

    private ArrayList <UnidadDeTrabajo> unidadesDeTrabajo = new ArrayList();
    private double coeficienteGlobal;
    private double montoDeMaterial;

    public void agregarUnidadDeTrabajo(UnidadDeTrabajo unidad) {
        this.unidadesDeTrabajo.add(unidad);
    }

    public void quitarUnidadDeTrabajo(UnidadDeTrabajo unidad) {
        this.unidadesDeTrabajo.remove(unidad);
    }

    @Override
    public double calcularMonto() {
        double monto = 0.0;

        for (UnidadDeTrabajo unidad : this.unidadesDeTrabajo) {
            monto += unidad.calcularMonto();
        }

        return monto * this.coeficienteGlobal;
    }

    @Override
    public String mostrarComponentes() {
        String componente = "";

        for (UnidadDeTrabajo unidad : this.unidadesDeTrabajo) {
            componente += "\nNombre: " + unidad.getNombre() + " Monto: $" + unidad.calcularMonto();
        }

        return componente;
    }

    public ArrayList<UnidadDeTrabajo> getUnidadesDeTrabajo() {
        return unidadesDeTrabajo;
    }

    public double getCoeficienteGlobal() {
        return coeficienteGlobal;
    }

    public void setCoeficienteGlobal(double coeficienteGlobal) {
        this.coeficienteGlobal = coeficienteGlobal;
    }

    public double getMontoDeMaterial() {
        return montoDeMaterial;
    }

    public void setMontoDeMaterial(double montoDeMaterial) {
        this.montoDeMaterial = montoDeMaterial;
    }
}
