package clase_16.actividad_de_mesa.codigo;

public class Main {
    public static void main(String[] args) {

        //Creo variables y lleno el puerto con contenedores
        Puerto puerto = new Puerto();
        puerto.permiteEntrada(new Contenedor(3,"Desconocida", true));
        puerto.permiteEntrada(new Contenedor(1,"Argentina", false));
        puerto.permiteEntrada(new Contenedor(2,"Desconocida", false));

        //Agrego un contenedor
        puerto.permiteEntrada(new Contenedor(0,"Colombia", true));

        //Imprimo la cantidad de contenedores de procedencia Desconocida que tienen materiales peligrosos -> 1
        System.out.println("");
        System.out.println("Cantidad de contenedores peligrosos desconocidos: " + puerto.contenedoresPeligrosos());
        System.out.println("");

        //Muestro todos los contenedores ordenados por el codigo de cada uno
        puerto.mostrarContenedores();
    }
}
