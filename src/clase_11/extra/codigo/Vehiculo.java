package clase_11.extra.codigo;

import java.util.Objects;

public abstract class Vehiculo {

    // Atributos protegidos
    protected String marca;
    protected String modelo;
    protected int anio;
    protected int numeroDeChasis;


    // Constructores
    public Vehiculo(int numeroDeChasis) {
        this.numeroDeChasis = numeroDeChasis;
    }

    public Vehiculo(String marca, String modelo, int numeroDeChasis) {
        this.marca          = marca;
        this.modelo         = modelo;
        this.numeroDeChasis = numeroDeChasis;
    }


    // Métodos públicos abstractos (estos deben definirse en las subclases)
    public abstract void acelerar();
    public abstract void girar(boolean izquierda);


    // Métodos públicos definidos
    public void encenderMotor() {
        System.out.println("Girar llave y mantener hasta que arranque");
    }

    public void cargarCombustible() {
        System.out.println("Cargar combustible en el tanque");
    }

    public void frenar() {
        System.out.println("Presionar el pedal del freno");
    }


    // Método público sobrecargado
    public void cargarCombustible(Combustible combustible) {
        System.out.println("Cargar " + combustible.getNombre() + " en el tanque");
    }


    // Métodos públicos heredados de la clase Object (redefinición)
    @Override
    public String toString() {
        return  "marca: "       + this.marca + ", " +
                "modelo: "      + this.modelo + ", " +
                "año: "         + this.anio + ", " +
                "Nro. chasis: " + this.numeroDeChasis;
    }

    @Override
    public boolean equals(Object obj) {
        // Verifica que obj no es nulo y que si es una clase de tipo vehículo
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        } else {
            // realiza un casting de obj
            Vehiculo vehiculo = (Vehiculo) obj;
            // Determina la igualdad de los objetos por medio del número de chasis
            return vehiculo.getNumeroDeChasis() == this.getNumeroDeChasis();
        }
    }

    @Override
    public int hashCode() {
        // Retorna la redefinición de un código hash único
        return Objects.hash(marca, modelo, anio, numeroDeChasis);
    }


    // Getters
    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAnio() {
        return this.anio;
    }

    public int getNumeroDeChasis() {
        return this.numeroDeChasis;
    }


    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setNumeroDeChasis(int numeroDeChasis) {
        this.numeroDeChasis = numeroDeChasis;
    }
}
