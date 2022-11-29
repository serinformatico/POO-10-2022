package clase_19.extra.abstract_factory;

public class FiguraSelector {

    public static FiguraFactory crearFiguraFactory(String dimension) {
        switch (dimension.toUpperCase()) {
            case "2D":
                return new FiguraFactory2D();
            case "3D":
                return new FiguraFactory3D();
        }

        return null;
    }
}
