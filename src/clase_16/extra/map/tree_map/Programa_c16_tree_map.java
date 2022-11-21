package clase_16.extra.map.tree_map;

import clase_16.extra.map.Materia;

import java.util.Map;
import java.util.TreeMap;

public class Programa_c16_tree_map {
    public static void main(String[] args) {
        // CARACTERISTICAS:
        //      Implementa la interface Map (java.util).
        //      Los objetos almacenados deben implementar la interface Comparable.
        //      Es un conjunto de pares clave/valor.
        //      No permite claves duplicadas ni nulas.
        //      Permite valores duplicados o nulos.
        //      Mantiene el orden de inserción (permite ordenar por comparación).
        //      Es menos eficiente para acceder, agregar o eliminar un objeto que HashMap y LinkedHashMap.
        //      Requiere de equals() y hashCode() para sobrescribir.
        //      Métodos más importantes:
        //          put(Object key, Object value)
        //          get(Object key)
        //          remove(Object key)
        //          size()

        Materia materia1 = new Materia(10055, "Programación orientada a objetos", 2);
        Materia materia2 = new Materia(10050, "Base de datos I", 1);
        Materia materia3 = new Materia(10060, "Fontend I", 1);
        Materia materia4 = new Materia(10060, "Backend", 3);

        Map<String, Materia> materias = new TreeMap();
        materias.put("materia0", materia1);
        materias.put("materia1", materia1);
        materias.put("materia2", materia2);
        materias.put("materia3", materia3);
        materias.put("materia4", materia4);
        materias.put("materia5", materia4);      // Lo sobrescribe
        materias.put("materia5", new Materia());
        //materias.put(null, null);              // Rompe.

        // Acceso a un elemento
        System.out.println("\nAcceso a un elemento:");
        System.out.println(materias.get("materia1").toString());


        // Acceso a cada uno de los elementos
        System.out.println("\nAcceso a cada uno de los elementos:");
        for (Map.Entry<String, Materia> entry : materias.entrySet()) {
            if (entry.getKey() != null) {
                System.out.println(entry.getValue().toString());
            } else {
                System.out.println("Clave: " + entry.getKey() + " Valor: " + entry.getValue());
            }
        }
    }
}
