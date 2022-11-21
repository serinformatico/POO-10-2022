package clase_16.actividad_en_vivo.codigo;

import java.util.Comparator;

public class Jugador implements Comparable<Jugador>, Comparator<Jugador> {
    
    // Atributos privados
    private int numeroDeCamiseta;
    private String nombre;
    private boolean estaLesionado;
    private boolean esTitular;

    // Getters
    public int getNumeroDeCamiseta() {
        return this.numeroDeCamiseta;
    }

    public String getNombre() {
        return this.nombre;
    }

    public boolean getEstaLesionado() {
        return this.estaLesionado;
    }

    public boolean getEsTitular() {
        return this.esTitular;
    }

    // Setters
    public void setNumeroDeCamiseta(int numeroDeCamiseta) {
        this.numeroDeCamiseta = numeroDeCamiseta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstaLesionado(boolean estaLesionado) {
        this.estaLesionado = estaLesionado;
    }

    public void setEsTitular(boolean esTitular) {
        this.esTitular = esTitular;
    }

    @Override
    public String toString() {
        return "Jugador = " + "número de camiseta: " + this.numeroDeCamiseta + ", nombre: '" + this.nombre + ", está lesionado: " + this.estaLesionado +", es titular: " + this.esTitular;
    }

    @Override
    public int compareTo(Jugador jugador) {
        if (this.getNumeroDeCamiseta() < jugador.getNumeroDeCamiseta()) {
            return -1;
        } else if (this.getNumeroDeCamiseta() > jugador.getNumeroDeCamiseta()) {
            return 1;
        }

        return 0;
    }

    @Override
    public int compare(Jugador jugador1, Jugador jugador2) {
        return jugador1.compareTo(jugador2);
    }
}
