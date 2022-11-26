package clase_18.actividad_de_mesa.codigo;

import java.util.ArrayList;

public class Recorrido {

    // Atributo privado
    private ArrayList<Estacion> estaciones = new ArrayList();

    // Getter
    public ArrayList<Estacion> getEstaciones() {
        return this.estaciones;
    }

    // Setter
    public void setEstaciones(ArrayList<Estacion> estaciones) {
        this.estaciones = estaciones;
    }
}
