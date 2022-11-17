package clase_05.ppt.codigo;

public class DemoCoche {
    public static void main(String[] args) {

        Coche coche1 = new Coche(); // Crea una instancia
        coche1.marca = "Ford";
        coche1.modelo = "Fiesta";
        coche1.color = "Negro";
        coche1.anio = 2020;
        coche1.modelo.toUpperCase();
        coche1.precio = 1850700.00;
        coche1.encender();
        coche1.avanzar();
        coche1.frenar();

        Coche coche2 = new Coche(); // Crea una instancia
        coche2.marca = "Ford";
        coche2.modelo = "Mustang";
        coche2.color = "Azul";
        coche2.anio = 2010;
        coche2.precio = 9550200.00;
        coche2.encender();
        coche2.avanzar();
        coche2.frenar();
    }
}


