package clase_20_es_22.extra.composite;

import clase_20_es_22.extra.composite.componentes.Circulo;
import clase_20_es_22.extra.composite.componentes.Linea;
import clase_20_es_22.extra.composite.componentes.Triangulo;

public class DemoLienzo {
    public static void main(String[] args) {

        System.out.println("\nLinea1:");
        Linea linea1 = new Linea();
        linea1.setLargo(10);
        linea1.setGrosor(1);
        linea1.graficar();
        linea1.colorear("RAMDON");

        System.out.println("\nCirculo:");
        Circulo circulo = new Circulo();
        circulo.setRadio(15);
        circulo.graficar();
        circulo.colorear("RAMDON");

        System.out.println("\nBocha de Helado:");
        Circulo bochaDeHelado = new Circulo();
        bochaDeHelado.setRadio(3);
        bochaDeHelado.graficar();
        bochaDeHelado.colorear("BLANCO");

        System.out.println("\nCucurucho:");
        Triangulo cucurucho = new Triangulo();
        cucurucho.setAltura(10);
        cucurucho.setBase(3);
        cucurucho.graficar();
        cucurucho.colorear("MARRON");

        System.out.println("\nHelado de una bocha de sabor americana:");
        FiguraComposite heladoDeUnaBochaAmericana = new FiguraComposite();
        heladoDeUnaBochaAmericana.agregarGrafico(cucurucho);
        heladoDeUnaBochaAmericana.agregarGrafico(bochaDeHelado);
        heladoDeUnaBochaAmericana.graficar();

        System.out.println("\nLIENZO:");
        Lienzo lienzo = new Lienzo();

        lienzo.agregarGrafico(heladoDeUnaBochaAmericana);
        lienzo.agregarGrafico(linea1);
        lienzo.agregarGrafico(circulo);
    }
}
