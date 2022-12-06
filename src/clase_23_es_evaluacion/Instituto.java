package clase_23_es_evaluacion;

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
            System.out.println("oferta: " + oferta.getNombre() + "precio: " + oferta.calcularPrecio());
        }
    }


    public ArrayList<OfertaAcademica> getOfertasAcademicas() {
        return ofertasAcademicas;
    }

    public void setOfertasAcademicas(ArrayList<OfertaAcademica> ofertasAcademicas) {
        this.ofertasAcademicas = ofertasAcademicas;
    }
}
