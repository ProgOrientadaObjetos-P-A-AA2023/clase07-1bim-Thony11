/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

public class Profesor {

    private String nombre;
    private String tipo;

    public Profesor(String n, String t) {
        nombre = n;
        tipo = t;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerTipo(String n) {
        tipo = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        String mensaje = String.format("%s - %s", nombre, tipo);
        return mensaje;
    }

}