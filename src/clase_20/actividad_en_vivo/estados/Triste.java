package clase_20.actividad_en_vivo.estados;

import clase_20.actividad_en_vivo.*;

public class Triste implements TamagotchiState {

    // Atributo privado
    private String nombreDelEstado;
    private Tamagotchi tamagotchi;

    // Constructor
    public Triste(Tamagotchi tamagotchi) {
        this.tamagotchi      = tamagotchi;
        this.nombreDelEstado = "triste";
    }

    // Métodos obligatorios
    @Override
    public void comer() {
        System.out.println("Display: beep, beep, hugooooooooooooo!!! (sigo " + this.nombreDelEstado + ")");
    }

    @Override
    public void beber() {
        System.out.println("Display: beep, beep, beep, titilando... (sigo " + this.nombreDelEstado + ")");
    }

    @Override
    public void mimar() {
        System.out.println("Display: mimando... (estoy " + this.nombreDelEstado + " y me puse feliz)");
        this.tamagotchi.setEstado(new Feliz(tamagotchi));
    }
}
