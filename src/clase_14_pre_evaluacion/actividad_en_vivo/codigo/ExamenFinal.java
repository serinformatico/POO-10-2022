package clase_14_pre_evaluacion.actividad_en_vivo.codigo;

public class ExamenFinal extends Examen implements  Comparable<ExamenFinal>{

    private double notaOral;
    private String descripcionDelTemaDado;

    public ExamenFinal(String titulo, String enunciado, Estudiante estudiante) {
        super(titulo, enunciado, estudiante);
    }

    public boolean consultarEstadoDeAprobacion() {
        if (this.nota >= 4 && this.notaOral >= 4) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(ExamenFinal examenFinal) {
        double promedioThis  = (this.nota + this.notaOral) / 2;
        double promedioParam = (examenFinal.getNota() + examenFinal.getNotaOral()) / 2;
        if (promedioThis > promedioParam) {
            return 1;
        } else if (promedioThis < promedioParam) {
            return -1;
        } else {
            return 0;
        }
    }

    public double getNotaOral() {
        return notaOral;
    }

    public String getDescripcionDelTemaDado() {
        return descripcionDelTemaDado;
    }

    public void setNotaOral(double notaOral) {
        this.notaOral = notaOral;
    }

    public void setDescripcionDelTemaDado(String descripcionDelTemaDado) {
        this.descripcionDelTemaDado = descripcionDelTemaDado;
    }
}
