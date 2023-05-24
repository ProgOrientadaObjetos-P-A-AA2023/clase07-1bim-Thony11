/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete1.Calificacion;
import paquete1.Profesor2;

public class Ejecutor {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "calificaciones2.txt";

        Calificacion c1 = new Calificacion(10, "Computación");
        Calificacion c2 = new Calificacion(9, "Lógica");
        Calificacion c3 = new Calificacion(8, "Literatura");

        Profesor2 profesor1 = new Profesor2("Tara Hernandez", "contratado");
        Profesor2 profesor2 = new Profesor2("Gregory Walsh", "nombramiento");
        Profesor2 profesor3 = new Profesor2("Kevin Page", "nombramiento");

        c1.establecerProfesor(profesor1);
        c2.establecerProfesor(profesor2);
        c3.establecerProfesor(profesor3);

        Calificacion[] lista = {c1, c2, c3};

        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);

        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistro(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }
       
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        System.out.println(lectura);
    }
}
