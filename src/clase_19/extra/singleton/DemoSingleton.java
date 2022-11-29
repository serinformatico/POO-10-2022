package clase_19.extra.singleton;

public class DemoSingleton {
    public static void main(String[] args) {

        //BaseDeDatosSingleton conexionBaseDeDatos = new BaseDeDatosSingleton(); // No se puede utilizar por que es de acceso privado

        BaseDeDatosSingleton conexionBaseDeDatos = BaseDeDatosSingleton.obtenerInstancia();

        System.out.println(conexionBaseDeDatos.abrirConexion());
        System.out.println(conexionBaseDeDatos.cerrarConexion());
    }
}
