package clase_16.extra.collection.list.linked_list;

import clase_16.extra.collection.Libro;

import java.util.Collections;
import java.util.LinkedList;

public class Programa_c16_linked_list {
    public static void main(String[] args) {
        // CARACTERISTICAS:
        //      Implementa la interface List (java.util).
        //      Usa una lista doblemente enlazada (nodos).
        //      Permite elementos duplicados.
        //      Mantiene el orden de inserción o posición.
        //      *Es eficiente para acceder a un elemento.
        //      *Es muy eficiente para agregar o eliminar elementos.
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

        LinkedList<Libro> libros = new LinkedList();
        libros.add(libro4);
        libros.add(libro1);
        libros.add(libro1);
        libros.add(libro3);
        libros.add(libro2);

        // Acceso a un elemento
        System.out.println("\nAcceso a un elemento:");
        libros.get(2).toString();

        // Acceso a cada uno de los elementos
        System.out.println("\nAcceso a cada uno de los elementos:");
        for (int i = 0; i < libros.size(); i++) {
            System.out.println(libros.get(i).toString());
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
