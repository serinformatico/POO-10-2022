package clase_14_pre_evaluacion.actividad_en_vivo.codigo;

public class DemoUniversidad {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Juan", "Pérez", 123456);
        Estudiante estudiante2 = new Estudiante("Lorena", "Méndez", 125487);


        ExamenParcial parcial1 = new ExamenParcial("Parcial de POO", "POO aplicado a Java", estudiante1);
        parcial1.setNumeroDeUnidadATomar(2);
        parcial1.setNota(4.5);
        ExamenFinal final1 = new ExamenFinal("Final de POO", "Patrones de diseño", estudiante1);
        final1.setDescripcionDelTemaDado("Composite pattern");
        final1.setNota(3.5);
        final1.setNotaOral(7.5);
        estudiante1.setExamenes(new Examen[]{ parcial1, final1 });

        System.out.println("\nESTUDIANTE 1:");
        System.out.println("Nota de examen parcial: " + parcial1.getNota());
        System.out.println("¿Está aprobado el examen parcial?: " + parcial1.consultarEstadoDeAprobacion());
        System.out.println("Nota de examen escrito final: " + final1.getNota());
        System.out.println("Nota de examen oral final: " + final1.getNotaOral());
        System.out.println("¿Está aprobado el examen final?: " + final1.consultarEstadoDeAprobacion());


        ExamenParcial parcial2 = parcial1.clone();
        parcial2.setEstudiante(estudiante2);
        parcial2.setNumeroDeUnidadATomar(2);
        parcial2.setNota(8.9);
        ExamenFinal final2 = new ExamenFinal("Final de POO", "Patrones de diseño", estudiante1);
        final2.setDescripcionDelTemaDado("Composite pattern");
        final2.setNota(9.5);
        final2.setNotaOral(8.5);
        estudiante1.setExamenes(new Examen[]{ parcial2, final2 });

        System.out.println("\nESTUDIANTE 2:");
        System.out.println("Nota de examen parcial: " + parcial2.getNota());
        System.out.println("¿Está aprobado el examen parcial?: " + parcial2.consultarEstadoDeAprobacion());
        System.out.println("Nota de examen escrito final: " + final2.getNota());
        System.out.println("Nota de examen oral final: " + final2.getNotaOral());
        System.out.println("¿Está aprobado el examen final?: " + final2.consultarEstadoDeAprobacion());


        System.out.println("\nComparación de notas finales:");
        System.out.println("¿Quien tienen nota mas alta?\n   1. estudiante1\n   -1. estudiante2\n   0. ambos tienen la misma nota");
        System.out.println("   Resultado de comparación: " + final1.compareTo(final2));

        System.out.println("\ninstanceof:");
        System.out.println(parcial2 instanceof Examen);
        System.out.println(final2 instanceof Examen);
    }
}
