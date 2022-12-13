package clase_20.actividad_en_vivo;

import clase_20.actividad_en_vivo.estados.*;

public class Tamagotchi {

    // Atributos privados
    private String nombre;
    private TamagotchiState estado;

    // Constructor
    public Tamagotchi(String nombre) {
        this.nombre = nombre;
        this.estado = new Hambriento(this);
    }

    // Métodos puentes
    public void comer() {
        estado.comer();
    }

    public void beber() {
        estado.beber();
    }

    public void mimar() {
        estado.mimar();
    }

    // Getters & Setters
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
