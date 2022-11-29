package clase_19.actividad_en_vivo.factory_method.empleados;

public class EmpleadoRelacionDeDependencia extends Empleado {

    // Atributo privado
    private double salarioBruto;

    // Atributo estático privado
    private final double INCENTIVO = 15.0;

    // Constructor
    public EmpleadoRelacionDeDependencia(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    // Método público
    public double calcularSalario() {
        return (this.salarioBruto + this.INCENTIVO);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", salarioBruto: " + this.salarioBruto +
                ", incentivo: " + this.INCENTIVO;
    }

    // Getters & Setters
    public double getSalarioBruto() {
        return this.salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getINCENTIVO() {
        return this.INCENTIVO;
    }
}
