/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

public class Calificacion{

    private double nota;
    private double promedio;
    private String nombreMateria;
    private Profesor profesor;

    public Calificacion(double n, String nombre) {
        nota = n;
        nombreMateria = nombre;
        
    }

    public void establecerNota(double n) {
        nota = n;
    }

    public void establecerNombreMateria(String n) {
        nombreMateria = n;
    }
    
    public void establecerProfesor(Profesor n) {
        profesor = n;
    }
    
    public void calcularPromedio() {
        promedio = nota / 3;
    }

    public double obtenerNota() {
        return nota;
    }

    public String obtenerNombreMateria() {
        return nombreMateria;
    }
    
    public Profesor obtenerProfesor() {
        return profesor;
    }
    
    public double obtenerPromedio() {
        return promedio;
    }

    public void establecerProfesor(Profesor2 profesor1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}