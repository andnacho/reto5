package model.vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//VO's
public class Requerimiento_2 {

    private int idProyecto, idMaterialConstruccion;
    private String proveedor, pagado, nombreMaterial;

    public Requerimiento_2(int idProyecto, int idMaterialConstruccion, String proveedor, String pagado, String nombreMaterial) {
        this.idProyecto = idProyecto;
        this.idMaterialConstruccion = idMaterialConstruccion;
        this.proveedor = proveedor;
        this.pagado = pagado;
        this.nombreMaterial = nombreMaterial;
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
        return pagado;
    }

    public void setPagado(String pagado) {
        this.pagado = pagado;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }
}
