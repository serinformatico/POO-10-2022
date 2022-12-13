package clase_20.c8.estados;

import clase_20.c8.Tamagotchi;
import clase_20.c8.TamagotchiState;

public class Hambriento implements TamagotchiState {

    private String nombreDelEstado = "feliz";
    private Tamagotchi tamagotchi;

    public Hambriento(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

    @Override
    public void beber() {
        System.out.println("glu glu glu (estaba hambriento y ahora estoy triste)");
        this.tamagotchi.setEstado(new Triste(tamagotchi));
    }

    @Override
    public void comer() {
        System.out.println("ñom ñom ñom (estaba hambriento y ahora estoy feliz)");
        this.tamagotchi.setEstado(new Feliz(tamagotchi));
    }

    @Override
    public void mimar() {
        System.out.println("mimando... (estaba hambriento y sigo hambriento)");
    }
}
