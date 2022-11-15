package clase_13.extra;

public class Bono implements Registrable, Pagable, Comparable<Bono>, Cloneable {

    // Atributos privados
    private String codigo;
    private double valor;
    private boolean estaRegistrado;
    private boolean estaParaCobrar;

    // Constructor
    public Bono(String codigo, double valor) {
        this.codigo         = codigo;
        this.valor          = valor;
        this.estaRegistrado = false;
        this.estaParaCobrar = false;
    }

    // Métodos declarados en la interfaz Registrable
    public void anularRegistroDeBono() {
        this.estaRegistrado = false;
        System.out.println("El bono se ha registrado correctamente");
    }

    public void registrarBono() {
        this.estaRegistrado = true;
        System.out.println("El bono se ha registrado correctamente");
    }

    // Métodos declarados en la interfaz Pagable
    public boolean autorizarPago() {
        return this.estaRegistrado ? true : false;
    }

    public void emitirCheque(String apellido, String nombre) {
        if (this.autorizarPago() == true) {
            this.valor -= (this.valor / 100 * this.PORCENTAJE_DE_IMPUESTO_AL_CHEQUE); // Usa el valor de la constante declarada dentro de la interfaz Pagable
            this.estaParaCobrar = true;
            System.out.println("Se ha emitido el cheque a nombre de " + apellido + " " + nombre);
        } else  {
            System.out.println("Ho hay autorización para emitir el cheque...");
        }
    }

    // Método para la comparación
    public int compareTo(Bono o) {
        if (this.getValor() > o.getValor()) {
            return 1;
        } else if (this.getValor() < o.getValor()) {
            return -1;
        } else {
            return 0;
        }
    }

    // Método para la clonación
    public Bono clone()   {
        Bono bonClonado = new Bono(this.codigo, this.valor);

        return bonClonado;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public double getValor() {
        return valor;
    }

    // Setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
