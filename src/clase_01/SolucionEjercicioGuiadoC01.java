package clase_01;

public class SolucionEjercicioGuiadoC01 {
    public static void main(String[] args) {

        /* Ejercicio 1:
            El granjero tiene un caballo Blanco que usa para tirar de un carro, hace dos años que lo
            tiene y espera que lo ayude en su trabajo diario. El caballo Braulio (así es su nombre) come
            más de lo que produce: 1250.40 pesos semanales. Pero a pesar de eso, lo conservará
            porque la raza de caballos criollos es muy noble.
            ¿Te parece que podrás hacer las variables que sirvan para que guardes la información que
            tenemos de Braulio?
        */

        String nombreDeCaballo = "Braulio";
        String razaDeCaballo   = "Criollo";
        double loQueProduce    = 1250.40;
        double loQueConsumo    = 1725.40;

        System.out.println("Nombre: " + nombreDeCaballo + " Raza: " + razaDeCaballo);
        System.out.println("Lo que produce: " + loQueProduce + " y los que consume: " + loQueConsumo);
        System.out.println("Deficit: " + (loQueProduce - loQueConsumo));
    }
}
