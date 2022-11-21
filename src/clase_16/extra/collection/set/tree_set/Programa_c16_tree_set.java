package clase_16.extra.collection.set.tree_set;

import clase_16.extra.collection.Libro;
import java.util.TreeSet;

public class Programa_c16_tree_set {
    public static void main(String[] args) {
        // CARACTERISTICAS:
        //      Implementa la interface Set (java.util).
        //      Los objetos almacenados deben implementar la interface Comparable.
        //      Es un árbol de objetos (internamente, usa una instancia de TreeMap).
        //      No Permite objetos duplicados ni valores nulos.
        //      Mantiene el orden de inserción (permite ordenar por comparación).
        //      Es menos eficiente para acceder, agregar o eliminar un objeto.
        //      Métodos más importantes:
        //          add(Object o)
        //          remove(Object o)
        //          size()

        Libro libro1 = new Libro("POO", 2022, 1177500102);
        Libro libro2 = new Libro("Base de datos I", 2021, 1177500101);
        Libro libro3 = new Libro("Base de datos II", 2022, 1177500105);
        Libro libro4 = new Libro("Backend I", 2018, 1177500105);

        TreeSet<Libro> libros = new TreeSet();
        libros.add(libro1);
        libros.add(libro1);     // lo ignora.
        libros.add(libro2);
        libros.add(libro3);
        libros.add(libro4);     // lo ignora.
        libros.add(new Libro());
        //libros.add(null);     // Se rompe.

        // Acceso a un elemento
        System.out.println("\nAcceso a un elemento:");
        for (Libro libro : libros) {
            if (libro.getIsbn() == 1177500101) {
                System.out.println(libro.toString());
            }
        }

        // Acceso a cada uno de los elementos
        System.out.println("\nAcceso a cada uno de los elementos:");
        for (Libro libro : libros) {
            System.out.println(libro.toString());
        }
    }
}
