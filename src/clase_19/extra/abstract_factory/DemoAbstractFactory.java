package material_extra.clase_19.abstract_factory;

import clase_19.extra.abstract_factory.FiguraSelector;
import clase_19.extra.abstract_factory.figuras_2d.Cuadrado;
import clase_19.extra.abstract_factory.figuras_2d.Equilatero;
import clase_19.extra.abstract_factory.figuras_2d.Figura2D;
import clase_19.extra.abstract_factory.figuras_2d.Rectangulo;
import clase_19.extra.abstract_factory.figuras_3d.Cubo;
import clase_19.extra.abstract_factory.figuras_3d.Esfera;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoAbstractFactory {
    public static void main(String[] args) {

        ArrayList<Double> params;

        Cuadrado cuadrado     = (Cuadrado) FiguraSelector.crearFiguraFactory("2D").crearFigura2D("CUADRADO");
        Equilatero equilatero = (Equilatero) FiguraSelector.crearFiguraFactory("2D").crearFigura2D("EQUILATERO");
        Rectangulo rectangulo = (Rectangulo) FiguraSelector.crearFiguraFactory("2D").crearFigura2D("RECTANGULO");

        Cubo cubo     = (Cubo) FiguraSelector.crearFiguraFactory("3D").crearFigura3D("CUBO");
        Esfera esfera = (Esfera) FiguraSelector.crearFiguraFactory("3D").crearFigura3D("ESFERA");

        params = new ArrayList(Arrays.asList(3.0));
        System.out.println("El área de un " + cuadrado.getNombre() + " (" + params.get(0) + ") es " + cuadrado.calcularArea(params));

        params = new ArrayList(Arrays.asList(4.0, 5.0));
        System.out.println("El área de un " + equilatero.getNombre() + " (" + params.get(0) + " x " + params.get(1) + ") es " + equilatero.calcularArea(params));

        params = new ArrayList(Arrays.asList(10.0, 12.0));
        System.out.println("El área de un " + rectangulo.getNombre() + " (" + params.get(0) + " x " + params.get(1) + ") es " + rectangulo.calcularArea(params));

        double lado = 5.0;
        System.out.println("El área de un " + cubo.getNombre() + " (" + lado + ") es " + cubo.calcularVolumen(lado));

        double radio = 5.0;
        System.out.println("El área de un " + esfera.getNombre() + " (" + radio + ") es " + esfera.calcularVolumen(radio));
    }
}
