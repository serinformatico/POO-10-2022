package material_extra.clase_25.observer.suscriptores;

import material_extra.clase_25.observer.CanalPublicador;

public class SuscriptorVimeo extends Suscriptor {

    public SuscriptorVimeo(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public void notificar(String mensaje) {
        System.out.println("Hey " + this.nombre + ", se ha subido un nuevo video al canal. " + mensaje);
    }

    public void suscribirAlCanal(CanalPublicador canalPublicador) {
        this.canal = canalPublicador;
    }
}
