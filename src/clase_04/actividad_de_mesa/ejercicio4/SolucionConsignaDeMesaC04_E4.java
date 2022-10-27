package clase_04.actividad_de_mesa.ejercicio4;

import clase_04.actividad_de_mesa.ejercicio3.Cliente;
import clase_04.actividad_de_mesa.ejercicio3.Mascota;
import clase_04.actividad_de_mesa.ejercicio3.Veterinario;

public class SolucionConsignaDeMesaC04_E4 {

    /* Ejercicio 3:
            La veterinaria requiere de un constante suministro de diferentes cajas de provisiones que
            son adquiridas para su posterior reventa o para ser utilizadas durante las operaciones en
            las consultas que ocurren en los consultorios. Estas cajas de provisiones tienen diferentes
            características entre las cuales podemos destacar: peso total, origen, nombre de
            proveedor, descripción del contenido y si tiene que ser tratada con cuidado en el caso de
            contener material frágil.

            Actividad
            Detectar los atributos y métodos que debería tener el objeto caja de provisiones,
            considerar agregar un correspondiente constructor y diagramar con UML.

    */

    public static void main(String[] args) {

        CajaDeProvision caja= new CajaDeProvision(12.5, "Argentina", "Sabrositos", "Alimento para perros");
        caja.validarEsFragil(false);

    }
}
