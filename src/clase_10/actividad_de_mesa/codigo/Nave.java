package clase_10.actividad_de_mesa.codigo;

public class Nave extends ObjetoGrafico {

    // Atributos privados
    private double velocidad;
    private int cantidadDeVidas;


    // Constructor
    public Nave(int posicionX, int posicionY, char direccion, double velocidad) {
        super(posicionX, posicionY, direccion);
        this.velocidad = velocidad;
    }


    // Método sobrescrito (está en la superclase)
    @Override
    public void irA(int posicionX, int posicionY, char direccion) {
        // Redefine la lógica
    }


    // Métodos definidos
    public void girar(char direccion) {
        System.out.println("Giro en dirección al " + direccion);
    }

    public void restarVida() {
        System.out.println("Resto una vida");
    }


    // Getters
    public double getVelocidad() {
        return this.velocidad;
    }

    public int getCantidadDeVidas() {
        return this.cantidadDeVidas;
    }


    // Setters
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void setCantidadDeVidas(int cantidadDeVidas) {
        this.cantidadDeVidas = cantidadDeVidas;
    }
}
