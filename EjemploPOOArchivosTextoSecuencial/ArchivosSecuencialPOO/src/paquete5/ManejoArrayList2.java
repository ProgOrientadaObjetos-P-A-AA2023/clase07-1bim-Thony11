/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Profesor2;

/**
 *
 * @author reroes
 */
public class ManejoArrayList2 {
    public static void main(String[] args) {
        
        Profesor2 prof1 = new Profesor2("Joseph Jimenez", "facturado");
        Profesor2 prof2 = new Profesor2("David Jones", "nombramiento");
        
        // Arreglo
        Profesor2 [] profesores = new Profesor2[2];
        profesores[0] = prof1;
        profesores[1] = prof2;
        
        for (int i = 0; i < profesores.length; i++) {
        //    System.out.printf("%s - %s\n", profesores[i].obtenerNombre(),
        //            profesores[i].obtenerTipo());
        }
        
        System.out.println("-----------------------------");
        
        // ArrayList
        ArrayList <Profesor2> profesores2 = new ArrayList<>();
        profesores2.add(prof1); // 0
        profesores2.add(prof2); // 1
        
        // System.out.println(profesores2.get(1).obtenerTipo());
        
        Profesor2 temporal = profesores2.get(0);
        System.out.println(temporal.obtenerTipo());
        
        /*
        for (int i = 0; i < profesores2.size(); i++) {
            System.out.printf("%s - %s\n", profesores2.get(i).obtenerNombre(),
                    profesores2.get(i).obtenerTipo());
        }
        */
        
        System.out.println("-----------------------------");
        
        Profesor2 prof3 = new Profesor2("Melissa Gilbert", "contratado");
        Profesor2 prof4 = new Profesor2("Melissa J", "desconocido");
        Profesor2 prof5 = new Profesor2("Melissa M", "contratado");
        
        profesores2.add(prof3);
        profesores2.add(prof4);
        profesores2.add(prof5);
        
        for (int i = 0; i < profesores2.size(); i++) {
            System.out.printf("%s - %s\n", profesores2.get(i).obtenerNombre(),
                    profesores2.get(i).obtenerTipo());
        }
    }
}
