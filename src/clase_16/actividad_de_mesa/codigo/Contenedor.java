package clase_16.actividad_de_mesa.codigo;

public class Contenedor implements Comparable {
    private int id;
    private String pais;
    private Boolean materialesPeligrosos;

    public Contenedor(int id, String pais, Boolean materialesPeligrosos) {
        this.id = id;
        this.pais = pais;
        this.materialesPeligrosos = materialesPeligrosos;
    }

    @Override
    public int compareTo(Object o) {
        Contenedor contendor = (Contenedor) o;
        return this.id - contendor.getId();
    }

    public int getId() {
        return this.id;
    }

    public String getPais() {
        return this.pais;
    }

    public Boolean contieneMaterialesPeligrosos() {
        return this.materialesPeligrosos;
    }
}
