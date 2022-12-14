package clase_20_es_22.extra.composite.componentes;

public class Circulo implements Grafico {

    // Atributo privado
    private double radio;

    // Métodos públicos (se cumple con el contrato de la interfaz)
    public void graficar() {
        System.out.println("Se ha graficado un círculo de radio " + this.radio);
    }

    public void colorear(String color) {
        System.out.println("Se ha coloreado el círculo con " + color);
    }

    // Getter & Setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
