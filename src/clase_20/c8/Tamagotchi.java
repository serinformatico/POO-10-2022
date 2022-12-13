package clase_20.c8;

import clase_20.c8.estados.Hambriento;

public class Tamagotchi {

    private String nombre;
    private TamagotchiState estado;

    public Tamagotchi(String nombre) {
        this.nombre = nombre;
        this.estado = new Hambriento(this);
    }

    public void beber() {
        this.estado.beber();
    }

    public void comer() {
        this.estado.comer();
    }

    public void mimar() {
        this.estado.mimar();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TamagotchiState getEstado() {
        return estado;
    }

    public void setEstado(TamagotchiState estado) {
        this.estado = estado;
    }
}
