package clase_22_es_pre_evaluacion.actividad_de_mesa;

import clase_22_es_pre_evaluacion.actividad_de_mesa.unidades.*;

public class DemoEmpresa {
    public static void main(String[] args) {

        UnidadDeTrabajoFactoryMethodSingleton fabrica = UnidadDeTrabajoFactoryMethodSingleton.obtenerInstancia();

        System.out.println("\nMantenimiento:");
        UnidadDeTrabajoSimple mantenimiento = (UnidadDeTrabajoSimple) fabrica.crearUnidadDeTrabajo("SIMPLE");
        mantenimiento.setNombre("Mantenimiento");
        mantenimiento.setCantidadDePersonas(4);
        mantenimiento.setMontoPorPersona(12000);
        System.out.println(mantenimiento.mostrarComponentes());

        System.out.println("\nLimpieza:");
        UnidadDeTrabajoSimple limpieza = (UnidadDeTrabajoSimple) fabrica.crearUnidadDeTrabajo("SIMPLE");
        limpieza.setNombre("limpieza");
        limpieza.setCantidadDePersonas(24);
        limpieza.setMontoPorPersona(10000);
        System.out.println(limpieza.mostrarComponentes());

        System.out.println("\nServicios Generales:");
        UnidadDeTrabajoCombinadaComposite serviciosGenerales = (UnidadDeTrabajoCombinadaComposite) fabrica.crearUnidadDeTrabajo("COMBINADA");
        serviciosGenerales.setNombre("Servicios Generales");
        serviciosGenerales.setCoeficienteGlobal(3.0);
        serviciosGenerales.agregarUnidadDeTrabajo(mantenimiento);
        serviciosGenerales.agregarUnidadDeTrabajo(limpieza);
        System.out.println(serviciosGenerales.mostrarComponentes());
    }
}
