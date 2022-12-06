package clase_23_es_evaluacion;

public class OfertaAcademicaFactoryMethodSingleton {

    private static OfertaAcademicaFactoryMethodSingleton instancia;

    private  OfertaAcademicaFactoryMethodSingleton() {}

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

    public static OfertaAcademicaFactoryMethodSingleton getInstancia() {
        return instancia;
    }

    public static void setInstancia(OfertaAcademicaFactoryMethodSingleton instancia) {
        OfertaAcademicaFactoryMethodSingleton.instancia = instancia;
    }
}
