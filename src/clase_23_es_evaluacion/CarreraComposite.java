package clase_23_es_evaluacion;

import java.util.ArrayList;

public class CarreraComposite extends  OfertaAcademica {

    private ArrayList<OfertaAcademica> ofertasAcademicas = new ArrayList();
    private double porcentajedeBonificacion;

    public double calcularPrecio() {
        double total = 0;

        for (OfertaAcademica o : this.ofertasAcademicas) {
            total += o.calcularPrecio();
        }

        return total - (total / 100 * this.porcentajedeBonificacion);
    }

    public void agregarOfertaAcademica(OfertaAcademica oferta) {
        this.ofertasAcademicas.add(oferta);
    }

    public void quitarOfertaAcademica(OfertaAcademica oferta) {
        this.ofertasAcademicas.remove(oferta);
    }

    public ArrayList<OfertaAcademica> getOfertasAcademicas() {
        return ofertasAcademicas;
    }

    public void setOfertasAcademicas(ArrayList<OfertaAcademica> ofertasAcademicas) {
        this.ofertasAcademicas = ofertasAcademicas;
    }

    public double getPorcentajedeBonificacion() {
        return porcentajedeBonificacion;
    }

    public void setPorcentajedeBonificacion(double porcentajedeBonificacion) {
        this.porcentajedeBonificacion = porcentajedeBonificacion;
    }
}
