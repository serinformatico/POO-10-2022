package clase_05.setters_getters_statics.codigo;

public class DemoCochePro {

    /* Conceptos:
        Las constantes se escriben con mayúsculas en su totalidad y se definen con la cláusula “final”.
        Además, el valor que almacenan es inmodificable. Cabe aclarar que, estas se encajan al objeto.

        Los atributos y métodos estáticos son miembros de la clase, es decir, que están encajadas a la
        estructura de la clase y no al objeto. En este caso, el valor que almacenan es modificable.

        Un getter es un método que se utiliza para obtener el valor de un atributo y en su nombre debe
        contener la palabra “get”. Un Setter es un método que se emplea para asignar un valor a un atributo
        y en su nombre debe contener la palabra “set”. Cada atributo puede tener un método “getter”
        o un “setter” o ambos. Siempre se declaran como públicos.

        El método nextLine() de Scanner puede capturar oraciones a diferencia del método next()
        que solo captura la primera palabra de una oración. Esto se debe a que next() usa por
        defecto un delimitador que es el espacio. El delimitador se puede cambiar si fuese necesario.
    */

    public static void main(String[] args) {

        System.out.println("Porcentaje de descuento: " + CochePro.porcentajeDeDescuento);
        CochePro.porcentajeDeDescuento = 30;
        System.out.println("Nuevo porcentaje de descuento: " + CochePro.porcentajeDeDescuento);

        CochePro cochePro1 = new CochePro("Ford", "Fiesta", "Negro", 2020); // Crea una instancia
        cochePro1.encender();
        cochePro1.avanzar();
        cochePro1.frenar();

        System.out.println("Marca de coche 1: " + cochePro1.getMarca());
        System.out.println("Alícuota IVA: " + cochePro1.IVA);
        System.out.println("Precio de coche 1: " + cochePro1.calcularPrecio(1000.0, (50.0 - CochePro.porcentajeDeDescuento)));

        CochePro cochePro2 = new CochePro("Fiat", "Mustang", "Azul", 2010); // Crea una instancia
        cochePro2.setMarca("Ford"); // Re-asigno un nuevo valor
        cochePro2.encender();
        cochePro2.avanzar();
        cochePro2.frenar();

        System.out.println("Marca de coche 2: " + cochePro2.getMarca());
        System.out.println("Alícuota IVA: " + cochePro2.IVA);
        System.out.println("Precio de coche 2: " + cochePro2.calcularPrecio(1700.0, (35.0 - CochePro.porcentajeDeDescuento)));
    }
}


