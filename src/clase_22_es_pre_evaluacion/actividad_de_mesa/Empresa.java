package clase_22_es_pre_evaluacion.actividad_de_mesa;

import clase_22_es_pre_evaluacion.actividad_de_mesa.unidades.UnidadDeTrabajo;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<UnidadDeTrabajo> unidadesDeTrabajo = new ArrayList();

    public void agregarUnidadDeTrabajo(UnidadDeTrabajo unidad){
        this.unidadesDeTrabajo.add(unidad);
    }

    public void quitarUnidadDeTrabajo(UnidadDeTrabajo unidad){
        this.unidadesDeTrabajo.remove(unidad);
    }
}