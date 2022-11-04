package clase_09.calefaccion.codigo;

public class Estufa {

    // Atributos privados
    private int cantidadDeQuemadores;
    private int caloriasPorQuemador;

    // Construcción
    public Estufa(int cantidadDeQuemadores, int caloriasPorQuemador) {
        this.cantidadDeQuemadores = cantidadDeQuemadores;
        this.caloriasPorQuemador  = caloriasPorQuemador;
    }

     // Getters
    public int getCantidadDeQuemadores() {
        return this.cantidadDeQuemadores;
    }

    public int getCaloriasPorQuemador() {
        return this.caloriasPorQuemador;
    }

    // Setters
    public void setCantidadDeQuemadores(int cantidadDeQuemadores) {
        this.cantidadDeQuemadores = cantidadDeQuemadores;
    }

    public void setCaloriasPorQuemador(int caloriasPorQuemador) {
        this.caloriasPorQuemador = caloriasPorQuemador;
    }
}