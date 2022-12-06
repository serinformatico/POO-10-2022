package clase_22_es_pre_evaluacion.actividad_en_vivo.ofertas;

import java.util.ArrayList;

public class CarreraComposite extends OfertaAcademica {

    private ArrayList<OfertaAcademica> ofertasAcademicas = new ArrayList();
    private double porcentajeDeBonificacion;

    public void agregarOfertaAcademica(OfertaAcademica oferta) {
        this.ofertasAcademicas.add(oferta);
    }

    public void quitarOfertaAcademica(OfertaAcademica oferta) {
        this.ofertasAcademicas.remove(oferta);
    }

    @Override
    public double calcularPrecio() {
        double precioDeCarrera = 0.0;

        for (OfertaAcademica oferta : this.ofertasAcademicas) {
            precioDeCarrera += oferta.calcularPrecio();
        }

        return precioDeCarrera - (precioDeCarrera / 100 * this.porcentajeDeBonificacion);
    }

    public ArrayList<OfertaAcademica> getOfertasAcademicas() {
        return ofertasAcademicas;
    }

    public double getPorcentajeDeBonificacion() {
        return porcentajeDeBonificacion;
    }

    public void setPorcentajeDeBonificacion(double porcentajeDeBonificacion) {
        this.porcentajeDeBonificacion = porcentajeDeBonificacion;
    }
}
