package clase_20.extra.state.luces;

import clase_20.extra.state.*;

public class LuzRoja implements SemaforoState {

    // Atributo privado
    private String nombreDeLaLuz;
    private Semaforo semaforo;

    // Constructor
    public LuzRoja(Semaforo semaforo) {
        this.semaforo      = semaforo;
        this.nombreDeLaLuz = "roja";
    }

    // Métodos obligatorios
    @Override
    public void alcanzarLuzVerde() {
        this.semaforo.setEstado(new LuzAmarilla(semaforo));
        System.out.println("Luz: estoy en luz " + this.nombreDeLaLuz + " y pasé a la luz amarilla");
    }

    @Override
    public void alcanzarLuzRoja() {
        System.out.println("Luz: sigo en luz " + this.nombreDeLaLuz);
    }
}
