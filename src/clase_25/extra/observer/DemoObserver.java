package material_extra.clase_25.observer;

import material_extra.clase_25.observer.suscriptores.Suscriptor;
import material_extra.clase_25.observer.suscriptores.SuscriptorVimeo;
import material_extra.clase_25.observer.suscriptores.SuscriptorYoutube;

public class DemoObserver {
    public static void main(String[] args) {
        Suscriptor suscriptor1 = new SuscriptorYoutube("Alejandra", "Pereyra");
        Suscriptor suscriptor2 = new SuscriptorYoutube("Jose", "Medina");
        Suscriptor suscriptor3 = new SuscriptorYoutube("Paola", "Pérez");
        Suscriptor suscriptor4 = new SuscriptorVimeo("Pablo", "Pérez");
        Suscriptor suscriptor5 = new SuscriptorVimeo("Lorena", "Aguilar");
        Suscriptor suscriptor6 = new SuscriptorVimeo("Franco", "Soler");

        CanalPublicador canalYoutube = new CanalPublicador();
        canalYoutube.suscribir(suscriptor1);
        canalYoutube.suscribir(suscriptor2);
        canalYoutube.suscribir(suscriptor3);
        suscriptor1.suscribirAlCanal(canalYoutube);
        suscriptor2.suscribirAlCanal(canalYoutube);
        suscriptor3.suscribirAlCanal(canalYoutube);

        CanalPublicador canalVimeo = new CanalPublicador();
        canalVimeo.suscribir(suscriptor4);
        canalVimeo.suscribir(suscriptor5);
        canalVimeo.suscribir(suscriptor6);
        suscriptor4.suscribirAlCanal(canalVimeo);
        suscriptor5.suscribirAlCanal(canalVimeo);
        suscriptor6.suscribirAlCanal(canalVimeo);

        canalVimeo.desuscribir(suscriptor5);

        System.out.println("CANAL DE YOUTUBE:");
        canalYoutube.subirNuevoVideo("Curso de POO - Patron State");

        System.out.println("\nCANAL DE VIMEO:");
        canalVimeo.subirNuevoVideo("Curso de POO - Patron Observer");
    }
}
