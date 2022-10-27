package clase_04.actividad_de_mesa.ejercicio2;

import java.time.LocalDate;

public class Cheque {

    // Atributos privados
    private String tipoCheque;
    private LocalDate fechaDeEmision;
    private LocalDate fechaDeVencimiento;
    private String beneficiario;
    private double monto;

    // Atributo público
    public String endosante;


    // Constructor
    public Cheque(String tipoCheque, LocalDate fechaDeVencimiento, String beneficiario, double monto) {
        this.tipoCheque         = tipoCheque;
        this.fechaDeEmision     = LocalDate.now();
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.beneficiario       = beneficiario;
        this.monto              = monto;
    }
}
