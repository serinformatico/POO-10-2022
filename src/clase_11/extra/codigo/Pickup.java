package clase_11.extra.codigo;

public class Pickup extends Vehiculo {

    // Atributos privados
    private String volante;
    private String carroceria;


    // Constructores
    public Pickup(int numeroDeChasis) {
        super(numeroDeChasis);
    }

    public Pickup(String marca, String modelo, int numeroDeChasis) {
        super(marca, modelo, numeroDeChasis);
    }


    // Métodos públicos definidos
    public void acelerar() {
        System.out.println("Presionar el pedal del acelerador");
    }

    public void girar(boolean izquierda) {
        if (izquierda == true) {
            System.out.println("Girar el volante para la izquierda");
        } else {
            System.out.println("Girar el volante para la derecha");
        }
    }

    public void abrirCompuertaDeCarroceria() {
        System.out.println("Abrir la compuerta de la carrocería");
    }

    public void cerrarCompuertaDeCarroceria() {
        System.out.println("Cerrar la compuerta de la carrocería");
    }


    // Método público heredado de la clase Object (redefinición)
    @Override
    public String toString() {
        return  "(" + super.toString() + ", " +
                "volante: "    + this.volante +
                "carrocería: " + this.carroceria + ")";
    }


    // Getter
    public String getVolante() {
        return this.volante;
    }

    public String getCarroceria() {
        return this.carroceria;
    }

    // Setter
    public void setVolante(String volante) {
        this.volante = volante;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }
}
