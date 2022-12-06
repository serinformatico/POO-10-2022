package clase_22_es_pre_evaluacion.actividad_en_vivo;

import clase_22_es_pre_evaluacion.actividad_en_vivo.ofertas.*;

public class OfertaAcademicaFactoryMethodSingleton {

    private static OfertaAcademicaFactoryMethodSingleton instancia;

    private OfertaAcademicaFactoryMethodSingleton() {}

    public static OfertaAcademicaFactoryMethodSingleton obtenerInstancia() {
        if (OfertaAcademicaFactoryMethodSingleton.instancia == null) {
            OfertaAcademicaFactoryMethodSingleton.instancia = new OfertaAcademicaFactoryMethodSingleton();
        }

        return OfertaAcademicaFactoryMethodSingleton.instancia;
    }

    public OfertaAcademica crearOfertaAcademica(String tipo) {
        switch (tipo.toUpperCase()) {
            case "CURSO":
                return new Curso();
            case "CARRERA":
                return new CarreraComposite();
        }

        return null;
    }
}
