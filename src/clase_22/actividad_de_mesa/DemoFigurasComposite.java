import clase_20_es_22.actividad_de_mesa.figuras.Circulo;
import clase_20_es_22.actividad_de_mesa.figuras.Rectangulo;
import clase_20_es_22.actividad_de_mesa.figuras.Triangulo;

public class DemoFigurasComposite {

    public static void main(String[] args) {

        Circulo circuloDe1 = new Circulo(1);
        Rectangulo rectangulo6x4 = new Rectangulo(6,4);
        Triangulo triangulo2x2 = new Triangulo(2,2);

        FiguraComposite Locomotora = new FiguraComposite();
        Locomotora.agregarFigura(circuloDe1);
        Locomotora.agregarFigura(circuloDe1);
        Locomotora.agregarFigura(rectangulo6x4);
        Locomotora.agregarFigura(triangulo2x2);

        System.out.println("La superficie de la locomotora es "+ Locomotora.calcularSuperficie() + " cm2");
        System.out.println("La superficie del rectangulo es "+ rectangulo6x4.calcularSuperficie() + " cm2");
        System.out.println("La superficie del circulo es "+ circuloDe1.calcularSuperficie() + " cm2");
        System.out.println("La superficie del triangulo es "+ triangulo2x2.calcularSuperficie() + " cm2");
    }
}
