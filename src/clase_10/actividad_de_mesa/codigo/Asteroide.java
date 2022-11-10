package clase_10.actividad_de_mesa.codigo;

public class Asteroide extends ObjetoGrafico {

    // Atributo privado
    private int lesion;


    // Constructor
    public Asteroide(int posicionX, int posicionY, char direccion, int lesion) {
        super(posicionX, posicionY, direccion);
        this.lesion = lesion;
    }


    // Getters
    public int getLesion() {
        return lesion;
    }


    // Setters
    public void setLesion(int lesion) {
        this.lesion = lesion;
    }
}
