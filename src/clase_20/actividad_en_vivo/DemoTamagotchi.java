package clase_20.actividad_en_vivo;

import clase_20.actividad_en_vivo.estados.*;

public class DemoTamagotchi {
    public static void main(String[] args) {

        Tamagotchi hugo = new Tamagotchi("Hugo");

        System.out.println("\nPRUEBA: Comer");
        hugo.comer();
        hugo.comer();
        hugo.comer();
        hugo.comer();

        System.out.println("\nPRUEBA: Beber");
        hugo.setEstado(new Sediento(hugo));
        hugo.beber();
        hugo.beber();
        hugo.beber();
        hugo.beber();

        System.out.println("\nPRUEBA: Mimar");
        hugo.setEstado(new Triste(hugo));
        hugo.mimar();
        hugo.mimar();
        hugo.setEstado(new Hambriento(hugo));
        hugo.mimar();
        hugo.setEstado(new Sediento(hugo));
        hugo.mimar();
    }
}
