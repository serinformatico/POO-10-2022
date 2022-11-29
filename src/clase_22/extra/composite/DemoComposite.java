package clase_22.extra.composite;

import clase_22.extra.composite.componentes.Circulo;
import clase_22.extra.composite.componentes.Linea;
import clase_22.extra.composite.componentes.Triangulo;

public class DemoComposite {
    public static void main(String[] args) {
        
        Linea linea1 = new Linea();
        linea1.setLargo(10);
        linea1.setGrosor(1);

        Circulo circulo = new Circulo();
        circulo.setRadio(15);

        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(5);
        triangulo.setBase(3);

        Linea linea2 = new Linea();
        linea2.setLargo(7);
        linea2.setGrosor(2);

        System.out.println("LIENZO:");
        LienzoComposite lienzo = new LienzoComposite();

        lienzo.agregarGrafico(linea1);
        lienzo.agregarGrafico(circulo);
        lienzo.agregarGrafico(triangulo);
        lienzo.agregarGrafico(linea2);

        lienzo.graficar();
        lienzo.colorear("RANDOM");
    }
}
