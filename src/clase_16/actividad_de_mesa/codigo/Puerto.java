package clase_16.actividad_de_mesa.codigo;

import java.util.TreeSet;

public class Puerto {
    private TreeSet<Contenedor> contenedores = new TreeSet<>();

    public void permiteEntrada(Contenedor contenedor) {
        contenedores.add(contenedor);
    }

    public void mostrarContenedores() {
        System.out.println("CONTENEDORES:");
        for(Contenedor c : contenedores) {
            System.out.println("Id: " + c.getId());
            System.out.println("Procedencia: " + c.getPais());
            System.out.println("Contiene materiales peligrosos: " + c.contieneMaterialesPeligrosos());
            System.out.println("-----------");
        }
    }

    public int contenedoresPeligrosos() {
        int contenedores = 0;
        for(Contenedor c : this.contenedores) {
            if(c.contieneMaterialesPeligrosos() && "Desconocida".equals(c.getPais())) {
                contenedores ++;
            }
        }
        return contenedores;
    }
}
