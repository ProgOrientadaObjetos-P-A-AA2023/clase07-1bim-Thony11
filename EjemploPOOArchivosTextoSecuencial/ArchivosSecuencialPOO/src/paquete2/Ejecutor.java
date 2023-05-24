/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Profesor2;

public class Ejecutor {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "profesores2.txt";
        
        Profesor2 profesor1 = new Profesor2("Tara Hernandez", "contratado");
        Profesor2 profesor2 = new Profesor2("Gregory Walsh", "nombramiento");
        Profesor2 profesor3 = new Profesor2("Kevin Page", "nombramiento");
        
        
        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);
        
        // establecer el valor del atributo registro
        archivo.establecerRegistro(profesor1);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();
        
        // establecer el valor del atributo registro
        archivo.establecerRegistro(profesor2);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();
            
        // establecer el valor del atributo registro
        archivo.establecerRegistro(profesor3);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();
        
        // proceso para lectura del archivo
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        // System.out.println(lectura.toString());
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}
