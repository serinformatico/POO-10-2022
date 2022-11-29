package clase_19.extra.factory_method;

import clase_19.extra.factory_method.figuras_2d.Figura2D;
import clase_19.extra.factory_method.figuras_2d.Cuadrado;
import clase_19.extra.factory_method.figuras_2d.Equilatero;
import clase_19.extra.factory_method.figuras_2d.Rectangulo;

public class FiguraFactoryMethod {

    // Métodos públicos responsables de crear objetos
    public Figura2D crearFigura2D(String nombreDeLaFigura) {
        switch (nombreDeLaFigura.toUpperCase()) {
            case "CUADRADO":
                return new Cuadrado();
            case "EQUILATERO":
                return new Equilatero();
            case "RECTANGULO":
                return new Rectangulo();
        }

        return null;
    }
}
