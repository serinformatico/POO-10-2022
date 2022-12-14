package clase_20_es_22.actividad_de_mesa.figuras;

public class Triangulo extends Figura{

    private double base;
    private double altura;

    @Override
    public double calcularSuperficie() {

        return (this.altura*this.base)/2;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
