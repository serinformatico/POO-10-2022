package clase_11.impresora.codigo;

import java.util.Date;

public class ImpresoraCannon extends Impresora {

    // Métodos públicos redefinidos
    public boolean necesitaTinta() {
        // Lógica propia para determinar la necesidad de más tinta
        return this.getPorcentajeTinta() <= 0.0;
    }


    // Definición del método imprimir() (está declarado en la superclase)
    public String imprimir() {
        if (this.tienePapel() == true && this.necesitaTinta() == false){
            return "Imprimiendo...";
        } else {
            return "Esta faltando papel o tinta...";
        }
    }
}
