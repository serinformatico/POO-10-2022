import clase_20_es_22.actividad_de_mesa.figuras.Figura;

import java.util.ArrayList;

public class FiguraComposite extends Figura {

    private ArrayList<Figura> figuras = new ArrayList<>();

    @Override

    public double calcularSuperficie() {
        double superficieToTal = 0.0;
        for (Figura f: figuras ) {
            superficieToTal+= f.calcularSuperficie();
        }
        return superficieToTal;
    }

    public void agregarFigura(Figura figura) {
        this.figuras.add (figura);
    }
    public void quitarFigura(Figura figura) {
        this.figuras.remove (figura);
    }
}
