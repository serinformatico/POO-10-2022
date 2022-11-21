package clase_16.extra.collection;

import java.util.Comparator;
import java.util.Objects;

public class Libro implements Comparable<Libro>, Comparator<Libro> {

    private String titulo;
    private int anio;
    private int isbn;

    public Libro(){ }

    public Libro(String titulo, int anio, int isbn) {
        this.titulo = titulo;
        this.anio   = anio;
        this.isbn   = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public int compareTo(Libro libro) {
        if (this.getIsbn() < libro.getIsbn()) {
            return -1;
        } else if (this.getIsbn() > libro.getIsbn()) {
            return 1;
        }

        return 0;
    }

    @Override
    public int compare(Libro libro1, Libro libro2) {
        return libro1.compareTo(libro2);
    }

    @Override
    public String toString() {
        return "Libro = titulo: " + titulo + ", año: " + anio + ", isbn: " + isbn;
    }
}
