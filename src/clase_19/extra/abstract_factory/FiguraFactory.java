package clase_19.extra.abstract_factory;

import clase_19.extra.abstract_factory.figuras_2d.Figura2D;
import clase_19.extra.abstract_factory.figuras_3d.Figura3D;

public interface FiguraFactory {
    public Figura2D crearFigura2D(String nombreDeLaFigura);
    public Figura3D crearFigura3D(String nombreDeLaFigura);
}