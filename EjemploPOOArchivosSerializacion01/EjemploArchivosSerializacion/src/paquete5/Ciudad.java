package paquete5;

import java.io.Serializable;

public class Ciudad implements Serializable{

    private String nombreCiudad;

    private String provinciaCiudad;

    public Ciudad(String n, String d) {
        nombreCiudad = n;
        provinciaCiudad = d;
    }

    public String obtenerNombreCiudad() {
        return nombreCiudad;
    }

    public void establecerNombreCiudad(String n) {
        nombreCiudad = n;
    }

    public String obtenerProvinciaCiudad() {
        return provinciaCiudad;
    }

    public void establecerProvinciaCiudad(String p) {
        provinciaCiudad = p;
    }

}
