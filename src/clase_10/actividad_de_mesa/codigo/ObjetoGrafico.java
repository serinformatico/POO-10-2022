package clase_10.actividad_de_mesa.codigo;

public class ObjetoGrafico {

    // Atributos privados
    private int posicionX;
    private int posicionY;
    private char direccion;


    // Constructor
    public ObjetoGrafico(int posicionX, int posicionY, char direccion) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.direccion = direccion;
    }


    // Método público
    public void irA(int posicionX, int posicionY, char direccion) {
        // Lógica
    }


    // Getters
    public int getPosicionX() {
        return this.posicionX;
    }

    public int getPosicionY() {
        return this.posicionY;
    }

    public char getDireccion() {
        return this.direccion;
    }


    // Setters
    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }
}
