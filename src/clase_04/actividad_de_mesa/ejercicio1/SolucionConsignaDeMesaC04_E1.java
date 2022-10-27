package clase_04.actividad_de_mesa.ejercicio1;

public class SolucionConsignaDeMesaC04_E1 {

    /* Ejercicio 1:
            El tío Rico tiene dinero guardado en el banco Digital Bank, cada vez que retira un poco de
            su cuantiosa fortuna, verifica exactamente que el nombre que figura como titular de la caja
            de ahorros sea el suyo, que no le falte un centavo de su saldo y que el número sea el
            correcto. Recién empezó a operar con la página web.
            Su banco le permite retirar, depositar y recibir transferencias (a su CBU). Para ello, precisa
            que le indiquen su saldo, el titular, su CBU y alias. Cuando abrió su cuenta de caja de
            ahorro, le pidieron su nombre y saldo inicial. Con el número que le tocó, la crearon.

            Actividad
            Modelar la clase caja de ahorros para que pueda ser utilizada en un programa del banco.
            Agregar atributos o métodos si te parece que faltan.
    */

    public static void main(String[] args) {

        CajaDeAhorro cajaDeAhorro = new CajaDeAhorro(12547, "Pablo Alberto Rico", "30258855471254821542", "tio.rico", 1000.0);
        cajaDeAhorro.retirar(500);
        cajaDeAhorro.depositar(250);
        cajaDeAhorro.transferencia(400);
        cajaDeAhorro.transferencia(450);
    }
}
