package clase_16.actividad_de_mesa.codigo;

import java.util.Collections;

public class DemoPuerto {
    public static void main(String[] args) {

        Puerto puerto = new Puerto();
        puerto.permitirEntradaDeContenedor(new Contenedor(3,"Desconocida", true));
        puerto.permitirEntradaDeContenedor(new Contenedor(1,"Argentina", false));
        puerto.permitirEntradaDeContenedor(new Contenedor(4,"China", true));
        puerto.permitirEntradaDeContenedor(new Contenedor(2,"Desconocida", false));
        puerto.permitirEntradaDeContenedor(new Contenedor(5,"Desconocida", true));

        System.out.println("\nCONTENEDORES");
        puerto.mostrarContenedores();

        System.out.println("\nCANTIDAD DE CONTENEDORES PELIGROSOS");
        System.out.println(puerto.obtenerContenedoresPeligrosos());

        System.out.println("\nCONTENEDORES ORDENADOS");
        Collections.sort(puerto.getContenedores());
        puerto.mostrarContenedores();

        // Las collection tienen un método foreach
        System.out.println("\nCONTENEDORES ORDENADOS (forEach + lambda function)");
        puerto.getContenedores().forEach( (contenedor) -> System.out.println(contenedor.toString() ));

    }
}
