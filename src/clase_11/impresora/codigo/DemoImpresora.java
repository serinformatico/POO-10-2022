package clase_11.impresora.codigo;

public class DemoImpresora {
    public static void main(String[] args) {

        //Impresora impresora1 = new Impresora(); // No se puede crear una instancia de una clase abstracta

        ImpresoraEpson impresoraEpson   = new ImpresoraEpson();
        impresoraEpson.setModelo("EP1050");
        impresoraEpson.setTipoConexion("USB");
        impresoraEpson.setHojasDisponibles(10);
        impresoraEpson.setPorcentajeTinta(27.1);

        ImpresoraCannon impresoraCannon = new ImpresoraCannon();
        impresoraCannon.setModelo("C100NN");
        impresoraCannon.setTipoConexion("WIFI");
        impresoraCannon.setPorcentajeTinta(0.3);

        System.out.println("\nIMPRESORA EPSON");
        System.out.println("¿Necesita tinta? " + impresoraEpson.necesitaTinta());
        System.out.println("¿Tiene papel? " + impresoraEpson.tienePapel());
        System.out.println(impresoraEpson.imprimir());
        System.out.println(impresoraEpson.toString());
        System.out.println("hashcode: " + impresoraEpson.hashCode());

        System.out.println("\nIMPRESORA CANNON");
        System.out.println("¿Necesita tinta? " + impresoraCannon.necesitaTinta());
        System.out.println("¿Tiene papel? " + impresoraCannon.tienePapel());
        System.out.println(impresoraCannon.imprimir());
        System.out.println(impresoraCannon.toString());
        System.out.println("hashcode: " + impresoraCannon.hashCode());

        System.out.println("Epson es igual que Cannon: " + impresoraCannon.equals(impresoraEpson));
    }
}
