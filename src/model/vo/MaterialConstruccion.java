package model.vo;

import java.util.Date;

public class MaterialConstruccion {
    private int id;
    private String nombre, importado;
    private Double precioUnidad;

    /**
     * Otros atributos
     */
    private int cantidad = 0;

    public MaterialConstruccion(int id, String nombre, String importado, Double precioUnidad) {
        this.id = id;
        this.nombre = nombre;
        this.importado = importado;
        this.precioUnidad = precioUnidad;
    }

    public MaterialConstruccion(int id, String nombre, String importado, Double precioUnidad, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.importado = importado;
        this.precioUnidad = precioUnidad;
        this.setCantidad(cantidad);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImportado() {
        return importado;
    }

    public void setImportado(String importado) {
        this.importado = importado;
    }

    public Double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(Double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
