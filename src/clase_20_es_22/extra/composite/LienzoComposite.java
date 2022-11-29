package clase_20_es_22.extra.composite;

import clase_20_es_22.extra.composite.componentes.Grafico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class LienzoComposite implements Grafico {

    // Atributo privado
    private ArrayList<Grafico> graficos = new ArrayList();

    // Métodos públicos
    public void agregarGrafico(Grafico grafico) {
        this.graficos.add(grafico);
    }

    public void quitarGrafico(Grafico grafico) {
        this.graficos.remove(grafico);
    }

    public void graficar() {
        System.out.println("\nEl lienzo contiene los siguientes gráficos:");

        for (Grafico grafico : this.graficos) {
            grafico.graficar();
        }
    }

    public void colorear(String color) {
        System.out.println("\nEl lienzo contiene los siguientes gráficos coloreados:");

        ArrayList<String> colores = new ArrayList(Arrays.asList("rojo", "verde", "azul", "negro"));
        Random numeroAleatorio    = new Random();

        for (Grafico grafico : this.graficos) {
            if (color == "RANDOM") {
                grafico.colorear(colores.get(numeroAleatorio.nextInt(0, 3)));
            } else {
                grafico.colorear(color);
            }
        }
    }

    // Getter & Setter
    public ArrayList<Grafico> getGraficos() {
        return graficos;
    }

    public void setGraficos(ArrayList<Grafico> graficos) {
        this.graficos = graficos;
    }
}
