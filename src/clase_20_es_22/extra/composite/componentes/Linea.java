package clase_20_es_22.extra.composite.componentes;

public class Linea implements Grafico {

    // Atributos privados
    private double largo;
    private double grosor;

    // Métodos públicos (se cumple con el contrato de la interfaz)
    public void graficar() {
        System.out.println("Se ha graficado una línea recta de largo " + this.largo + " y grosor " + this.grosor);
    }

    public void colorear(String color) {
        System.out.println("Se ha coloreado la línea recta con " + color);
    }

    // Getter & Setter
    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getGrosor() {
        return grosor;
    }

    public void setGrosor(double grosor) {
        this.grosor = grosor;
    }
}
