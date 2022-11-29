package clase_19.actividad_en_vivo.factory_method.empleados;

public class EmpleadoContratadoPorHora extends Empleado {

    // Atributos privados
    private double valorDeHora;
    private int cantidadDeHorasTrabajadasPorMes;

    // Constructor
    public EmpleadoContratadoPorHora(double valorDeHora) {
        this.valorDeHora = valorDeHora;
    }

    // Método público
    public double calcularSalario() {
        return (this.valorDeHora * this.cantidadDeHorasTrabajadasPorMes);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", valorDeHora: " + this.valorDeHora +
                ", cantidadDeHorasTrabajadasPorMes: " + this.cantidadDeHorasTrabajadasPorMes;
    }

    // Getters & Setters
    public double getValorDeHora() {
        return this.valorDeHora;
    }

    public void setValorDeHora(double valorDeHora) {
        this.valorDeHora = valorDeHora;
    }

    public int getCantidadDeHorasTrabajadasPorMes() {
        return this.cantidadDeHorasTrabajadasPorMes;
    }

    public void setCantidadDeHorasTrabajadasPorMes(int cantidadDeHorasTrabajadasPorMes) {
        this.cantidadDeHorasTrabajadasPorMes = cantidadDeHorasTrabajadasPorMes;
    }
 }
