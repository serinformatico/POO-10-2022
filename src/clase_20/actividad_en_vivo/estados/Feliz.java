package clase_20.actividad_en_vivo.estados;

import clase_20.actividad_en_vivo.*;

public class Feliz implements TamagotchiState {

    // Atributo privado
    private String nombreDelEstado;
    private Tamagotchi tamagotchi;

    // Constructor
    public Feliz(Tamagotchi tamagotchi) {
        this.tamagotchi      = tamagotchi;
        this.nombreDelEstado = "feliz";
    }

    // Métodos obligatorios
    @Override
    public void comer() {
        System.out.println("Display: ñom ñom ñom (estoy " + this.nombreDelEstado + " y me puse sediento)");
        this.tamagotchi.setEstado(new Sediento(tamagotchi));
    }

    @Override
    public void beber() {
        System.out.println("Display: glu glu glu (estoy " + this.nombreDelEstado + " y me puse hambriento)");
        this.tamagotchi.setEstado(new Hambriento(tamagotchi));
    }

    @Override
    public void mimar() {
        System.out.println("Display: mimando... (sigo " + this.nombreDelEstado + ")");
    }
}
