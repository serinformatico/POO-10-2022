package clase_16.extra.map;

import java.util.Objects;

public class Materia implements Comparable<Materia>{
    private int codigo;
    private String nombre;
    private int bimestre;

    public Materia(){ }

    public Materia(int codigo, String nombre, int bimestre) {
        this.codigo   = codigo;
        this.nombre   = nombre;
        this.bimestre = bimestre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBimestre() {
        return bimestre;
    }

    public void setBimestre(int bimestre) {
        this.bimestre = bimestre;
    }

    @Override
    public int compareTo(Materia materia) {
        if (this.codigo < materia.getCodigo()) {
            return -1;
        }

        if (this.codigo > materia.getCodigo()) {
            return 1;
        }

        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Materia materia = (Materia) o;

        return codigo == materia.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Materia: (" +
                "Código=" + codigo +
                ", nombre=" + nombre +
                ", bimestre=" + bimestre + ").";
    }
}
