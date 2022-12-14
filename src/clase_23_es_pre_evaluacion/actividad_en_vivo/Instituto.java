package clase_22_es_pre_evaluacion.actividad_en_vivo;

import clase_22_es_pre_evaluacion.actividad_en_vivo.ofertas.*;

import java.util.ArrayList;

public class Instituto {

    private ArrayList<OfertaAcademica> ofertasAcademicas = new ArrayList();

    public void agregarOfertaAcademica(OfertaAcademica oferta) {
        this.ofertasAcademicas.add(oferta);
    }

    public void quitarOfertaAcademica(OfertaAcademica oferta) {
        this.ofertasAcademicas.remove(oferta);
    }

    public void generarInforme() {
        for (OfertaAcademica oferta : this.ofertasAcademicas) {
            System.out.println("Oferta: " + oferta.getNombre() + " precio: $" + oferta.calcularPrecio());
        }
    }

    public ArrayList<OfertaAcademica> getOfertasAcademicas() {
        return ofertasAcademicas;
    }
}
