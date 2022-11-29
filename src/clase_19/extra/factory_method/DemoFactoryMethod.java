package clase_19.extra.factory_method;

import clase_19.extra.factory_method.figuras_2d.Cuadrado;
import clase_19.extra.factory_method.figuras_2d.Equilatero;
import clase_19.extra.factory_method.figuras_2d.Rectangulo;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoFactoryMethod {
    public static void main(String[] args) {

        ArrayList<Double> params;

        FiguraFactoryMethod figuraFactoryMethod = new FiguraFactoryMethod();

        Cuadrado cuadrado     = (Cuadrado) figuraFactoryMethod.crearFigura2D("CUADRADO");
        Equilatero equilatero = (Equilatero) figuraFactoryMethod.crearFigura2D("EQUILATERO");
        Rectangulo rectangulo = (Rectangulo) figuraFactoryMethod.crearFigura2D("RECTANGULO");

        params = new ArrayList(Arrays.asList(3.0));
        System.out.println("El área de un " + cuadrado.getNombre() + " (" + params.get(0) + ") es " + cuadrado.calcularArea(params));

        params = new ArrayList(Arrays.asList(4.0, 5.0));
        System.out.println("El área de un " + equilatero.getNombre() + " (" + params.get(0) + " x " + params.get(1) + ") es " + equilatero.calcularArea(params));

        params = new ArrayList(Arrays.asList(10.0, 12.0));
        System.out.println("El área de un " + rectangulo.getNombre() + " (" + params.get(0) + " x " + params.get(1) + ") es " + rectangulo.calcularArea(params));
     }
}
