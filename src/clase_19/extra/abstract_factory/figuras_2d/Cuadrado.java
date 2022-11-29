package clase_19.extra.abstract_factory.figuras_2d;

import java.util.ArrayList;

public class Cuadrado extends Figura2D {

    // Constructor
    public Cuadrado() {
        this.nombre = "Cuadrado";
    }

    @Override
    public Double calcularArea(ArrayList<Double> params) {
        if (params.size() != 1) return 0.0;

        double lado = params.get(0);

        return Math.pow(lado, 2);
    }
 }
