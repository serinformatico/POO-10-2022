package clase_21_adaptada.actividad_en_vivo;

import clase_21_adaptada.actividad_en_vivo.productos.*;

public class ProductoFactoryMethodSingleton {

    private static ProductoFactoryMethodSingleton instancia;

    private ProductoFactoryMethodSingleton() {}

    public static ProductoFactoryMethodSingleton obtenerInstancia(){
        if (ProductoFactoryMethodSingleton.instancia == null) {
            ProductoFactoryMethodSingleton.instancia = new ProductoFactoryMethodSingleton();
        }

        return ProductoFactoryMethodSingleton.instancia;
    }

    public Producto crearProducto(String tipo){
        switch (tipo){
            case "TELA":
                return new Tela();
            case "BOTON":
                return new Boton();
            case "HILO":
                return new Hilo();
            case "PRENDA":
                return new PrendaDeVestirComposite();
        }

        return null;
    }
}
