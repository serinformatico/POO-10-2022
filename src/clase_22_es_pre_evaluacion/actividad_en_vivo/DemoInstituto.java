package clase_22_es_pre_evaluacion.actividad_en_vivo;

import clase_22_es_pre_evaluacion.actividad_en_vivo.ofertas.*;

public class DemoInstituto {
    public static void main(String[] args) {

        OfertaAcademicaFactoryMethodSingleton creador = OfertaAcademicaFactoryMethodSingleton.obtenerInstancia();

        Curso frontEnd = (Curso) creador.crearOfertaAcademica("CURSO");
        frontEnd.setNombre("Front End");
        frontEnd.setCantidadDeMeses(2);
        frontEnd.setCargaHorariaMensual(20);
        frontEnd.setValorDeHora(900.0);

        Curso backend = (Curso) creador.crearOfertaAcademica("CURSO");
        backend.setNombre("Back End");
        backend.setCantidadDeMeses(2);
        backend.setCargaHorariaMensual(16);
        backend.setValorDeHora(1000.0);

        CarreraComposite fullStack = (CarreraComposite) creador.crearOfertaAcademica("CARRERA");
        fullStack.setNombre("Full Stack");
        fullStack.setPorcentajeDeBonificacion(20.0);
        fullStack.agregarOfertaAcademica(frontEnd);
        fullStack.agregarOfertaAcademica(backend);

        Instituto instituto = new Instituto();
        instituto.agregarOfertaAcademica(frontEnd);
        instituto.agregarOfertaAcademica(backend);
        instituto.agregarOfertaAcademica(fullStack);
        instituto.generarInforme();
    }
}
