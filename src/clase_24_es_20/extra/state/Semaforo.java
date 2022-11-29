package material_extra.clase_20.state;

import material_extra.clase_20.state.luces.LuzStateVerde;

public class Semaforo {
    private LuzState luzState;

    public Semaforo() {
        this.luzState = new LuzStateVerde();
    }

    public String mostrar() {
        return this.luzState.mostrar();
    }

    public void siguiente() {
        this.luzState.siguiente(this);
    }

    public void setLuzState(LuzState luzState) {
        this.luzState = luzState;
    }
}
