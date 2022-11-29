package clase_19.extra.factory_method.figuras_2d;

import java.util.ArrayList;

public class Equilatero extends Figura2D {

    // Constructor
    public Equilatero() {
        this.nombre = "Equilátero";
    }

    @Override
    public Double calcularArea(ArrayList<Double> params) {
        if (params.size() != 2) return 0.0;

        double base = params.get(0);
        double altura = params.get(1);

        return ((base * altura) / 2 );
    }
}
