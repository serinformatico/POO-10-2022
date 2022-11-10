package clase_10.extra.codigo;

public class Motocicleta extends Vehiculo {

    // Atributos privados
    private String manillar;


    // Constructores
    public Motocicleta(int numeroDeChasis) {
        super(numeroDeChasis);
    }

    public Motocicleta(String marca, String modelo, int numeroDeChasis) {
        super(marca, modelo, numeroDeChasis);
    }


    // Métodos públicos definidos
    public void acelerar() {
        System.out.println("Girar el mango del acelerador");
    }

    public void girar(boolean izquierda) {
        if (izquierda == true) {
            System.out.println("Girar el manubrio a la izquierda");
        } else {
            System.out.println("Girar el manubrio a la derecha");
        }
    }

    public void bajarCaballete() {
        System.out.println("Bajar el caballete");
    }

    public void subirCaballete() {
        System.out.println("Subir el caballete");
    }


    // Métodos públicos redefinidos (sobrescribe el método definido en la superclase)
    @Override
    public void encenderMotor() {
        System.out.println("Girar llave y oprimir botón de arranque hasta que arranque");
    }


    // Método público heredado de la clase Object (redefinición)
    @Override
    public String toString() {
        return  "(" + super.toString() + ", " +
                "manillar: " + this.manillar + ")";
    }


    // Getter
    public String getManillar() {
        return this.manillar;
    }
    

    // Setter
    public void setManillar(String manillar) {
        this.manillar = manillar;
    }
}
