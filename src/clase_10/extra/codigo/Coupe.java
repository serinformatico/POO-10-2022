package clase_10.extra.codigo;

public class Coupe extends Vehiculo {

    // Atributos privados
    private String volante;
    private int capacidadDelBaul;


    // Constructores
    public Coupe(int numeroDeChasis) {
        super(numeroDeChasis);
    }

    public Coupe(String marca, String modelo, int numeroDeChasis) {
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

    public void abrirBaul() {
        System.out.println("Abrir el baúl");
    }

    public void cerrarBaul() {
        System.out.println("Cerrar el baúl");
    }


    // Método público heredado de la clase Object (redefinición)
    @Override
    public String toString() {
        return  "(" + super.toString() + ", " +
                "volante: "            + this.volante +
                "capacidad del baúl: " + this.capacidadDelBaul + ")";
    }


    // Getter
    public String getVolante() {
        return this.volante;
    }

    public int getCapacidadDelBaul() {
        return this.capacidadDelBaul;
    }


    // Setter
    public void setVolante(String volante) {
        this.volante = volante;
    }

    public void setCapacidadDelBaul(int capacidadDelBaul) {
        this.capacidadDelBaul = capacidadDelBaul;
    }
}
