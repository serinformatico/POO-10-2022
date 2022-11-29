package material_extra.clase_20.state.luces;

import material_extra.clase_20.state.LuzState;
import material_extra.clase_20.state.Semaforo;

public class LuzStateVerde extends LuzState {

    public LuzStateVerde() {
        this.nombre = "Verde";
    }

    @Override
    public String mostrar() {
        return this.nombre;
    }

    @Override
    public void siguiente(Semaforo semaforo) {
        semaforo.setLuzState(new LuzStateAmarilla());
    }
}
