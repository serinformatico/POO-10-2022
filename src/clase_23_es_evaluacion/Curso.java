package clase_23_es_evaluacion;

public class Curso extends OfertaAcademica {

    private double cargaHoraria;
    private int cantidadDeMeses;
    private double valorHora;

    public double calcularPrecio() {
        return this.cargaHoraria * this.cantidadDeMeses * this.valorHora;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCantidadDeMeses() {
        return cantidadDeMeses;
    }

    public void setCantidadDeMeses(int cantidadDeMeses) {
        this.cantidadDeMeses = cantidadDeMeses;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
