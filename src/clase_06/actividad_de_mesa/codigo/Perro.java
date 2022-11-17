package clase_06.actividad_de_mesa.codigo;

import java.time.LocalDateTime;

    /* Ejercicio: Clases, atributos y responsabilidades
        Objetivo
        Identificar, modelar e implementar en Java la clase involucrada en siguiente enunciado
        especificando sus atributos, responsabilidades, al menos dos constructores y los
        correspondientes getters, y setters.

        Contexto: Para una institución que adopta perros se requiere tener de ellos: si están en
        adopción o no, raza, año aproximado de nacimiento, peso, si tiene o no chip, si está o no
        lastimado y el nombre de pila que le asignaron en la institución.

        Deberemos poder preguntar la edad de un perro y si es un perro factible de perderse
        —entendiendo que los perros que tienen chip son los que no se pueden perder—. Por otro
        lado, se puede enviar a adopción a un perro si no está lastimado y su peso es mayor a 5.45
        kg.
    */

public class Perro {

    // Atributos o propiedades privadas
    private String nombre;
    private String raza;
    private double peso;
    private int anioDeNacimiento;
    private boolean estaEnAdopcion;
    private boolean estaLastimado;
    private boolean tieneChip;


    // Constructor 1
    public Perro (String nombre) {
        this.nombre = nombre;
    }

    // Constructor 2
    public Perro(String nombre, String raza, double peso, int anioDeNacimiento) {
        this.nombre            = nombre;
        this.raza              = raza;
        this.peso              = peso;
        this.anioDeNacimiento  = anioDeNacimiento;
        this.estaEnAdopcion    = false;
        this.estaLastimado     = false;
        this.tieneChip         = false;
    }


    // Métodos Getters
    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public double getPeso() {
        return peso;
    }

    public boolean getEstaEnAdopcion() {
        return estaEnAdopcion;
    }

    public boolean getEstaLastimado() {
        return estaLastimado;
    }


    // Métodos Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAnioDeNacimiento(int anioDeNacimiento) {
        this.anioDeNacimiento = anioDeNacimiento;
    }

    public void setEstaEnAdopcion(boolean estaEnAdopcion) {
        this.estaEnAdopcion = estaEnAdopcion;
    }

    public void setEstaLastimado(boolean estaLastimado) {
        this.estaLastimado = estaLastimado;
    }

    public void setTieneChip(boolean tieneChip) {
        this.tieneChip = tieneChip;
    }


    // Métodos públicos
    public int obtenerEdadAproximada(){
        return LocalDateTime.now().getYear() - anioDeNacimiento;
    }

    public boolean comprobarSiSePuedePerder(){
        return !this.tieneChip;
    }

    public void enviarAAdopcion(){
        if(!this.estaLastimado && this.peso > 5.45) {
            this.estaEnAdopcion = true;
        }
    }
}
