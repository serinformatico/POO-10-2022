package clase_25.actividad_en_vivo;

public class DemoRedes {
    public static void main(String[] args) {

        Seguidor juan    = new Seguidor("Juan", "Pérez");
        Seguidor lorena  = new Seguidor("Lorena", "Páez");
        Seguidor liliana = new Seguidor("Liliana", "Ortega");

        Publicador jorge = new Publicador("Jorge", "Medina");
        jorge.agregar(juan);
        jorge.agregar(lorena);
        jorge.agregar(liliana);

        System.out.println("\nPRIMERA NOTIFICACIÓN");
        jorge.subirFoto("gato volador");

        System.out.println("\nSEGUNDA NOTIFICACIÓN");
        jorge.subirFoto("perrito malvado");

        System.out.println("\nTERCERA NOTIFICACIÓN");
        jorge.eliminar(liliana);
        jorge.subirFoto("la scaloneta");

        System.out.println("\nCANTIDAD DE NOTIFICACIONES");
        System.out.println("Juan: " + juan.getCantidadDeNotificaciones());
        System.out.println("Lorena: " + lorena.getCantidadDeNotificaciones());
        System.out.println("Liliana: " + liliana.getCantidadDeNotificaciones());
    }
}
