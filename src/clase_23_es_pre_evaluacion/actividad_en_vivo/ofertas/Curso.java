package clase_22_es_pre_evaluacion.actividad_en_vivo.ofertas;

public class Curso extends OfertaAcademica {

    private int cargaHorariaMensual;
    private int cantidadDeMeses;
    private double valorDeHora;

    @Override
    public double calcularPrecio() {
        return this.cargaHorariaMensual * this.cantidadDeMeses * this.valorDeHora;
    }

    public int getCargaHorariaMensual() {
        return cargaHorariaMensual;
    }

    public void setCargaHorariaMensual(int cargaHorariaMensual) {
        this.cargaHorariaMensual = cargaHorariaMensual;
    }

    public int getCantidadDeMeses() {
        return cantidadDeMeses;
    }

    public void setCantidadDeMeses(int cantidadDeMeses) {
        this.cantidadDeMeses = cantidadDeMeses;
    }

    public double getValorDeHora() {
        return valorDeHora;
    }

    public void setValorDeHora(double valorDeHora) {
        this.valorDeHora = valorDeHora;
    }
}
