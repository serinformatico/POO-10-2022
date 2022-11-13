package clase_12.actividad_de_mesa.codigo;

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
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public void setCuentasBancarias(Cuenta[] cuentasBancarias) {
        this.cuentasBancarias = cuentasBancarias;
    }
}
