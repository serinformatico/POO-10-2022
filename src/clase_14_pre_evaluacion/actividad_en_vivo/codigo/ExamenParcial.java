package clase_14_pre_evaluacion.actividad_en_vivo.codigo;

public class ExamenParcial extends Examen implements Cloneable {

    private int numeroDeUnidadATomar;
    private int numeroDeReintentos;

    public ExamenParcial(String titulo, String enunciado, Estudiante estudiante) {
        super(titulo, enunciado, estudiante);
        this.numeroDeReintentos = 1;
    }

    public boolean consultarEstadoDeAprobacion() {
        if (this.nota >= 4) {
            return true;
        } else {
            return false;
        }
    }

    public boolean determinarPosibilidadParaRecuperar() {
        if (this.numeroDeUnidadATomar <= 3 && this.numeroDeReintentos < 3) {
            this.numeroDeReintentos++;
            return true;
        } else if (this.numeroDeUnidadATomar > 3 && this.numeroDeReintentos < 2) {
            this.numeroDeReintentos++;
            return true;
        } else {
            return false;
        }
    }

    public int getNumeroDeUnidadATomar() {
        return numeroDeUnidadATomar;
    }

    public int getNumeroDeReintentos() {
        return numeroDeReintentos;
    }

    public void setNumeroDeUnidadATomar(int numeroDeUnidadATomar) {
        this.numeroDeUnidadATomar = numeroDeUnidadATomar;
    }

    public void setNumeroDeReintentos(int numeroDeReintentos) {
        this.numeroDeReintentos = numeroDeReintentos;
    }

    public ExamenParcial clone() {
        return new ExamenParcial(this.titulo, this.enunciado, this.estudiante);
    }
}
