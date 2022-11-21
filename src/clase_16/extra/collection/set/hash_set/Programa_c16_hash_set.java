package clase_16.extra.collection.set.hash_set;

import clase_16.extra.collection.Libro;

import java.util.HashSet;

public class Programa_c16_hash_set {
    public static void main(String[] args) {
        // CARACTERISTICAS:
        //      Implementa la interface Set (java.util).
        //      Es un conjunto de objetos (internamente, usa una instancia de HashMap).
        //      No Permite objetos duplicados ni valores nulos.
        //      No mantiene el orden de inserción (no tiene un metodo get()).
        //      Es más eficiente para acceder, agregar o eliminar un objeto.
        //      Métodos más importantes:
        //          add(Object o)
        //          remove(Object o)
        //          size()

        Libro libro1 = new Libro("POO", 2022, 1177500102);
        Libro libro2 = new Libro("Base de datos I", 2021, 1177500101);
        Libro libro3 = new Libro("Base de datos II", 2022, 1177500105);
        Libro libro4 = new Libro("Backend I", 2018, 1177500105);

        HashSet<Libro> libros = new HashSet();
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
