package clase_11.actividad_de_mesa.codigo;

public class Cliente {

    // Atributos privados
    private int numero;
    private String apellido;
    private int dni;
    private String cuit;
    private Cuenta[] cuentasBancarias;

    // Constructores
    public Cliente () {}

    public Cliente(int numero, String apellido, int dni) {
        this.numero   = numero;
        this.apellido = apellido;
        this.dni      = dni;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    // Getters
    public int getNumero() {
        return numero;
    }
    public String getApellido() {
        return apellido;
    }
    public int getDni() {
        return dni;
    }
    public String getCuit() {
        return cuit;
    };

    // Setters

}
