package clase_04.actividad_de_mesa.ejercicio3;

import clase_04.actividad_de_mesa.ejercicio2.Cheque;

import java.time.LocalDate;

public class SolucionConsignaDeMesaC04_E3 {

    /* Ejercicio 3:
            Un día cualquiera de la veterinaria consiste en recibir al viejo labrador Ámbar, que viene
            con su dueña Anita. Lo está esperando en el consultorio 1 el doctor Julio para atenderlo,
            mientras vemos que sale del consultorio 2 el gatito Miluz, que tiene 3 meses. Cada
            veterinario tiene un consultorio asignado. Como siempre, a cada mascota se la pesa, mide
            y registra el estado general (regular, bueno o muy bueno). Los clientes pagan la consulta a
            fin de mes, por lo que se les va acumulando el importe de las consultas y cuántas fueron.

            Actividad
            Hay que identificar en el texto cuáles son las clases que se presentan en la narrativa.
            Dibujarlas en un diagrama de clases con atributos, métodos y constructores adecuados.
    */

    public static void main(String[] args) {

        Veterinario veterinario1 = new Veterinario("Julio", "Aguilar", 1);
        Cliente propietario1 = new Cliente("Anita", "Medina");
        Mascota mascota1 = new Mascota(propietario1, "Ámbar", "Perro", "labrador");
        mascota1.pesar(29.540);
        mascota1.medir(60.5, 52.0, 22.5);
        mascota1.diagnosticar("Bueno");

        Veterinario veterinario2 = new Veterinario("Maria", "Aguilar", 2);
        Cliente propietario2 = new Cliente("Anita", "Medina");
        Mascota mascota2 = new Mascota(propietario2, "Miluz", "Gato", "Bombay");
        mascota2.pesar(4.250);
        mascota2.medir(23, 45, 7.5);
        mascota2.diagnosticar("Muy bueno");
    }
}
