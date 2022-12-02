package clase_20_es_22.actividad_de_mesa.figuras;

public class Circulo extends Figura {

    private double radio;

    @Override
    public double calcularSuperficie() {

        return this.radio*this.radio*Math.PI;

    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}

