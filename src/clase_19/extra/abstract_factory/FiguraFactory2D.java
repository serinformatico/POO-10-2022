package clase_19.extra.abstract_factory;

import clase_19.extra.abstract_factory.figuras_2d.Figura2D;
import clase_19.extra.abstract_factory.figuras_3d.Figura3D;
import clase_19.extra.abstract_factory.figuras_2d.Cuadrado;
import clase_19.extra.abstract_factory.figuras_2d.Equilatero;
import clase_19.extra.abstract_factory.figuras_2d.Rectangulo;

public class FiguraFactory2D implements FiguraFactory {

    // Métodos públicos responsables de crear objetos
    public Figura2D crearFigura2D(String nombre) {
        switch (nombre.toUpperCase()) {
            case "CUADRADO":
                return new Cuadrado();
            case "EQUILATERO":
                return new Equilatero();
            case "RECTANGULO":
                return new Rectangulo();
        }

        return null;
    }

    public Figura3D crearFigura3D(String nombre) {
        return null;
    }
}
