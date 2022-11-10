package clase_10.actividad_de_mesa.codigo;

public class DemoJuegoDeNave {
    public static void main(String[] args) {

        Nave miNave          = new Nave(100, 50, 'N', 99.0);
        Nave naveEnemiga1    = new Nave(35, 70, 'S', 55.0);
        Nave naveEnemiga2    = new Nave(50, 20, 'S', 75.0);
        Asteroide asteroide1 = new Asteroide(100, 35, 'O', -1);
        Asteroide asteroide2 = new Asteroide(50, 50, 'E', -1);

        System.out.println("\nNAVE ENEMIGA 1");
        naveEnemiga1.irA(100, 100, 'E');
        naveEnemiga1.girar('E');

        System.out.println("\nNAVE ENEMIGA 2");
        naveEnemiga2.irA(100, 100, 'O');
        naveEnemiga2.girar('O');
        asteroide1.irA(100, 85, 'E');
        asteroide2.irA(50, 100, 'O');

        System.out.println("\nMI NAVE");
        miNave.irA(85, 100, 'N');
        miNave.girar('E');
        miNave.restarVida();
    }
}
