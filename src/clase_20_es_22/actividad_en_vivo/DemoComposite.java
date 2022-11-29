package clase_20_es_22.actividad_en_vivo;

import clase_20_es_22.actividad_en_vivo.productos.Ensalada;
import clase_20_es_22.actividad_en_vivo.productos.Gaseosa;
import clase_20_es_22.actividad_en_vivo.productos.PapaFrita;

public class DemoComposite {
    public static void main(String[] args) {

        Ensalada ensaladaCesar          = new Ensalada("César", 50.0);
        Gaseosa gaseosaPepsiCola        = new Gaseosa("Pepsi cola", 15.0);
        Gaseosa gaseosaFantaNaranja     = new Gaseosa("Fanta naranja", 12.0);
        PapaFrita papasFritas           = new PapaFrita("Papas fritas", 30.0);
        PapaFrita papasFritasConCheddar = new PapaFrita("Papas fritas con cheddar", 40.0);

        System.out.println("\nCOMBO 1:");
        ComboComposite combo1 = new ComboComposite();
        combo1.agregarProducto(ensaladaCesar);
        combo1.agregarProducto(gaseosaFantaNaranja);
        System.out.println("Precio combo1: USD" + combo1.calcularPrecio());

        System.out.println("\nCOMBO 2:");
        ComboComposite combo2 = new ComboComposite();
        combo2.agregarProducto(papasFritas);
        combo2.agregarProducto(gaseosaPepsiCola);
        System.out.println("Precio combo2: USD" + combo2.calcularPrecio());

        Carrito carrito = new Carrito();
        carrito.agregarProducto(papasFritasConCheddar);
        carrito.agregarProducto(combo1);
        carrito.agregarProducto(combo2);

        System.out.println("\nCARRITO:");
        System.out.println("Precio total de la compra: USD" + carrito.calcularTotalDeLaCompra());
;    }
}
