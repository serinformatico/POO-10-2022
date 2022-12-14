package clase_20_es_22.extra.composite;

import clase_20_es_22.extra.composite.componentes.Grafico;

import java.util.ArrayList;

public class Lienzo {

    // Atributo privado
    private ArrayList<Grafico> graficos = new ArrayList();

    // Métodos públicos
    public void agregarGrafico(Grafico grafico) {
        this.graficos.add(grafico);
    }

    public void quitarGrafico(Grafico grafico) {
        this.graficos.remove(grafico);
    }

    // Getter
    public ArrayList<Grafico> getGraficos() {
        return graficos;
    }
}
