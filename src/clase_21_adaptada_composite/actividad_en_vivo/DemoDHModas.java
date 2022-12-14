package clase_21_adaptada.actividad_en_vivo;

import clase_21_adaptada.actividad_en_vivo.productos.*;

public class DemoDHModas {
    public static void main(String[] args) {

        ProductoFactoryMethodSingleton creador = ProductoFactoryMethodSingleton.obtenerInstancia();

        System.out.println("\nRASO:");
        Tela razoBlanco = (Tela) creador.crearProducto("TELA");
        razoBlanco.setNombre("Raso");
        razoBlanco.setColor("Blanco");
        razoBlanco.setCosto(1250.0);
        System.out.println("Precio $" + razoBlanco.calcularPrecio());

        System.out.println("\nSEDA:");
        Tela sedaRosa = (Tela) creador.crearProducto("TELA");
        sedaRosa.setNombre("Seda");
        sedaRosa.setColor("Rosa");
        sedaRosa.setCosto(950.0);
        System.out.println("Precio $" + sedaRosa.calcularPrecio());

        System.out.println("\nBOTON:");
        Boton botonGrande = (Boton) creador.crearProducto("BOTON");
        botonGrande.setNombre("Botón Grande");
        botonGrande.setColor("Dorado");
        botonGrande.setCosto(150.0);
        System.out.println("Precio $" + botonGrande.calcularPrecio());

        System.out.println("\nHILO DE SEDA:");
        Hilo hiloDeSeda = (Hilo) creador.crearProducto("HILO");
        hiloDeSeda.setNombre("Hilo");
        hiloDeSeda.setColor("Blanco");
        hiloDeSeda.setCosto(220.0);
        System.out.println("Precio $" + hiloDeSeda.calcularPrecio());

        System.out.println("\nHILO DE RASO:");
        Hilo hiloDeRaso = (Hilo) creador.crearProducto("HILO");
        hiloDeRaso.setNombre("Hilo");
        hiloDeRaso.setColor("Negro");
        hiloDeRaso.setCosto(175.0);
        System.out.println("Precio $" + hiloDeRaso.calcularPrecio());

        System.out.println("\nVESTIDO DE NOVIA:");
        PrendaDeVestirComposite vestidoDeNovia = (PrendaDeVestirComposite) creador.crearProducto("PRENDA");
        vestidoDeNovia.setNombre("Vestido de novia");
        vestidoDeNovia.setCostoDeManoDeObra(7500.0);
        vestidoDeNovia.agregarMaterial(razoBlanco);
        vestidoDeNovia.agregarMaterial(sedaRosa);
        vestidoDeNovia.agregarMaterial(hiloDeSeda);
        System.out.println("Materiales: " + vestidoDeNovia.mostrarMateriales());
        System.out.println("Precio $" + vestidoDeNovia.calcularPrecio());

        Boleta boleta = new Boleta();
        boleta.agregarProducto(vestidoDeNovia);
        boleta.agregarProducto(botonGrande);
        boleta.agregarProducto(hiloDeRaso);
        System.out.println("Precio Total $" + boleta.calcularTotal());
        System.out.println("Productos: " + boleta.mostrarProductos());
        boleta.finalizar();
        System.out.println("¿Se ha finalizado la boleta? " + boleta.getEstaPagada());
    }
}
