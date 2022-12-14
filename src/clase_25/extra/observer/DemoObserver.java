package clase_25.extra.observer;

import clase_25.extra.observer.suscriptores.*;

public class DemoObserver {
    public static void main(String[] args) {

        SuscriptorYoutube juana   = new SuscriptorYoutube("Juana", "Pérez");
        SuscriptorYoutube pedro   = new SuscriptorYoutube("Pedro", "Páez");
        SuscriptorYoutube mariana = new SuscriptorYoutube("Mariana", "Ortega");

        SuscriptorVimeo pablo  = new SuscriptorVimeo("Pablo A. Rivero");
        SuscriptorVimeo leonel = new SuscriptorVimeo("Leonel M. Medina");

        Canal TodoPOO = new Canal("Todo POO");
        TodoPOO.suscribir(juana);
        TodoPOO.suscribir(pedro);
        TodoPOO.suscribir(mariana);
        TodoPOO.suscribir(pablo);
        TodoPOO.suscribir(leonel);

        System.out.println("\nPRIMERA NOTIFICACIÓN");
        TodoPOO.subirVideo("Aprendiendo el patrón State");

        System.out.println("\nSEGUNDA NOTIFICACIÓN");
        TodoPOO.desuscribir(juana);
        TodoPOO.subirVideo("Aprendiendo el patrón Observer");

        System.out.println("\nTERCERA NOTIFICACIÓN");
        TodoPOO.desuscribir(pablo);
        TodoPOO.subirVideo("Aprendiendo el patrón Strategy");
    }
}
