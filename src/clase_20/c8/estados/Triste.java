package clase_20.c8.estados;

import clase_20.c8.Tamagotchi;
import clase_20.c8.TamagotchiState;

public class Triste implements TamagotchiState {

    private String nombreDelEstado = "feliz";
    private Tamagotchi tamagotchi;

    public Triste(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

    @Override
    public void beber() {
        System.out.println("glu glu glu beep beep beep titilando... (estaba triste y sigo triste)");
    }

    @Override
    public void comer() {
        System.out.println("ñom ñom ñom beep beep hugoooooo (estaba triste y sigo triste)");
    }

    @Override
    public void mimar() {
        System.out.println("mimando... (estaba triste y ahora estoy feliz)");
        this.tamagotchi.setEstado(new Feliz(tamagotchi));
    }
}
