package model.vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lider {

    private int id, clasificacion;
    private String nombre, primerApellido, segundoApellido, ciudad, cargo, documentoIdentidad;
    private Double salario;
    private Date fechaNacimiento;

    public Lider(int id, int clasificacion, String documentoIdentidad, String nombre, String primerApellido, String segundoApellido, String ciudad, String cargo, Double salario, String fechaNacimiento) throws ParseException {
        this.id = id;
        this.clasificacion = clasificacion;
        this.documentoIdentidad = documentoIdentidad;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.ciudad = ciudad;
        this.cargo = cargo;
        this.salario = salario;

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        this.fechaNacimiento = format.parse(fechaNacimiento);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
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
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
