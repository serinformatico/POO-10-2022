package clase_19.extra.abstract_factory;

import clase_19.extra.abstract_factory.figuras_2d.Figura2D;
import clase_19.extra.abstract_factory.figuras_3d.Figura3D;
import clase_19.extra.abstract_factory.figuras_3d.Cubo;
import clase_19.extra.abstract_factory.figuras_3d.Esfera;

public class FiguraFactory3D implements FiguraFactory {

    // Métodos públicos responsables de crear objetos
    public Figura2D crearFigura2D(String nombre) {
        return null;
    }

    public Figura3D crearFigura3D(String nombre) {
        switch (nombre.toUpperCase()) {
            case "CUBO":
                return new Cubo();
            case "ESFERA":
                return new Esfera();
        }

        return null;
    }
}
