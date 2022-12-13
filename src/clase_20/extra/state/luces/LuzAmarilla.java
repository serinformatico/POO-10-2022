package clase_20.extra.state.luces;

import clase_20.extra.state.*;

public class LuzAmarilla implements SemaforoState {

    // Atributo privado
    private String nombreDeLaLuz;
    private Semaforo semaforo;

    // Constructor
    public LuzAmarilla(Semaforo semaforo) {
        this.semaforo      = semaforo;
        this.nombreDeLaLuz = "amarilla";
    }

    // Métodos obligatorios
    @Override
    public void alcanzarLuzVerde() {
        this.semaforo.setEstado(new LuzVerde(semaforo));
        System.out.println("Luz: estoy en luz " + this.nombreDeLaLuz + " y pasé a la luz verde");
    }

    @Override
    public void alcanzarLuzRoja() {
        this.semaforo.setEstado(new LuzRoja(semaforo));
        System.out.println("Luz: estoy en luz " + this.nombreDeLaLuz + " y pasé a la luz roja");
    }
}
