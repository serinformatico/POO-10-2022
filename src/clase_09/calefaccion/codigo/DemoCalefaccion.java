package clase_09.calefaccion.codigo;

public class DemoCalefaccion {
    public static void main(String[] args) {

        Estufa estufa1 = new Estufa(3, 300);
        Estufa estufa2 = new Estufa(2, 300);
        Estufa estufa3 = new Estufa(5, 300);

        ViviendaCasa viviendaCasa = new ViviendaCasa(120, 5);
        viviendaCasa.artefactosDeCalefaccion = new Estufa[] { estufa1, estufa2 };

        ViviendaDepartamento viviendaDepartamento = new ViviendaDepartamento(80, 4);
        viviendaDepartamento.artefactosDeCalefaccion = new Estufa[] { estufa3 };

        Vivienda[] viviendas = new Vivienda[] { viviendaCasa, viviendaDepartamento };

        Ciudad ciudad = new Ciudad("Mendoza", viviendas);

        System.out.println(viviendaCasa.getCantidadDePersonas());
        System.out.println(viviendaDepartamento.getCantidadDePersonas());
    }
}
