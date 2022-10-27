package clase_04.actividad_de_mesa.ejercicio4;

public class CajaDeProvision {
    
    private double pesoTotal;
    private String origen;
    private String nombreDeProveedor;
    private String descripcionDelContenido;
    private boolean esFragil;

    public CajaDeProvision(double pesoTotal, String origen, String nombreDeProveedor, String descripcionDelContenidol) {
        this.pesoTotal               = pesoTotal;
        this.origen                  = origen;
        this.nombreDeProveedor       = nombreDeProveedor;
        this.descripcionDelContenido = descripcionDelContenido;
    }

    public void validarEsFragil(boolean esFragil) {
        this.esFragil = esFragil;
    }
}
