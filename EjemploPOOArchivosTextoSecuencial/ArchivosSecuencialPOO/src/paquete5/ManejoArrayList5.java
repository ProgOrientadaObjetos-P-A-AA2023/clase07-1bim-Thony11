/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

import java.util.ArrayList;
import java.util.Arrays;
import paquete1.Profesor2;

public class ManejoArrayList5 {

    public static void main(String[] args) {
        String[] lineas = {"Tara Hernandez|contratado|30",
            "Luis Andrade|factura|35", "Ana Juarez|nombramiento|40"};

        ArrayList<Profesor2> pro2 = new ArrayList<>();

        for (String linea : lineas) {
            ArrayList<String> lineaPartes = new ArrayList<>(Arrays.asList(linea.split("\\|")));
            int anios = Integer.parseInt(lineaPartes.get(2));
            Profesor2 p2 = new Profesor2(lineaPartes.get(0), lineaPartes.get(1), anios);
            pro2.add(p2);
        }
        
        for (int i = 0; i < pro2.size(); i++) {
            System.out.println(pro2.get(i));
        }
    }
}
