package clase_20.c8.estados;

import clase_20.c8.Tamagotchi;
import clase_20.c8.TamagotchiState;

public class Feliz implements TamagotchiState {

    private String nombreDelEstado = "feliz";
    private Tamagotchi tamagotchi;

    public Feliz(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

    @Override
    public void beber() {
        System.out.println("glu glu glu (estaba feliz y ahora estoy hambriento)");
        this.tamagotchi.setEstado(new Hambriento(tamagotchi));
    }

    @Override
    public void comer() {
        System.out.println("ñom ñom ñom (estaba feliz y ahora estoy sediento)");
        this.tamagotchi.setEstado(new Sediento(tamagotchi));
    }

    @Override
    public void mimar() {
        System.out.println("mimando... (estaba feliz y sigo feliz)");
    }
}
