package clase_09.calefaccion.codigo;

public class Vivienda {

    // Atributos protegidos
    protected int tamanioEnM2;
    protected int cantidadDePersonas;
    protected int caloriasPorM2;
    protected Estufa[] artefactosDeCalefaccion;
    protected double porcentajeDeAislamiento;

    // Constructor
    public Vivienda(int tamanioEnM2, int cantidadDePersonas) {
        this.tamanioEnM2        = tamanioEnM2;
        this.cantidadDePersonas = cantidadDePersonas;
    }

    // Getters
    public int getTamanioEnM2() {
        return tamanioEnM2;
    }

    public int getCantidadDePersonas() {
        return cantidadDePersonas;
    }

    public int getCaloriasPorM2() {
        return caloriasPorM2;
    }

    public Estufa[] getArtefactosDeCalefaccion() {
        return artefactosDeCalefaccion;
    }

    public double getPorcentajeDeAislamiento() {
        return porcentajeDeAislamiento;
    }

    // Setters
    public void setTamanioEnM2(int tamanioEnM2) {
        this.tamanioEnM2 = tamanioEnM2;
    }

    public void setCantidadDePersonas(int cantidadDePersonas) {
        this.cantidadDePersonas = cantidadDePersonas;
    }

    public void setCaloriasPorM2(int caloriasPorM2) {
        this.caloriasPorM2 = caloriasPorM2;
    }

    public void setArtefactosDeCalefaccion(Estufa[] artefactosDeCalefaccion) {
        this.artefactosDeCalefaccion = artefactosDeCalefaccion;
    }

    public void setPorcentajeDeAislamiento(double porcentajeDeAislamiento) {
        this.porcentajeDeAislamiento = porcentajeDeAislamiento;
    }
}
