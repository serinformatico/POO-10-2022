package clase_20.c8.estados;

import clase_20.c8.Tamagotchi;
import clase_20.c8.TamagotchiState;

public class Sediento implements TamagotchiState {

    private String nombreDelEstado = "sediento";
    private Tamagotchi tamagotchi;

    public Sediento(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

    @Override
    public void beber() {
        System.out.println("glu glu glu (estaba sediento y ahora estoy feliz)");
        this.tamagotchi.setEstado(new Feliz(tamagotchi));
    }

    @Override
    public void comer() {
        System.out.println("ñom ñom ñom (estaba sediento y ahora estoy triste)");
        this.tamagotchi.setEstado(new Triste(tamagotchi));
    }

    @Override
    public void mimar() {
        System.out.println("mimando... (estaba sediento y sigo sediento)");
    }
}
