package clase_14_pre_evaluacion.actividad_de_mesa.codigo;

public class Yate extends Embarcacion implements Comparable<Yate>{

    // Atributo protegido
    private int cantidadDeCamarotes;

    // Constructor
    public Yate(int anioDeFabricacion, int eslora, double valorBase, double valorAdicional, Capitan capitan) {
        super(anioDeFabricacion, eslora, valorBase, valorAdicional, capitan);
    }

    // Getter
    public int getCantidadDeCamarotes() {
        return cantidadDeCamarotes;
    }

    // Setter
    public void setCantidadDeCamarotes(int cantidadDeCamarotes) {
        this.cantidadDeCamarotes = cantidadDeCamarotes;
    }

    @Override
    public int compareTo(Yate yate) {
        if (this.cantidadDeCamarotes > yate.getCantidadDeCamarotes()) {
            return 1;
        } else if (this.cantidadDeCamarotes < yate.getCantidadDeCamarotes()) {
            return -1;
        }

        return 0;
    }
}