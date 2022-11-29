package clase_16.actividad_de_mesa.codigo;

import java.util.ArrayList;

public class Puerto {

    // Atributo privado
    private ArrayList<Contenedor> contenedores = new ArrayList();

    public void permitirEntradaDeContenedor(Contenedor contenedor) {
        this.contenedores.add(contenedor);
    }

    public void mostrarContenedores() {
        for (Contenedor contenedor : this.contenedores) {
            System.out.println(contenedor.toString());
        }
    }

    public int obtenerContenedoresPeligrosos() {
        int cantidadDeContenedoresPeligrosos = 0;

        for (Contenedor contenedor : this.contenedores) {
            if (contenedor.getEsMaterialPeligroso() == true && contenedor.getPais().equals("Desconocida")) {
                cantidadDeContenedoresPeligrosos++;
            }
        }

        return cantidadDeContenedoresPeligrosos;
    }

    // Getter
    public ArrayList<Contenedor> getContenedores() {
        return contenedores;
    }

    // Setter
    public void setContenedores(ArrayList<Contenedor> contenedores) {
        this.contenedores = contenedores;
    }
}
