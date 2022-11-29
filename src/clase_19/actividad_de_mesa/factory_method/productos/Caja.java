package clase_19.actividad_de_mesa.factory_method.productos;

public class Caja extends Producto {

    // Atributos privados
    private double longitudEnCM;
    private double anchoEnCM;
    private double alturaEnCM;

    // Constructor
    public Caja(double longitudEnCM, double anchoEnCM, double alturaEnCM) {
        this.longitudEnCM = longitudEnCM;
        this.anchoEnCM    = anchoEnCM;
        this.alturaEnCM   = alturaEnCM;
    }

    // Método público
    public double calcularEspacio() {
        return (this.longitudEnCM * this.anchoEnCM * this.alturaEnCM);
    }

    @Override
    public String toString() {
        return super.toString() + ", longitud: " + this.longitudEnCM + "cm, ancho: " + this.anchoEnCM + "cm, altura: " + this.alturaEnCM + "cm, espacio necesario para la caja: " + String.format("%.1f", this.calcularEspacio()) + "cm3";
    }

    // Getters & Setters
    public double getLongitudEnCM() {
        return longitudEnCM;
    }

    public void setLongitudEnCM(double longitudEnCM) {
        this.longitudEnCM = longitudEnCM;
    }

    public double getAnchoEnCM() {
        return anchoEnCM;
    }

    public void setAnchoEnCM(double anchoEnCM) {
        this.anchoEnCM = anchoEnCM;
    }

    public double getAlturaEnCM() {
        return alturaEnCM;
    }

    public void setAlturaEnCM(double alturaEnCM) {
        this.alturaEnCM = alturaEnCM;
    }
}
