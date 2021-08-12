package model.vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//VO's
public class Compra {

    private int id, cantidad, idProyecto, idMaterialConstruccion;
    private String proveedor, Pagado;
    private Date fecha;

    public Compra(int id, int cantidad, int idProyecto, int idMaterialConstruccion, String proveedor, String pagado, String fecha) throws ParseException {
        this.id = id;
        this.cantidad = cantidad;
        this.idProyecto = idProyecto;
        this.idMaterialConstruccion = idMaterialConstruccion;
        this.proveedor = proveedor;
        this.Pagado = pagado;

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format.parse(fecha); // mysql datetime format
        this.fecha = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public int getIdMaterialConstruccion() {
        return idMaterialConstruccion;
    }

    public void setIdMaterialConstruccion(int idMaterialConstruccion) {
        this.idMaterialConstruccion = idMaterialConstruccion;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getPagado() {
        return Pagado;
    }

    public void setPagado(String pagado) {
        Pagado = pagado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
