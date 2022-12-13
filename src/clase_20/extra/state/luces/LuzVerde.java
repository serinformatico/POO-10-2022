package clase_20.extra.state.luces;

import clase_20.extra.state.*;

public class LuzVerde implements SemaforoState {

    // Atributo privado
    private String nombreDeLaLuz;
    private Semaforo semaforo;

    // Constructor
    public LuzVerde(Semaforo semaforo) {
        this.semaforo      = semaforo;
        this.nombreDeLaLuz = "verde";
    }

    // Métodos obligatorios
    @Override
    public void alcanzarLuzVerde() {
        System.out.println("Luz: sigo en luz " + this.nombreDeLaLuz);
    }

    @Override
    public void alcanzarLuzRoja() {
        this.semaforo.setEstado(new LuzAmarilla(semaforo));
        System.out.println("Luz: estoy en luz " + this.nombreDeLaLuz + " y pasé a la luz amarilla");
    }
}
