package material_extra.clase_20.state;

public class DemoState {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        System.out.println("La luz del semáforo es: " + semaforo.mostrar());
        semaforo.siguiente();
        System.out.println("La luz del semáforo es: " + semaforo.mostrar());
        semaforo.siguiente();
        System.out.println("La luz del semáforo es: " + semaforo.mostrar());
        semaforo.siguiente();
        System.out.println("La luz del semáforo es: " + semaforo.mostrar());
    }
}
