package clase_14_pre_evaluacion.actividad_de_mesa.codigo;

public class DemoEmbarcacion {
    public static void main(String[] args) {

        Capitan juan   = new Capitan("Juan","Pérez", 6548);
        Capitan miguel = new Capitan("Miguel","Medina", 4478);

        Yate yateDeJuan   = new Yate(2022, 20, 5000250, 250000, juan);
        Yate yateDeMiguel = new Yate(2018, 30, 7100750, 325000, miguel);

        yateDeJuan.setCantidadDeCamarotes(4);
        yateDeMiguel.setCantidadDeCamarotes(6);

        if (yateDeJuan.compareTo(yateDeMiguel) == 1){
            System.out.println("El Yate de Juan tiene más cantidad de camarotes que el Yate de Miguel");
        } else if (yateDeJuan.compareTo(yateDeMiguel) == -1) {
            System.out.println("El Yate de Miguel tiene más cantidad de camarotes que el Yate de Juan");
        } else {
            System.out.println("Ambos Yates, tienen la misma cantidad de camarotes");
        }

        Velero veleroDeMiguel = new Velero(2021, 25, 6250500, 275000, miguel);
        veleroDeMiguel.setCantidadDeMastiles(3);

        if (veleroDeMiguel.evaluarSiEsUnVeleroGrande()) {
            System.out.println("Es un velero es grande");
        } else {
            System.out.println("Es un velero es chico");
        }

        System.out.println("Monto de alquiler del Velero de Miguel $" + veleroDeMiguel.obtenerMontoDeAlquiler());
    }
}
