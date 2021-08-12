package model.vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//VO's
public class Requerimiento_1 {

    private int numeros_lideres;
    private String ciudad;

    public Requerimiento_1(int numeros_lideres, String ciudad) {
        this.numeros_lideres = numeros_lideres;
        this.ciudad = ciudad;
    }

    public int getNumeros_lideres() {
        return numeros_lideres;
    }

    public void setNumeros_lideres(int numeros_lideres) {
        this.numeros_lideres = numeros_lideres;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}