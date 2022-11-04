package clase_08.clinica.codigo;

public class Paciente {

    // Atributos privados
    private String numeroDeDocumento;
    private String nombre;
    private int edad;
    private String nombreDeObraSocial;
    private boolean esParticular;
    private int cantidadDeEstudio;
    private double saldoAPagar;
    private boolean tieneCirugia;
    private boolean tieneAltaMedica;
    private Medico[] medicosAsignados; // Atributo necesario para la relación de asociación

    // Constructor
    public Paciente(String numeroDeDocumento, String nombre, int edad) {
        this.numeroDeDocumento    = numeroDeDocumento;
        this.nombre               = nombre;
        this.edad                 = edad;
        this.nombreDeObraSocial   = null;
        this.esParticular         = true;
        this.cantidadDeEstudio    = 0;
        this.saldoAPagar          = 0.0;
        this.tieneCirugia         = false;
        this.tieneAltaMedica      = false;
        this.medicosAsignados     = new Medico[4];
    }

    // Getters
    public double calcularSaldoAPagar() {
        // Lógica
        return 0.0;
    }

    // Getters
    public String getNumeroDeDocumento() {
        return this.numeroDeDocumento;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getNombreDeObraSocial() {
        return this.nombreDeObraSocial;
    }

    public boolean getEsParticular() {
        return this.esParticular;
    }

    public int getCantidadDeEstudio() {
        return this.cantidadDeEstudio;
    }

    public double getSaldoAPagar() {
        return this.saldoAPagar;
    }

    public boolean getTieneCirugia() {
        return this.tieneCirugia;
    }

    public boolean getTieneAltaMedica() {
        return this.tieneAltaMedica;
    }

    public Medico[] getMedicosAsignados() {
        return this.medicosAsignados;
    }

    // Setters
    public void setNumeroDeDocumento(String numeroDeDocumento) {
        this.numeroDeDocumento = numeroDeDocumento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTieneCirugia(boolean tieneCirugia) {
        this.tieneCirugia = tieneCirugia;
    }

    public void setTieneAltaMedica(boolean tieneAltaMedica) {
        this.tieneAltaMedica = tieneAltaMedica;
    }

    public void setMedicosAsignados(Medico[] medicosAsignados) {
        this.medicosAsignados = medicosAsignados;
    }
}
