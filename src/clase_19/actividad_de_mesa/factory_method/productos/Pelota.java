package clase_19.actividad_de_mesa.factory_method.productos;

public class Pelota extends Producto {

    // Atributo privado
    private double radioEnCM;

    // Constructor
    public Pelota(double radioEnCM) {
        this.radioEnCM = radioEnCM;
    }

    // Método público
    public double calcularEspacio() {
        return (4 * Math.PI * Math.pow(this.radioEnCM, 2));
    }

    @Override
    public String toString() {
        return super.toString() + ", radio: " + this.radioEnCM + "cm, espacio necesario para la pelota: " + String.format("%.1f", this.calcularEspacio()) + "cm3";
    }

    // Getters & Setters
    public double getRadioEnCM() {
        return radioEnCM;
    }

    public void setRadioEnCM(double radioEnCM) {
        this.radioEnCM = radioEnCM;
    }
 }
