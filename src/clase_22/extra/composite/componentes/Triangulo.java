package clase_22.extra.composite.componentes;

public class Triangulo implements Grafico {

    // Atributos privados
    private double altura;
    private double base;

    // Métodos públicos (se cumple con el contrato de la interfaz)
    public void graficar() {
        System.out.println("Se ha graficado un triángulo de altura " + this.altura + " y base " + this.base);
    }

    public void colorear(String color) {
        System.out.println("Se ha coloreado el triángulo con " + color);
    }

    // Getter & Setter
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
