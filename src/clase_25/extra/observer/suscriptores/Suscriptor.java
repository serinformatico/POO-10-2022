package material_extra.clase_25.observer.suscriptores;

import material_extra.clase_25.observer.CanalPublicador;

public abstract class Suscriptor {

    protected String nombre;
    protected String apellido;
    protected CanalPublicador canal;

    public Suscriptor(String nombre, String apellido) {
        this.nombre   = nombre;
        this.apellido = apellido;
        this.canal    = new CanalPublicador();
    }

    public abstract void notificar(String mensaje);

    public abstract void suscribirAlCanal(CanalPublicador canalPublicador);
}
