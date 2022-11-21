package clase_16.extra.collection.list.array_list;

import clase_16.extra.collection.Libro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Programa_c16_array_list {
    public static void main(String[] args) {
        // CARACTERISTICAS:
        //      Implementa la interface List (java.util).
        //      Usa un array de tamaño dinámico (índices).
        //      Permite elementos duplicados.
        //      Mantiene el orden de inserción o posición.
        //      Es muy eficiente para acceder a un elemento.
        //      Es poco eficiente para agregar o eliminar elementos.
        //      Métodos más importantes:
        //          add(Object o)
        //          add(Object o, int pos)
        //          remove(Object o)
        //          remove(int pos)
        //          get(int pos)
        //          size()

        Libro libro1 = new Libro("POO", 2022, 1177500102);
        Libro libro2 = new Libro("Base de datos I", 2021, 1177500101);
        Libro libro3 = new Libro("Base de datos II", 2022, 1177500105);
        Libro libro4 = new Libro("Backend I", 2018, 1177500105);

        ArrayList<Libro> libros = new ArrayList();
        libros.add(libro1);
        libros.add(libro4);
        libros.add(libro2);
        libros.add(libro1);
        libros.add(libro3);

        // Acceso a un elemento
        System.out.println("\nAcceso a un elemento:");
        libros.get(2).toString();

        // Acceso a cada uno de los elementos con for
        System.out.println("\nAcceso a cada uno de los elementos con for:");
        for (int i = 0; i < libros.size(); i++) {
            System.out.println(libros.get(i).toString());
        }

        // Acceso a cada uno de los elementos con forEach
        System.out.println("\nAcceso a cada uno de los elementos con forEach:");
        for (Libro libro : libros) {
            System.out.println(libro.toString());
        }

        // Acceso a cada uno de los elementos con while
        System.out.println("\nAcceso a cada uno de los elementos con while:");
        int j = 0;
        while (j < libros.size()) {
            System.out.println(libros.get(j).toString());
            j++;
        }

        // Acceso a cada uno de los elementos con Iterator
        System.out.println("\nAcceso a cada uno de los elementos con Iterator:");
        Iterator iterator = libros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }

        // Ordenamiento de la lista (menor a mayor)
        System.out.println("\nOrdenamiento de la lista por ISBN como criterio (menor a mayor):");
        Collections.sort(libros);
        for (Libro libro : libros) {
            System.out.println(libro.toString());
        }

        // Ordenamiento de la lista (mayor a menor)
        System.out.println("\nOrdenamiento de la lista por ISBN como criterio (mayor a menor):");
        Collections.sort(libros);
        Collections.reverse(libros);
        for (Libro libro : libros) {
            System.out.println(libro.toString());
        }
    }
}
