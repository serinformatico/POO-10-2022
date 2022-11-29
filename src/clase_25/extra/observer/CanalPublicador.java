package material_extra.clase_25.observer;

import material_extra.clase_25.observer.suscriptores.Suscriptor;

import java.util.ArrayList;

public class CanalPublicador {
    private String tituloDelVideo;
    private ArrayList<Suscriptor> suscriptores = new ArrayList<>();

    public void suscribir(Suscriptor suscriptor) {
        this.suscriptores.add(suscriptor);
    }

    public void desuscribir(Suscriptor suscriptor) {
        this.suscriptores.remove(suscriptor);
    }

    private void notificar() {
        for (Suscriptor suscriptor : suscriptores) {
            suscriptor.notificar("No te pierdas el fascinante " + this.tituloDelVideo);
        }
    }

    public void subirNuevoVideo(String titulo) {
        this.tituloDelVideo = titulo;
        notificar();
    }
}
