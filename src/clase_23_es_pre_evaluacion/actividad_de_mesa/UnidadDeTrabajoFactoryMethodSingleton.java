package clase_22_es_pre_evaluacion.actividad_de_mesa;

import clase_22_es_pre_evaluacion.actividad_de_mesa.unidades.*;

public class UnidadDeTrabajoFactoryMethodSingleton {

    private static UnidadDeTrabajoFactoryMethodSingleton instancia;

    private UnidadDeTrabajoFactoryMethodSingleton() {}

    public static UnidadDeTrabajoFactoryMethodSingleton obtenerInstancia(){
        if (UnidadDeTrabajoFactoryMethodSingleton.instancia == null){
            UnidadDeTrabajoFactoryMethodSingleton.instancia = new UnidadDeTrabajoFactoryMethodSingleton();
        }

        return UnidadDeTrabajoFactoryMethodSingleton.instancia;
    }

    public UnidadDeTrabajo crearUnidadDeTrabajo (String tipo){
        switch (tipo.toUpperCase()){
            case "SIMPLE":
                return new UnidadDeTrabajoSimple();
            case "COMBINADA" :
                return new UnidadDeTrabajoCombinadaComposite();
        }

        return null;
    }
}
