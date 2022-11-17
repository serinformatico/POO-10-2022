package clase_14_pre_evaluacion.actividad_de_mesa.codigo;

public class Velero extends Embarcacion {

    // Atributo protegido
    private int cantidadDeMastiles;

    // Atributo público estático
    public static final int CANT_MASTILES_VELERO_GRANDE = 4;

    // Constructor
    public Velero(int anioDeFabricacion, int eslora, double valorBase, double valorAdicional, Capitan capitan) {
        super(anioDeFabricacion, eslora, valorBase, valorAdicional, capitan);
    }

    // Método público
    public boolean evaluarSiEsUnVeleroGrande()
    {
        return (this.cantidadDeMastiles > CANT_MASTILES_VELERO_GRANDE);
    }

    // Getter
    public int getCantidadDeMastiles() {
        return cantidadDeMastiles;
    }

    // Setter
    public void setCantidadDeMastiles(int cantidadDeMastiles) {
        this.cantidadDeMastiles = cantidadDeMastiles;
    }
}