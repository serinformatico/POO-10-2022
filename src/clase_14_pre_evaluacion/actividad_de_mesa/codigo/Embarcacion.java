package clase_14_pre_evaluacion.actividad_de_mesa.codigo;

public abstract class Embarcacion {

    // Atributos protegidos
    protected int anioDeFabricacion;
    protected int eslora;
    protected double valorBase;
    protected double valorAdicional;
    protected Capitan capitan; // Es el atributo de la relación de asociación

    // Atributo público estático
    public static final int EMBARCACION_NUEVA = 2020;

    // Constructor
    public Embarcacion(int anioDeFabricacion, int eslora, double valorBase, double valorAdicional, Capitan capitan) {
        this.anioDeFabricacion = anioDeFabricacion;
        this.eslora            = eslora;
        this.valorBase         = valorBase;
        this.valorAdicional    = valorAdicional;
        this.capitan           = capitan;
    }

    // Método público
    public double obtenerMontoDeAlquiler(){
        double montoAlquiler = valorBase;

        if(anioDeFabricacion > EMBARCACION_NUEVA) {
            montoAlquiler += valorAdicional;
        }

        return montoAlquiler;
    }

    // Getters
    public int getAnioDeFabricacion() {
        return anioDeFabricacion;
    }

    public int getEslora() {
        return eslora;
    }

    public double getValorBase() {
        return valorBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    // Setters
    public void setAnioDeFabricacion(int anioDeFabricacion) {
        this.anioDeFabricacion = anioDeFabricacion;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }
}