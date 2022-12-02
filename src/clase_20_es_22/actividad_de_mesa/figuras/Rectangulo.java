package clase_20_es_22.actividad_de_mesa.figuras;

public class Rectangulo extends Figura{

    private double altura;
    private double largo;


    @Override
    public double calcularSuperficie() {

        return this.altura*this.largo;
    }

    public Rectangulo(double altura, double largo) {
        this.altura = altura;
        this.largo = largo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
}
