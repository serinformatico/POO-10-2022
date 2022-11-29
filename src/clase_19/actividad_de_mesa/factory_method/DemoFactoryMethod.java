package clase_19.actividad_de_mesa.factory_method;

import clase_19.actividad_de_mesa.factory_method.productos.Caja;
import clase_19.actividad_de_mesa.factory_method.productos.Pelota;
import clase_19.actividad_de_mesa.factory_method.productos.Producto;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoFactoryMethod {
    public static void main(String[] args) {

        Almacen dhAlmacen                           = new Almacen();
        ProductoFactoryMethod productoFactoryMethod = new ProductoFactoryMethod();

        Caja caja10  = (Caja) productoFactoryMethod.crearProducto("CAJA10X10");
        caja10.setPeso(7.55);
        System.out.println(caja10.toString());

        Pelota pelotaDeFutbol = (Pelota) productoFactoryMethod.crearProducto("PELOTAFUTBOL");
        pelotaDeFutbol.setPeso(0.35);
        System.out.println(pelotaDeFutbol.toString());

        Pelota pelotaDeTenis = (Pelota) productoFactoryMethod.crearProducto("PELOTATENIS");
        pelotaDeTenis.setPeso(0.12);
        System.out.println(pelotaDeTenis.toString());

        dhAlmacen.setProductos(new ArrayList<Producto>(Arrays.asList(caja10, pelotaDeFutbol, pelotaDeTenis)));

        System.out.println("Espacio necesario: " + String.format("%.1f", dhAlmacen.calcularEspacioNecesario()) + "cm3");
      }
}
