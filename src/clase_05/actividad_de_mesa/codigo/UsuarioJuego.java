package clase_05.actividad_de_mesa.codigo;

public class UsuarioJuego {

    // Atributos privados
    private String nombre;
    private String clave;
    private Double puntaje;
    private int nivel;


    // Constructor
    public UsuarioJuego(String nombre, String clave){
        this.nombre  = nombre;
        this.clave   = clave;
        this.puntaje = 0.0;
        this.nivel   = 0;
    }


    // Métodos getters

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public int getNivel() {
        return nivel;
    }


    // Métodos setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }


    // Métodos públicos
    public void aumentarPuntaje(){
        this.puntaje++;
    }

    public void aumentarNivel(){
        this.nivel++;
    }

    public void bonus(int valor){
        this.puntaje += valor;
    }
}
