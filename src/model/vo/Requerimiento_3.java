package model.vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//VO's
public class Requerimiento_3 {

    private int idLider;
    private String nombre, primerApellido, SegundoApellido;

    public Requerimiento_3(int idLider, String nombre, String primerApellido, String segundoApellido) {
        this.idLider = idLider;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        SegundoApellido = segundoApellido;
    }

    public int getIdLider() {
        return idLider;
    }

    public void setIdLider(int idLider) {
        this.idLider = idLider;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        SegundoApellido = segundoApellido;
    }
}
