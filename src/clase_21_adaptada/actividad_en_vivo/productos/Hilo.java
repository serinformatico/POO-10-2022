package clase_21_adaptada.actividad_en_vivo.productos;

public class Hilo extends Producto {

    // Método público
    public double calcularPrecio() {
        return this.getCosto() + (this.getCosto() / 100 * this.getPORCENTAJE_DE_GANANCIA());
    }
}
