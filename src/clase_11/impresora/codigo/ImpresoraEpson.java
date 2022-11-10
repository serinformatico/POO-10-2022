package clase_11.impresora.codigo;

public class ImpresoraEpson extends Impresora {

    // Definición del método imprimir() (está declarado en la superclase)
    public String imprimir() {
        if (this.tienePapel() == true && this.necesitaTinta() == false){
            return "Imprimiendo...";
        } else {
            return "Esta faltando papel o tinta...";
        }
    }
}
