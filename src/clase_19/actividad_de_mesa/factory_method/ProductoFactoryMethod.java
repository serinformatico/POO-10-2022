package clase_19.actividad_de_mesa.factory_method;

import clase_19.actividad_de_mesa.factory_method.productos.Caja;
import clase_19.actividad_de_mesa.factory_method.productos.Pelota;
import clase_19.actividad_de_mesa.factory_method.productos.Producto;

public class ProductoFactoryMethod {

    // Métodos públicos responsables de crear objetos
    public Producto crearProducto(String tipo) {
        switch (tipo.toUpperCase()){
            case "CAJA10X10":
                return new Caja(10, 10 , 10);
            case "PELOTAFUTBOL":
                return new Pelota(11);
            case "PELOTATENIS":
                return new Pelota(3.2);
        }

        return null;
    }
}
